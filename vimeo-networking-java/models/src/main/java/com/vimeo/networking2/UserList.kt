package com.vimeo.networking2

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.vimeo.networking2.common.Pageable
import java.io.Serializable

/**
 * List of users that could be paged.
 */
@JsonClass(generateAdapter = true)
data class UserList(

    @Json(name = "total")
    override val total: Int? = null,

    @Json(name = "page")
    override val page: Int? = null,

    @Json(name = "per_page")
    override val perPage: Int? = null,

    @Json(name = "paging")
    override val paging: Paging? = null,

    @Json(name = "data")
    override val data: List<User>? = null

) : Pageable<User>, Serializable {

    companion object {
        private const val serialVersionUID = -7L
    }
}
