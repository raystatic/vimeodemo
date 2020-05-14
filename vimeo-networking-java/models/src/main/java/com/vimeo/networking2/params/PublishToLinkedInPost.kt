package com.vimeo.networking2.params

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.io.Serializable

/**
 * Represents the required data for a LinkedIn post.
 */
@JsonClass(generateAdapter = true)
data class PublishToLinkedInPost(

    /**
     * The LinkedIn page identifier that the video will be posted to.
     */
    @Json(name = "page_id")
    val pageID: Int,

    /**
     * The title of the post as it will appear on LinkedIn.
     */
    @Json(name = "title")
    val title: String,

    /**
     * The description of the post as it will appear on LinkedIn.
     */
    @Json(name = "description")
    val description: String

) : Serializable {

    companion object {
        private const val serialVersionUID = -9908L
    }
}
