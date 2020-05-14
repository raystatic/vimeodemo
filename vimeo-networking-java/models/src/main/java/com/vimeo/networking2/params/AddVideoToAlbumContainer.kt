package com.vimeo.networking2.params

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Container for [AddVideoToAlbum].
 */
@JsonClass(generateAdapter = true)
data class AddVideoToAlbumContainer(
    /**
     * The video that should be added.
     */
    @Json(name = "video")
    val video: AddVideoToAlbum
) {
    /**
     * A secondary constructor that eliminates the redundancy of the wrapping.
     *
     * @param uri The URI of the video.
     * @param position The position of the video.
     */
    constructor(uri: String, position: Int?) : this(AddVideoToAlbum(uri, position))
}
