# kotlin_multimethod
Clojure-style Multimethods for Kotlin

In Clojure, a functional language that eschews classes in favor of using mostly maps and vectors, 
SOLID-compliant runtime polymorphism is achieved (in part) through the use of "multimethods". http://clojure.org/reference/multimethods

To simplify it a bit, multimethods are basically functions containing switch statements that you can add branches to at a later time.

This construct is incredibly useful if one is attempting to a) solve things function-first and b) design an extensible system without 
having to rely on inheritance.

### Brief user guide

Usage is simple- use defmulti to create a multimethod, and use defmethod (passing in the multimethod in question) to add new conditions.

Example- creating a new multimethod

    val muult = defmulti<String, String, Int> {
        dispatcher {
            it.length + 1
        }

        default {
            "the string is \"$it\""
        }
    }
    
The type parameter on the function corrisponds to Argument, Function Return, Dispatch Return. This holds for higher arities as well,
so that the last two type parameters always corrispond to Function Return and Dispatch Return, and every parameter before it are the
corrisponding argument parameters

Without using defmethod to add a new alternate function this will
act like any other function, and the behavior will be that of the function passed into 'default'.

In this case, the variable muult is typed as (String) -> String, and just like if I had directly declared the function
any string passed into it will be transformed into 'the string is "whatever-was-passed-in"'.

     println(muult("character"))
     => the string is "character"

The cool bit comes when you add new alternate functions.

     defmethod(muult, 10) {
        "nine-character string is $it"
    }
    
The defmethod function takes a multimethod object (a function returned from defmulti), an object to check against the return value
of the dispatch function, and the alternate function itself. (If a non-multi-method function is passed in,
the function will fail silently.)

In this case, for every other string where its length plus one doesn't add up to 10, the default function will be used.

     println(muult("Aesop"))
     => the string is "Aesop"
     
But if the string's length plus one is 10, the new function is used

     println(muult("character"))
     => nine-character string is character
     
Going back to the original declaration, note that you can define alternate functions within the function passed into defmulti.


     val muult = defmulti<String, String, Int> {
          dispatcher {
              it.length + 1
          }

          default {
              "the string is \"$it\""
          }

          defmethod(6) {
              "six? \"$it\".length is six?"
          }
      }
    
    println(muult("to"))
    => the string is "to"
    
    println(muult("Aesop"))
    => six? "Aesop".length is six?
