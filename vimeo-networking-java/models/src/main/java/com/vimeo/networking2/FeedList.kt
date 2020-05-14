package com.vimeo.networking2

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.vimeo.networking2.common.Pageable
import java.io.Serializable

/**
 * List of [FeedItem]s to show in a user's feed.
 */
@JsonClass(generateAdapter = true)
data class FeedList(

    @Json(name = "total")
    override val total: Int? = null,

    @Json(name = "page")
    override val page: Int? = null,

    @Json(name = "per_page")
    override val perPage: Int? = null,

    @Json(name = "paging")
    override val paging: Paging? = null,

    @Json(name = "data")
    override val data: List<FeedItem>? = null

) : Pageable<FeedItem>, Serializable {

    companion object {
        private const val serialVersionUID = -635029129L
    }
}
