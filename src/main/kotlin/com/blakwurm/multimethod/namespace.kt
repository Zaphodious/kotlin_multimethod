package com.blakwurm.multimethod

// Auto-generated file. DO NOT EDIT!
/** Builds a multimethod with 1 args
 * @param buildFun Lambda with MultiBuilder1 reciever, which is run to construct the function
 * @return The MultiMethod. Note that as MultiMethod1 implements interface Function1, it can be used exactly
 * like any other kotlin function.
 */
fun <T1,K,J> defmulti(buildFun: MultiBuilder1<T1,K,J>.()->Unit) : (T1) -> K {
    val builder = MultiBuilder1<T1,K,J>()
    builder.buildFun()
    return MultiMethod1(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
 * @param multiMethod Instance of MultiMethod1 previously returned from defmulti(..).
 * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
 * called instead of the default function.
 * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
 */
@Suppress("UNCHECKED_CAST")
fun <T1,K,J> defmethod(multiMethod: (T1) -> K, predResult: J, method: (T1) -> K) {
    if (multiMethod is MultiMethod1<*, *, *>) {
        multiMethod as MultiMethod1<T1, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod1 <T1, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, (T1) -> K>,
        internal val dispatch:(T1) -> J,
        internal val default:(T1) -> K
) : (T1) -> K {
    override fun invoke(arg1: T1): K {
        return methodRegistry[dispatch(arg1)]?.invoke(arg1) ?: default(arg1)
    }
}

class MultiBuilder1 <T1, K, J> {
    internal lateinit var default: (T1) -> K
    internal lateinit var dispatcher: (T1) -> J
    internal val methodRegistry: MutableMap<J, (T1) -> K> = mutableMapOf()

    fun default(default: (T1) -> K) : MultiBuilder1<T1,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: (T1) -> J) : MultiBuilder1<T1,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: (T1) -> K) {
        methodRegistry.put(predResult, fn)
    }
}



/** Builds a multimethod with 2 args
 * @param buildFun Lambda with MultiBuilder2 reciever, which is run to construct the function
 * @return The MultiMethod. Note that as MultiMethod2 implements interface Function2, it can be used exactly
 * like any other kotlin function.
 */
fun <T1, T2,K,J> defmulti(buildFun: MultiBuilder2<T1, T2,K,J>.()->Unit) : (T1, T2) -> K {
    val builder = MultiBuilder2<T1, T2,K,J>()
    builder.buildFun()
    return MultiMethod2(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
 * @param multiMethod Instance of MultiMethod2 previously returned from defmulti(..).
 * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
 * called instead of the default function.
 * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
 */
@Suppress("UNCHECKED_CAST")
fun <T1, T2,K,J> defmethod(multiMethod: (T1, T2) -> K, predResult: J, method: (T1, T2) -> K) {
    if (multiMethod is MultiMethod2<*, *, *, *>) {
        multiMethod as MultiMethod2<T1, T2, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod2 <T1, T2, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, (T1, T2) -> K>,
        internal val dispatch:(T1, T2) -> J,
        internal val default:(T1, T2) -> K
) : (T1, T2) -> K {
    override fun invoke(arg1: T1, arg2: T2): K {
        return methodRegistry[dispatch(arg1, arg2)]?.invoke(arg1, arg2) ?: default(arg1, arg2)
    }
}

class MultiBuilder2 <T1, T2, K, J> {
    internal lateinit var default: (T1, T2) -> K
    internal lateinit var dispatcher: (T1, T2) -> J
    internal val methodRegistry: MutableMap<J, (T1, T2) -> K> = mutableMapOf()

    fun default(default: (T1, T2) -> K) : MultiBuilder2<T1, T2,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: (T1, T2) -> J) : MultiBuilder2<T1, T2,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: (T1, T2) -> K) {
        methodRegistry.put(predResult, fn)
    }
}



/** Builds a multimethod with 3 args
 * @param buildFun Lambda with MultiBuilder3 reciever, which is run to construct the function
 * @return The MultiMethod. Note that as MultiMethod3 implements interface Function3, it can be used exactly
 * like any other kotlin function.
 */
fun <T1, T2, T3,K,J> defmulti(buildFun: MultiBuilder3<T1, T2, T3,K,J>.()->Unit) : (T1, T2, T3) -> K {
    val builder = MultiBuilder3<T1, T2, T3,K,J>()
    builder.buildFun()
    return MultiMethod3(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
 * @param multiMethod Instance of MultiMethod3 previously returned from defmulti(..).
 * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
 * called instead of the default function.
 * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
 */
@Suppress("UNCHECKED_CAST")
fun <T1, T2, T3,K,J> defmethod(multiMethod: (T1, T2, T3) -> K, predResult: J, method: (T1, T2, T3) -> K) {
    if (multiMethod is MultiMethod3<*, *, *, *, *>) {
        multiMethod as MultiMethod3<T1, T2, T3, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod3 <T1, T2, T3, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, (T1, T2, T3) -> K>,
        internal val dispatch:(T1, T2, T3) -> J,
        internal val default:(T1, T2, T3) -> K
) : (T1, T2, T3) -> K {
    override fun invoke(arg1: T1, arg2: T2, arg3: T3): K {
        return methodRegistry[dispatch(arg1, arg2, arg3)]?.invoke(arg1, arg2, arg3) ?: default(arg1, arg2, arg3)
    }
}

class MultiBuilder3 <T1, T2, T3, K, J> {
    internal lateinit var default: (T1, T2, T3) -> K
    internal lateinit var dispatcher: (T1, T2, T3) -> J
    internal val methodRegistry: MutableMap<J, (T1, T2, T3) -> K> = mutableMapOf()

    fun default(default: (T1, T2, T3) -> K) : MultiBuilder3<T1, T2, T3,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: (T1, T2, T3) -> J) : MultiBuilder3<T1, T2, T3,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: (T1, T2, T3) -> K) {
        methodRegistry.put(predResult, fn)
    }
}



/** Builds a multimethod with 4 args
 * @param buildFun Lambda with MultiBuilder4 reciever, which is run to construct the function
 * @return The MultiMethod. Note that as MultiMethod4 implements interface Function4, it can be used exactly
 * like any other kotlin function.
 */
fun <T1, T2, T3, T4,K,J> defmulti(buildFun: MultiBuilder4<T1, T2, T3, T4,K,J>.()->Unit) : (T1, T2, T3, T4) -> K {
    val builder = MultiBuilder4<T1, T2, T3, T4,K,J>()
    builder.buildFun()
    return MultiMethod4(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
 * @param multiMethod Instance of MultiMethod4 previously returned from defmulti(..).
 * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
 * called instead of the default function.
 * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
 */
@Suppress("UNCHECKED_CAST")
fun <T1, T2, T3, T4,K,J> defmethod(multiMethod: (T1, T2, T3, T4) -> K, predResult: J, method: (T1, T2, T3, T4) -> K) {
    if (multiMethod is MultiMethod4<*, *, *, *, *, *>) {
        multiMethod as MultiMethod4<T1, T2, T3, T4, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod4 <T1, T2, T3, T4, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, (T1, T2, T3, T4) -> K>,
        internal val dispatch:(T1, T2, T3, T4) -> J,
        internal val default:(T1, T2, T3, T4) -> K
) : (T1, T2, T3, T4) -> K {
    override fun invoke(arg1: T1, arg2: T2, arg3: T3, arg4: T4): K {
        return methodRegistry[dispatch(arg1, arg2, arg3, arg4)]?.invoke(arg1, arg2, arg3, arg4) ?: default(arg1, arg2, arg3, arg4)
    }
}

class MultiBuilder4 <T1, T2, T3, T4, K, J> {
    internal lateinit var default: (T1, T2, T3, T4) -> K
    internal lateinit var dispatcher: (T1, T2, T3, T4) -> J
    internal val methodRegistry: MutableMap<J, (T1, T2, T3, T4) -> K> = mutableMapOf()

    fun default(default: (T1, T2, T3, T4) -> K) : MultiBuilder4<T1, T2, T3, T4,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: (T1, T2, T3, T4) -> J) : MultiBuilder4<T1, T2, T3, T4,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: (T1, T2, T3, T4) -> K) {
        methodRegistry.put(predResult, fn)
    }
}



/** Builds a multimethod with 5 args
 * @param buildFun Lambda with MultiBuilder5 reciever, which is run to construct the function
 * @return The MultiMethod. Note that as MultiMethod5 implements interface Function5, it can be used exactly
 * like any other kotlin function.
 */
fun <T1, T2, T3, T4, T5,K,J> defmulti(buildFun: MultiBuilder5<T1, T2, T3, T4, T5,K,J>.()->Unit) : (T1, T2, T3, T4, T5) -> K {
    val builder = MultiBuilder5<T1, T2, T3, T4, T5,K,J>()
    builder.buildFun()
    return MultiMethod5(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
 * @param multiMethod Instance of MultiMethod5 previously returned from defmulti(..).
 * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
 * called instead of the default function.
 * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
 */
@Suppress("UNCHECKED_CAST")
fun <T1, T2, T3, T4, T5,K,J> defmethod(multiMethod: (T1, T2, T3, T4, T5) -> K, predResult: J, method: (T1, T2, T3, T4, T5) -> K) {
    if (multiMethod is MultiMethod5<*, *, *, *, *, *, *>) {
        multiMethod as MultiMethod5<T1, T2, T3, T4, T5, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod5 <T1, T2, T3, T4, T5, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, (T1, T2, T3, T4, T5) -> K>,
        internal val dispatch:(T1, T2, T3, T4, T5) -> J,
        internal val default:(T1, T2, T3, T4, T5) -> K
) : (T1, T2, T3, T4, T5) -> K {
    override fun invoke(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5): K {
        return methodRegistry[dispatch(arg1, arg2, arg3, arg4, arg5)]?.invoke(arg1, arg2, arg3, arg4, arg5) ?: default(arg1, arg2, arg3, arg4, arg5)
    }
}

class MultiBuilder5 <T1, T2, T3, T4, T5, K, J> {
    internal lateinit var default: (T1, T2, T3, T4, T5) -> K
    internal lateinit var dispatcher: (T1, T2, T3, T4, T5) -> J
    internal val methodRegistry: MutableMap<J, (T1, T2, T3, T4, T5) -> K> = mutableMapOf()

    fun default(default: (T1, T2, T3, T4, T5) -> K) : MultiBuilder5<T1, T2, T3, T4, T5,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: (T1, T2, T3, T4, T5) -> J) : MultiBuilder5<T1, T2, T3, T4, T5,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: (T1, T2, T3, T4, T5) -> K) {
        methodRegistry.put(predResult, fn)
    }
}



/** Builds a multimethod with 6 args
 * @param buildFun Lambda with MultiBuilder6 reciever, which is run to construct the function
 * @return The MultiMethod. Note that as MultiMethod6 implements interface Function6, it can be used exactly
 * like any other kotlin function.
 */
fun <T1, T2, T3, T4, T5, T6,K,J> defmulti(buildFun: MultiBuilder6<T1, T2, T3, T4, T5, T6,K,J>.()->Unit) : (T1, T2, T3, T4, T5, T6) -> K {
    val builder = MultiBuilder6<T1, T2, T3, T4, T5, T6,K,J>()
    builder.buildFun()
    return MultiMethod6(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
 * @param multiMethod Instance of MultiMethod6 previously returned from defmulti(..).
 * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
 * called instead of the default function.
 * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
 */
@Suppress("UNCHECKED_CAST")
fun <T1, T2, T3, T4, T5, T6,K,J> defmethod(multiMethod: (T1, T2, T3, T4, T5, T6) -> K, predResult: J, method: (T1, T2, T3, T4, T5, T6) -> K) {
    if (multiMethod is MultiMethod6<*, *, *, *, *, *, *, *>) {
        multiMethod as MultiMethod6<T1, T2, T3, T4, T5, T6, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod6 <T1, T2, T3, T4, T5, T6, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, (T1, T2, T3, T4, T5, T6) -> K>,
        internal val dispatch:(T1, T2, T3, T4, T5, T6) -> J,
        internal val default:(T1, T2, T3, T4, T5, T6) -> K
) : (T1, T2, T3, T4, T5, T6) -> K {
    override fun invoke(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6): K {
        return methodRegistry[dispatch(arg1, arg2, arg3, arg4, arg5, arg6)]?.invoke(arg1, arg2, arg3, arg4, arg5, arg6) ?: default(arg1, arg2, arg3, arg4, arg5, arg6)
    }
}

class MultiBuilder6 <T1, T2, T3, T4, T5, T6, K, J> {
    internal lateinit var default: (T1, T2, T3, T4, T5, T6) -> K
    internal lateinit var dispatcher: (T1, T2, T3, T4, T5, T6) -> J
    internal val methodRegistry: MutableMap<J, (T1, T2, T3, T4, T5, T6) -> K> = mutableMapOf()

    fun default(default: (T1, T2, T3, T4, T5, T6) -> K) : MultiBuilder6<T1, T2, T3, T4, T5, T6,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: (T1, T2, T3, T4, T5, T6) -> J) : MultiBuilder6<T1, T2, T3, T4, T5, T6,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: (T1, T2, T3, T4, T5, T6) -> K) {
        methodRegistry.put(predResult, fn)
    }
}



/** Builds a multimethod with 7 args
 * @param buildFun Lambda with MultiBuilder7 reciever, which is run to construct the function
 * @return The MultiMethod. Note that as MultiMethod7 implements interface Function7, it can be used exactly
 * like any other kotlin function.
 */
fun <T1, T2, T3, T4, T5, T6, T7,K,J> defmulti(buildFun: MultiBuilder7<T1, T2, T3, T4, T5, T6, T7,K,J>.()->Unit) : (T1, T2, T3, T4, T5, T6, T7) -> K {
    val builder = MultiBuilder7<T1, T2, T3, T4, T5, T6, T7,K,J>()
    builder.buildFun()
    return MultiMethod7(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
 * @param multiMethod Instance of MultiMethod7 previously returned from defmulti(..).
 * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
 * called instead of the default function.
 * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
 */
@Suppress("UNCHECKED_CAST")
fun <T1, T2, T3, T4, T5, T6, T7,K,J> defmethod(multiMethod: (T1, T2, T3, T4, T5, T6, T7) -> K, predResult: J, method: (T1, T2, T3, T4, T5, T6, T7) -> K) {
    if (multiMethod is MultiMethod7<*, *, *, *, *, *, *, *, *>) {
        multiMethod as MultiMethod7<T1, T2, T3, T4, T5, T6, T7, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod7 <T1, T2, T3, T4, T5, T6, T7, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, (T1, T2, T3, T4, T5, T6, T7) -> K>,
        internal val dispatch:(T1, T2, T3, T4, T5, T6, T7) -> J,
        internal val default:(T1, T2, T3, T4, T5, T6, T7) -> K
) : (T1, T2, T3, T4, T5, T6, T7) -> K {
    override fun invoke(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7): K {
        return methodRegistry[dispatch(arg1, arg2, arg3, arg4, arg5, arg6, arg7)]?.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7) ?: default(arg1, arg2, arg3, arg4, arg5, arg6, arg7)
    }
}

class MultiBuilder7 <T1, T2, T3, T4, T5, T6, T7, K, J> {
    internal lateinit var default: (T1, T2, T3, T4, T5, T6, T7) -> K
    internal lateinit var dispatcher: (T1, T2, T3, T4, T5, T6, T7) -> J
    internal val methodRegistry: MutableMap<J, (T1, T2, T3, T4, T5, T6, T7) -> K> = mutableMapOf()

    fun default(default: (T1, T2, T3, T4, T5, T6, T7) -> K) : MultiBuilder7<T1, T2, T3, T4, T5, T6, T7,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: (T1, T2, T3, T4, T5, T6, T7) -> J) : MultiBuilder7<T1, T2, T3, T4, T5, T6, T7,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: (T1, T2, T3, T4, T5, T6, T7) -> K) {
        methodRegistry.put(predResult, fn)
    }
}



/** Builds a multimethod with 8 args
 * @param buildFun Lambda with MultiBuilder8 reciever, which is run to construct the function
 * @return The MultiMethod. Note that as MultiMethod8 implements interface Function8, it can be used exactly
 * like any other kotlin function.
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8,K,J> defmulti(buildFun: MultiBuilder8<T1, T2, T3, T4, T5, T6, T7, T8,K,J>.()->Unit) : (T1, T2, T3, T4, T5, T6, T7, T8) -> K {
    val builder = MultiBuilder8<T1, T2, T3, T4, T5, T6, T7, T8,K,J>()
    builder.buildFun()
    return MultiMethod8(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
 * @param multiMethod Instance of MultiMethod8 previously returned from defmulti(..).
 * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
 * called instead of the default function.
 * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
 */
@Suppress("UNCHECKED_CAST")
fun <T1, T2, T3, T4, T5, T6, T7, T8,K,J> defmethod(multiMethod: (T1, T2, T3, T4, T5, T6, T7, T8) -> K, predResult: J, method: (T1, T2, T3, T4, T5, T6, T7, T8) -> K) {
    if (multiMethod is MultiMethod8<*, *, *, *, *, *, *, *, *, *>) {
        multiMethod as MultiMethod8<T1, T2, T3, T4, T5, T6, T7, T8, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod8 <T1, T2, T3, T4, T5, T6, T7, T8, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8) -> K>,
        internal val dispatch:(T1, T2, T3, T4, T5, T6, T7, T8) -> J,
        internal val default:(T1, T2, T3, T4, T5, T6, T7, T8) -> K
) : (T1, T2, T3, T4, T5, T6, T7, T8) -> K {
    override fun invoke(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8): K {
        return methodRegistry[dispatch(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)]?.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) ?: default(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)
    }
}

class MultiBuilder8 <T1, T2, T3, T4, T5, T6, T7, T8, K, J> {
    internal lateinit var default: (T1, T2, T3, T4, T5, T6, T7, T8) -> K
    internal lateinit var dispatcher: (T1, T2, T3, T4, T5, T6, T7, T8) -> J
    internal val methodRegistry: MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8) -> K> = mutableMapOf()

    fun default(default: (T1, T2, T3, T4, T5, T6, T7, T8) -> K) : MultiBuilder8<T1, T2, T3, T4, T5, T6, T7, T8,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: (T1, T2, T3, T4, T5, T6, T7, T8) -> J) : MultiBuilder8<T1, T2, T3, T4, T5, T6, T7, T8,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: (T1, T2, T3, T4, T5, T6, T7, T8) -> K) {
        methodRegistry.put(predResult, fn)
    }
}



/** Builds a multimethod with 9 args
 * @param buildFun Lambda with MultiBuilder9 reciever, which is run to construct the function
 * @return The MultiMethod. Note that as MultiMethod9 implements interface Function9, it can be used exactly
 * like any other kotlin function.
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9,K,J> defmulti(buildFun: MultiBuilder9<T1, T2, T3, T4, T5, T6, T7, T8, T9,K,J>.()->Unit) : (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> K {
    val builder = MultiBuilder9<T1, T2, T3, T4, T5, T6, T7, T8, T9,K,J>()
    builder.buildFun()
    return MultiMethod9(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
 * @param multiMethod Instance of MultiMethod9 previously returned from defmulti(..).
 * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
 * called instead of the default function.
 * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
 */
@Suppress("UNCHECKED_CAST")
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9,K,J> defmethod(multiMethod: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> K, predResult: J, method: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> K) {
    if (multiMethod is MultiMethod9<*, *, *, *, *, *, *, *, *, *, *>) {
        multiMethod as MultiMethod9<T1, T2, T3, T4, T5, T6, T7, T8, T9, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod9 <T1, T2, T3, T4, T5, T6, T7, T8, T9, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> K>,
        internal val dispatch:(T1, T2, T3, T4, T5, T6, T7, T8, T9) -> J,
        internal val default:(T1, T2, T3, T4, T5, T6, T7, T8, T9) -> K
) : (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> K {
    override fun invoke(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9): K {
        return methodRegistry[dispatch(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)]?.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9) ?: default(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
    }
}

class MultiBuilder9 <T1, T2, T3, T4, T5, T6, T7, T8, T9, K, J> {
    internal lateinit var default: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> K
    internal lateinit var dispatcher: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> J
    internal val methodRegistry: MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> K> = mutableMapOf()

    fun default(default: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> K) : MultiBuilder9<T1, T2, T3, T4, T5, T6, T7, T8, T9,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> J) : MultiBuilder9<T1, T2, T3, T4, T5, T6, T7, T8, T9,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> K) {
        methodRegistry.put(predResult, fn)
    }
}



/** Builds a multimethod with 10 args
 * @param buildFun Lambda with MultiBuilder10 reciever, which is run to construct the function
 * @return The MultiMethod. Note that as MultiMethod10 implements interface Function10, it can be used exactly
 * like any other kotlin function.
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10,K,J> defmulti(buildFun: MultiBuilder10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10,K,J>.()->Unit) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> K {
    val builder = MultiBuilder10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10,K,J>()
    builder.buildFun()
    return MultiMethod10(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
 * @param multiMethod Instance of MultiMethod10 previously returned from defmulti(..).
 * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
 * called instead of the default function.
 * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
 */
@Suppress("UNCHECKED_CAST")
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10,K,J> defmethod(multiMethod: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> K, predResult: J, method: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> K) {
    if (multiMethod is MultiMethod10<*, *, *, *, *, *, *, *, *, *, *, *>) {
        multiMethod as MultiMethod10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod10 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> K>,
        internal val dispatch:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> J,
        internal val default:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> K
) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> K {
    override fun invoke(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10): K {
        return methodRegistry[dispatch(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10)]?.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10) ?: default(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10)
    }
}

class MultiBuilder10 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, K, J> {
    internal lateinit var default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> K
    internal lateinit var dispatcher: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> J
    internal val methodRegistry: MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> K> = mutableMapOf()

    fun default(default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> K) : MultiBuilder10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> J) : MultiBuilder10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> K) {
        methodRegistry.put(predResult, fn)
    }
}



