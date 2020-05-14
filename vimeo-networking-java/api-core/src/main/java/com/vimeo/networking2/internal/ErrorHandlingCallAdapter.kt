package com.vimeo.networking2.internal

import com.vimeo.networking2.ApiError
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.CallAdapter
import retrofit2.Converter
import java.lang.reflect.Type
import java.util.concurrent.Executor

/**
 * Custom call adapter to handle errors.
 *
 * @param responseType              Type of the response.
 * @param callbackExecutor          The executor upon which the caller is notified.
 * @param responseBodyConverter     Converter to parse the error response into a [ApiError].
 */
internal class ErrorHandlingCallAdapter<T : Any>(
    private val responseType: Type,
    private val callbackExecutor: Executor?,
    private val responseBodyConverter: Converter<ResponseBody, ApiError>
) : CallAdapter<T, VimeoCall<T>> {

    /**
     * Get the response type of the request.
     */
    override fun responseType() = responseType

    /**
     * Create a call adapter for the specific call used in the request.
     */
    override fun adapt(call: Call<T>) = VimeoCallAdapter(call, callbackExecutor, responseBodyConverter)
}
