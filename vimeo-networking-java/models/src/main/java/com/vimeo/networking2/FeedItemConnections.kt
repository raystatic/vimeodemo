package com.vimeo.networking2

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.io.Serializable

/**
 * All connections for a [FeedItem].
 */
@JsonClass(generateAdapter = true)
data class FeedItemConnections(

    /**
     * A list of resource URIs related to the activity.
     */
    @Json(name = "related")
    val related: Connection? = null

) : Serializable {

    companion object {
        private const val serialVersionUID = -39L
    }
}