/** Builds a multimethod with 11 args
 * @param buildFun Lambda with MultiBuilder11 reciever, which is run to construct the function
 * @return The MultiMethod. Note that as MultiMethod11 implements interface Function11, it can be used exactly
 * like any other kotlin function.
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11,K,J> defmulti(buildFun: MultiBuilder11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11,K,J>.()->Unit) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> K {
    val builder = MultiBuilder11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11,K,J>()
    builder.buildFun()
    return MultiMethod11(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
 * @param multiMethod Instance of MultiMethod11 previously returned from defmulti(..).
 * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
 * called instead of the default function.
 * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
 */
@Suppress("UNCHECKED_CAST")
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11,K,J> defmethod(multiMethod: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> K, predResult: J, method: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> K) {
    if (multiMethod is MultiMethod11<*, *, *, *, *, *, *, *, *, *, *, *, *>) {
        multiMethod as MultiMethod11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod11 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> K>,
        internal val dispatch:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> J,
        internal val default:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> K
) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> K {
    override fun invoke(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11): K {
        return methodRegistry[dispatch(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11)]?.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11) ?: default(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11)
    }
}

class MultiBuilder11 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, K, J> {
    internal lateinit var default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> K
    internal lateinit var dispatcher: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> J
    internal val methodRegistry: MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> K> = mutableMapOf()

