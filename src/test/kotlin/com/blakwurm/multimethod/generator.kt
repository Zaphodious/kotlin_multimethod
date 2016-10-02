package com.blakwurm.multimethod


/*
 * In the test package so that generator code doesn't end up in
 * production systems.
 */
internal fun main(vararg args: String) {
    println(generate_all())

}

internal val plusky = {string1: String, string2: String -> string1 + string2 }
internal fun List<String>.condense() = this.reduce(plusky)
internal fun String.chop_comma() = if (this.last() == ' ') this.dropLast(2) else this.dropLast(1)


internal fun generate_multimethods(numberOfMaxArgs: Int) : String {
    fun gen_instance_from_template(numbah: Int) : String {
        val range = (1..numbah)
        val arg_type_params = range.map { "T$it, " }.condense().chop_comma()
        val args = range.map { "arg$it: T$it, " }.condense().chop_comma()
        val args_no_types = range.map { "arg$it, " }.condense().chop_comma()
        val stars = "*, *, " + range.map { "*, " }.condense().chop_comma()
        val stringer =
                """
/** Builds a multimethod with $numbah args
  * @param buildFun Lambda with MultiBuilder$numbah receiver, which is run to construct the function
  * @return The MultiMethod. Note that as MultiMethod$numbah implements interface Function$numbah, it can be used exactly
  * like any other kotlin function.
  */
fun <$arg_type_params,K,J> defmulti(buildFun: MultiBuilder$numbah<$arg_type_params,K,J>.()->Unit) : ($arg_type_params) -> K {
    val builder = MultiBuilder$numbah<$arg_type_params,K,J>()
    builder.buildFun()
    return MultiMethod$numbah(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
  * @param multiMethod Instance of MultiMethod$numbah previously returned from defmulti(..).
  * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
  * called instead of the default function.
  * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
  */
@Suppress("UNCHECKED_CAST")
fun <$arg_type_params,K,J> defmethod(multiMethod: ($arg_type_params) -> K, predResult: J, method: ($arg_type_params) -> K) {
    if (multiMethod is MultiMethod$numbah<$stars>) {
        multiMethod as MultiMethod$numbah<$arg_type_params, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod$numbah <$arg_type_params, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, ($arg_type_params) -> K>,
        internal val dispatch:($arg_type_params) -> J,
        internal val default:($arg_type_params) -> K
) : ($arg_type_params) -> K {
    override fun invoke($args): K {
        return methodRegistry[dispatch($args_no_types)]?.invoke($args_no_types) ?: default($args_no_types)
    }
}

class MultiBuilder$numbah <$arg_type_params, K, J> {
    internal lateinit var default: ($arg_type_params) -> K
    internal lateinit var dispatcher: ($arg_type_params) -> J
    internal val methodRegistry: MutableMap<J, ($arg_type_params) -> K> = mutableMapOf()

    fun default(default: ($arg_type_params) -> K) : MultiBuilder$numbah<$arg_type_params,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: ($arg_type_params) -> J) : MultiBuilder$numbah<$arg_type_params,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: ($arg_type_params) -> K) {
        methodRegistry.put(predResult, fn)
    }
}


"""
        return stringer
    }
    return """package com.blakwurm.multimethod

// Auto-generated file. DO NOT EDIT!""" +
    (1..numberOfMaxArgs).map(::gen_instance_from_template).condense()
}

internal fun generate_all() = generate_multimethods(22) // Max number of "FunctionX" interfaces