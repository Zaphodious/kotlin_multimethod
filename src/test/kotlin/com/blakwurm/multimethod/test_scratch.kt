package com.blakwurm.multimethod

import org.junit.Assert.assertEquals
import org.junit.Test



fun main(vararg args: String) {
    val muult = defmulti<String, Int, String, Int> {
        dispatcher {arg: String, thing:Int ->
            arg.length + thing
        }

        default {arg: String, thing:Int ->
            "string was \"$arg\" and int was $thing"
        }

        defmethod(6) {arg: String, thing:Int ->
            "six? $arg.length plus $thing is six?"
        }
    }
    println(muult("Aesop", 4))
    println(muult("to", 4))
    println(muult)
}

class multimethodTest {



    @Test
    fun testMethodCreation() {
        val muult = defmulti<String, Int, String, Int> {
            dispatcher {arg: String, thing:Int ->
                arg.length + thing
            }

            default {arg: String, thing:Int ->
                "string was \"$arg\" and int was $thing"
            }
        }
        assertEquals("string was \"Aesop\" and int was 5",
                muult("Aesop", 5))
    }

    @Test
    fun testMethodDifferentiation() {
        val muult = defmulti<String, Int, Double, String, Int> {
            dispatcher {arg: String, thing:Int, other: Double ->
                ((arg.length + thing) / other).toInt()
            }

            default {arg: String, thing:Int, other: Double ->
                "string was \"$arg\" and int was $thing"
            }

            defmethod(6) {arg: String, thing:Int, other: Double ->
                "six? $arg.length plus $thing divided by $other (and rounded) is six?"
            }
        }
        assertEquals("string was \"Aesop\" and int was 5",
                muult("Aesop", 5, 1.0))
        assertEquals("six? biggun.length plus 6 divided by 2.0 (and rounded) is six?",
                muult("biggun", 6, 2.0))
    }

    @Test
    fun testMethodAddition() {
        val muult = defmulti<String, String, String, String, String, Int> {
            dispatcher {arg1, arg2, arg3, arg4 ->
                arg1.length + arg2.length + arg3.length + arg4.length
            }

            default {arg1, arg2, arg3, arg4 ->
                "sum of $arg1, $arg2, $arg3, and $arg4 (.length) is irreverent (yay autocorrect)..."
            }

            defmethod(8) {arg1, arg2, arg3, arg4 ->
                "eight characters shared between them... wow"
            }
        }
        assertEquals("sum of boom, sock, pow, and biff (.length) is irreverent (yay autocorrect)...",
                muult("boom", "sock", "pow", "biff"))
        assertEquals("eight characters shared between them... wow",
                muult("1", "2", "thr", "ee?"))

        assertEquals("sum of , , , and  (.length) is irreverent (yay autocorrect)...",
                muult("", "", "", ""))
        defmethod(muult, 0) {arg1, arg2, arg3, arg4 ->
            "entirely empty, neh?"
        }
        assertEquals("entirely empty, neh?",
                muult("", "", "", ""))

    }

    @Test
    fun dispatchOnString() {
        val muult = defmulti<Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, String> {
            dispatcher { a1, a2, a3, a4, a5, a6, a7, a8, a9 ->
                "$a1$a3$a5$a7$a9 and then some"
            }

            default { a1, a2, a3, a4, a5, a6, a7, a8, a9 ->
                listOf(a1, a2, a3, a4, a5, a6, a7, a8, a9).reduce { i1, i2 -> i1 + i2 }
            }

            defmethod("140000 and then some") { a1, a2, a3, a4, a5, a6, a7, a8, a9 ->
                -100
            }

            defmethod("4242424242 and then some") { a1, a2, a3, a4, a5, a6, a7, a8, a9 ->
                -42
            }
        }

        assertEquals(1+2+3+4+5+6+7+8+9,
                muult(1,2,3,4,5,6,7,8,9))
        assertEquals(-100,
                muult(14,0,0,0,0,0,0,0,0))
        assertEquals(-100,
                muult(14,4,0,6,0,9,0,13,0))
        assertEquals(14+1+2+3+4,
                muult(14,0,1,0,2,0,3,0,4))
        assertEquals(-42,
                muult(42,42,42,42,42,42,42,42,42))
    }
}