    fun default(default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> K) : MultiBuilder11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> J) : MultiBuilder11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> K) {
        methodRegistry.put(predResult, fn)
    }
}



/** Builds a multimethod with 12 args
 * @param buildFun Lambda with MultiBuilder12 reciever, which is run to construct the function
 * @return The MultiMethod. Note that as MultiMethod12 implements interface Function12, it can be used exactly
 * like any other kotlin function.
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12,K,J> defmulti(buildFun: MultiBuilder12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12,K,J>.()->Unit) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> K {
    val builder = MultiBuilder12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12,K,J>()
    builder.buildFun()
    return MultiMethod12(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
 * @param multiMethod Instance of MultiMethod12 previously returned from defmulti(..).
 * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
 * called instead of the default function.
 * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
 */
@Suppress("UNCHECKED_CAST")
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12,K,J> defmethod(multiMethod: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> K, predResult: J, method: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> K) {
    if (multiMethod is MultiMethod12<*, *, *, *, *, *, *, *, *, *, *, *, *, *>) {
        multiMethod as MultiMethod12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod12 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> K>,
        internal val dispatch:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> J,
        internal val default:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> K
) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> K {
    override fun invoke(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12): K {
        return methodRegistry[dispatch(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12)]?.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12) ?: default(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12)
    }
}

