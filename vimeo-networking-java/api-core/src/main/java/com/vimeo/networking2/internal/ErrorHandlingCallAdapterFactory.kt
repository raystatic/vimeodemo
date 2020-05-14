package com.vimeo.networking2.internal

import com.vimeo.networking2.ApiError
import retrofit2.CallAdapter
import retrofit2.Retrofit
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

/**
 * Factory for creating a custom [ErrorHandlingCallAdapter].
 */
internal class ErrorHandlingCallAdapterFactory : CallAdapter.Factory() {

    /**
     * Creates and returns a [ErrorHandlingCallAdapter].
     */
    override fun get(
        returnType: Type,
        annotations: Array<Annotation>,
        retrofit: Retrofit
    ): CallAdapter<*, *>? {
        if (getRawType(returnType) != VimeoCall::class.java) {
            return null
        }

        if (returnType !is ParameterizedType) {
            throw IllegalStateException("VimeoCall must have generic type (e.g., VimeoCall<ResponseBody>)")
        }
        val responseType = getParameterUpperBound(0, returnType)
        val callbackExecutor = retrofit.callbackExecutor()
        val errorResponseConverter = retrofit.responseBodyConverter<ApiError>(
            ApiError::class.java,
            emptyArray()
        )
        return ErrorHandlingCallAdapter<Any>(responseType, callbackExecutor, errorResponseConverter)
    }
}
