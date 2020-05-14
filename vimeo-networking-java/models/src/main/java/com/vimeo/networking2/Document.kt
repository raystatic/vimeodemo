package com.vimeo.networking2

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.io.Serializable

/**
 * Document data.
 */
@JsonClass(generateAdapter = true)
data class Document(

    /**
     * The partially stripped html for documents like the terms of service.
     */
    @Json(name = "html")
    val html: String? = null

) : Serializable {

    companion object {
        private const val serialVersionUID = -10L
    }
}