class MultiBuilder12 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, K, J> {
    internal lateinit var default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> K
    internal lateinit var dispatcher: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> J
    internal val methodRegistry: MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> K> = mutableMapOf()

    fun default(default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> K) : MultiBuilder12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> J) : MultiBuilder12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> K) {
        methodRegistry.put(predResult, fn)
    }
}



/** Builds a multimethod with 13 args
 * @param buildFun Lambda with MultiBuilder13 reciever, which is run to construct the function
 * @return The MultiMethod. Note that as MultiMethod13 implements interface Function13, it can be used exactly
 * like any other kotlin function.
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13,K,J> defmulti(buildFun: MultiBuilder13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13,K,J>.()->Unit) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) -> K {
    val builder = MultiBuilder13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13,K,J>()
    builder.buildFun()
    return MultiMethod13(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
 * @param multiMethod Instance of MultiMethod13 previously returned from defmulti(..).
 * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
 * called instead of the default function.
 * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
 */
@Suppress("UNCHECKED_CAST")
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13,K,J> defmethod(multiMethod: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) -> K, predResult: J, method: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) -> K) {
    if (multiMethod is MultiMethod13<*, *, *, *, *, *, *, *, *, *, *, *, *, *, *>) {
        multiMethod as MultiMethod13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod13 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) -> K>,
        internal val dispatch:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) -> J,
        internal val default:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) -> K
) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) -> K {
    override fun invoke(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13): K {
        return methodRegistry[dispatch(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13)]?.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13) ?: default(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13)
    }
}

class MultiBuilder13 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, K, J> {
    internal lateinit var default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) -> K
    internal lateinit var dispatcher: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) -> J
    internal val methodRegistry: MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) -> K> = mutableMapOf()

    fun default(default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) -> K) : MultiBuilder13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) -> J) : MultiBuilder13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) -> K) {
        methodRegistry.put(predResult, fn)
    }
}



/** Builds a multimethod with 14 args
 * @param buildFun Lambda with MultiBuilder14 reciever, which is run to construct the function
 * @return The MultiMethod. Note that as MultiMethod14 implements interface Function14, it can be used exactly
 * like any other kotlin function.
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14,K,J> defmulti(buildFun: MultiBuilder14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14,K,J>.()->Unit) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) -> K {
    val builder = MultiBuilder14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14,K,J>()
    builder.buildFun()
    return MultiMethod14(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
 * @param multiMethod Instance of MultiMethod14 previously returned from defmulti(..).
 * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
 * called instead of the default function.
 * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
 */
@Suppress("UNCHECKED_CAST")
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14,K,J> defmethod(multiMethod: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) -> K, predResult: J, method: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) -> K) {
    if (multiMethod is MultiMethod14<*, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *>) {
        multiMethod as MultiMethod14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod14 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) -> K>,
        internal val dispatch:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) -> J,
        internal val default:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) -> K
) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) -> K {
    override fun invoke(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14): K {
        return methodRegistry[dispatch(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14)]?.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14) ?: default(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14)
    }
}

class MultiBuilder14 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, K, J> {
    internal lateinit var default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) -> K
    internal lateinit var dispatcher: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) -> J
    internal val methodRegistry: MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) -> K> = mutableMapOf()

    fun default(default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) -> K) : MultiBuilder14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) -> J) : MultiBuilder14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) -> K) {
        methodRegistry.put(predResult, fn)
    }
}



/** Builds a multimethod with 15 args
 * @param buildFun Lambda with MultiBuilder15 reciever, which is run to construct the function
 * @return The MultiMethod. Note that as MultiMethod15 implements interface Function15, it can be used exactly
 * like any other kotlin function.
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15,K,J> defmulti(buildFun: MultiBuilder15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15,K,J>.()->Unit) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) -> K {
    val builder = MultiBuilder15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15,K,J>()
    builder.buildFun()
    return MultiMethod15(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
 * @param multiMethod Instance of MultiMethod15 previously returned from defmulti(..).
 * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
 * called instead of the default function.
 * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
 */
@Suppress("UNCHECKED_CAST")
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15,K,J> defmethod(multiMethod: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) -> K, predResult: J, method: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) -> K) {
    if (multiMethod is MultiMethod15<*, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *>) {
        multiMethod as MultiMethod15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod15 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) -> K>,
        internal val dispatch:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) -> J,
        internal val default:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) -> K
) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) -> K {
    override fun invoke(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15): K {
        return methodRegistry[dispatch(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15)]?.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15) ?: default(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15)
    }
}

class MultiBuilder15 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, K, J> {
    internal lateinit var default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) -> K
    internal lateinit var dispatcher: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) -> J
    internal val methodRegistry: MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) -> K> = mutableMapOf()

    fun default(default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) -> K) : MultiBuilder15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) -> J) : MultiBuilder15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) -> K) {
        methodRegistry.put(predResult, fn)
    }
}



/** Builds a multimethod with 16 args
 * @param buildFun Lambda with MultiBuilder16 reciever, which is run to construct the function
 * @return The MultiMethod. Note that as MultiMethod16 implements interface Function16, it can be used exactly
 * like any other kotlin function.
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16,K,J> defmulti(buildFun: MultiBuilder16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16,K,J>.()->Unit) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) -> K {
    val builder = MultiBuilder16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16,K,J>()
    builder.buildFun()
    return MultiMethod16(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
 * @param multiMethod Instance of MultiMethod16 previously returned from defmulti(..).
 * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
 * called instead of the default function.
 * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
 */
@Suppress("UNCHECKED_CAST")
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16,K,J> defmethod(multiMethod: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) -> K, predResult: J, method: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) -> K) {
    if (multiMethod is MultiMethod16<*, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *>) {
        multiMethod as MultiMethod16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod16 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) -> K>,
        internal val dispatch:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) -> J,
        internal val default:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) -> K
) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) -> K {
    override fun invoke(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15, arg16: T16): K {
        return methodRegistry[dispatch(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16)]?.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16) ?: default(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16)
    }
}

class MultiBuilder16 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, K, J> {
    internal lateinit var default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) -> K
    internal lateinit var dispatcher: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) -> J
    internal val methodRegistry: MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) -> K> = mutableMapOf()

    fun default(default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) -> K) : MultiBuilder16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) -> J) : MultiBuilder16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) -> K) {
        methodRegistry.put(predResult, fn)
    }
}



/** Builds a multimethod with 17 args
 * @param buildFun Lambda with MultiBuilder17 reciever, which is run to construct the function
 * @return The MultiMethod. Note that as MultiMethod17 implements interface Function17, it can be used exactly
 * like any other kotlin function.
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17,K,J> defmulti(buildFun: MultiBuilder17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17,K,J>.()->Unit) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) -> K {
    val builder = MultiBuilder17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17,K,J>()
    builder.buildFun()
    return MultiMethod17(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
 * @param multiMethod Instance of MultiMethod17 previously returned from defmulti(..).
 * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
 * called instead of the default function.
 * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
 */
@Suppress("UNCHECKED_CAST")
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17,K,J> defmethod(multiMethod: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) -> K, predResult: J, method: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) -> K) {
    if (multiMethod is MultiMethod17<*, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *>) {
        multiMethod as MultiMethod17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod17 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) -> K>,
        internal val dispatch:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) -> J,
        internal val default:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) -> K
) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) -> K {
    override fun invoke(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15, arg16: T16, arg17: T17): K {
        return methodRegistry[dispatch(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17)]?.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17) ?: default(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17)
    }
}

class MultiBuilder17 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, K, J> {
    internal lateinit var default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) -> K
    internal lateinit var dispatcher: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) -> J
    internal val methodRegistry: MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) -> K> = mutableMapOf()

    fun default(default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) -> K) : MultiBuilder17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) -> J) : MultiBuilder17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) -> K) {
        methodRegistry.put(predResult, fn)
    }
}



/** Builds a multimethod with 18 args
 * @param buildFun Lambda with MultiBuilder18 reciever, which is run to construct the function
 * @return The MultiMethod. Note that as MultiMethod18 implements interface Function18, it can be used exactly
 * like any other kotlin function.
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18,K,J> defmulti(buildFun: MultiBuilder18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18,K,J>.()->Unit) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) -> K {
    val builder = MultiBuilder18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18,K,J>()
    builder.buildFun()
    return MultiMethod18(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
 * @param multiMethod Instance of MultiMethod18 previously returned from defmulti(..).
 * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
 * called instead of the default function.
 * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
 */
@Suppress("UNCHECKED_CAST")
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18,K,J> defmethod(multiMethod: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) -> K, predResult: J, method: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) -> K) {
    if (multiMethod is MultiMethod18<*, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *>) {
        multiMethod as MultiMethod18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod18 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) -> K>,
        internal val dispatch:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) -> J,
        internal val default:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) -> K
) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) -> K {
    override fun invoke(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15, arg16: T16, arg17: T17, arg18: T18): K {
        return methodRegistry[dispatch(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18)]?.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18) ?: default(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18)
    }
}

class MultiBuilder18 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, K, J> {
    internal lateinit var default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) -> K
    internal lateinit var dispatcher: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) -> J
    internal val methodRegistry: MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) -> K> = mutableMapOf()

    fun default(default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) -> K) : MultiBuilder18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) -> J) : MultiBuilder18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) -> K) {
        methodRegistry.put(predResult, fn)
    }
}



/** Builds a multimethod with 19 args
 * @param buildFun Lambda with MultiBuilder19 reciever, which is run to construct the function
 * @return The MultiMethod. Note that as MultiMethod19 implements interface Function19, it can be used exactly
 * like any other kotlin function.
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19,K,J> defmulti(buildFun: MultiBuilder19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19,K,J>.()->Unit) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) -> K {
    val builder = MultiBuilder19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19,K,J>()
    builder.buildFun()
    return MultiMethod19(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
 * @param multiMethod Instance of MultiMethod19 previously returned from defmulti(..).
 * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
 * called instead of the default function.
 * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
 */
@Suppress("UNCHECKED_CAST")
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19,K,J> defmethod(multiMethod: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) -> K, predResult: J, method: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) -> K) {
    if (multiMethod is MultiMethod19<*, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *>) {
        multiMethod as MultiMethod19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod19 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) -> K>,
        internal val dispatch:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) -> J,
        internal val default:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) -> K
) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) -> K {
    override fun invoke(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15, arg16: T16, arg17: T17, arg18: T18, arg19: T19): K {
        return methodRegistry[dispatch(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19)]?.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19) ?: default(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19)
    }
}

class MultiBuilder19 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, K, J> {
    internal lateinit var default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) -> K
    internal lateinit var dispatcher: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) -> J
    internal val methodRegistry: MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) -> K> = mutableMapOf()

    fun default(default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) -> K) : MultiBuilder19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) -> J) : MultiBuilder19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) -> K) {
        methodRegistry.put(predResult, fn)
    }
}



/** Builds a multimethod with 20 args
 * @param buildFun Lambda with MultiBuilder20 reciever, which is run to construct the function
 * @return The MultiMethod. Note that as MultiMethod20 implements interface Function20, it can be used exactly
 * like any other kotlin function.
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20,K,J> defmulti(buildFun: MultiBuilder20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20,K,J>.()->Unit) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) -> K {
    val builder = MultiBuilder20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20,K,J>()
    builder.buildFun()
    return MultiMethod20(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
 * @param multiMethod Instance of MultiMethod20 previously returned from defmulti(..).
 * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
 * called instead of the default function.
 * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
 */
@Suppress("UNCHECKED_CAST")
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20,K,J> defmethod(multiMethod: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) -> K, predResult: J, method: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) -> K) {
    if (multiMethod is MultiMethod20<*, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *>) {
        multiMethod as MultiMethod20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod20 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) -> K>,
        internal val dispatch:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) -> J,
        internal val default:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) -> K
) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) -> K {
    override fun invoke(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15, arg16: T16, arg17: T17, arg18: T18, arg19: T19, arg20: T20): K {
        return methodRegistry[dispatch(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20)]?.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20) ?: default(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20)
    }
}

class MultiBuilder20 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, K, J> {
    internal lateinit var default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) -> K
    internal lateinit var dispatcher: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) -> J
    internal val methodRegistry: MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) -> K> = mutableMapOf()

    fun default(default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) -> K) : MultiBuilder20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) -> J) : MultiBuilder20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) -> K) {
        methodRegistry.put(predResult, fn)
    }
}



/** Builds a multimethod with 21 args
 * @param buildFun Lambda with MultiBuilder21 reciever, which is run to construct the function
 * @return The MultiMethod. Note that as MultiMethod21 implements interface Function21, it can be used exactly
 * like any other kotlin function.
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21,K,J> defmulti(buildFun: MultiBuilder21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21,K,J>.()->Unit) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) -> K {
    val builder = MultiBuilder21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21,K,J>()
    builder.buildFun()
    return MultiMethod21(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
 * @param multiMethod Instance of MultiMethod21 previously returned from defmulti(..).
 * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
 * called instead of the default function.
 * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
 */
@Suppress("UNCHECKED_CAST")
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21,K,J> defmethod(multiMethod: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) -> K, predResult: J, method: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) -> K) {
    if (multiMethod is MultiMethod21<*, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *>) {
        multiMethod as MultiMethod21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod21 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) -> K>,
        internal val dispatch:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) -> J,
        internal val default:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) -> K
) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) -> K {
    override fun invoke(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15, arg16: T16, arg17: T17, arg18: T18, arg19: T19, arg20: T20, arg21: T21): K {
        return methodRegistry[dispatch(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21)]?.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21) ?: default(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21)
    }
}

class MultiBuilder21 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, K, J> {
    internal lateinit var default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) -> K
    internal lateinit var dispatcher: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) -> J
    internal val methodRegistry: MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) -> K> = mutableMapOf()

    fun default(default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) -> K) : MultiBuilder21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) -> J) : MultiBuilder21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) -> K) {
        methodRegistry.put(predResult, fn)
    }
}



/** Builds a multimethod with 22 args
 * @param buildFun Lambda with MultiBuilder22 reciever, which is run to construct the function
 * @return The MultiMethod. Note that as MultiMethod22 implements interface Function22, it can be used exactly
 * like any other kotlin function.
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22,K,J> defmulti(buildFun: MultiBuilder22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22,K,J>.()->Unit) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) -> K {
    val builder = MultiBuilder22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22,K,J>()
    builder.buildFun()
    return MultiMethod22(builder.methodRegistry,builder.dispatcher,builder.default)
}

/** Adds a new alternate function (method) to an existing multimethod
 * @param multiMethod Instance of MultiMethod22 previously returned from defmulti(..).
 * @param predResult If the multimethod's dispatcher function returns this, the new alternate function will be
 * called instead of the default function.
 * @return Unit. This operation is inherently stateful, so to highlight this defmethod returns nothing.
 */
@Suppress("UNCHECKED_CAST")
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22,K,J> defmethod(multiMethod: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) -> K, predResult: J, method: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) -> K) {
    if (multiMethod is MultiMethod22<*, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *>) {
        multiMethod as MultiMethod22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, K, J>
        multiMethod.methodRegistry[predResult] = method
    }

}


data class MultiMethod22 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, K, J> internal constructor (
        internal val methodRegistry:MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) -> K>,
        internal val dispatch:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) -> J,
        internal val default:(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) -> K
) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) -> K {
    override fun invoke(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15, arg16: T16, arg17: T17, arg18: T18, arg19: T19, arg20: T20, arg21: T21, arg22: T22): K {
        return methodRegistry[dispatch(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21, arg22)]?.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21, arg22) ?: default(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21, arg22)
    }
}

class MultiBuilder22 <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, K, J> {
    internal lateinit var default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) -> K
    internal lateinit var dispatcher: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) -> J
    internal val methodRegistry: MutableMap<J, (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) -> K> = mutableMapOf()

    fun default(default: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) -> K) : MultiBuilder22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22,K,J> {
        this.default = default
        return this
    }

    fun dispatcher (disp: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) -> J) : MultiBuilder22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22,K,J> {
        this.dispatcher = disp
        return this
    }

    fun defmethod(predResult: J, fn: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) -> K) {
        methodRegistry.put(predResult, fn)
    }
}