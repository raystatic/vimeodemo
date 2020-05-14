package com.vimeo.networking2

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.vimeo.networking2.annotations.Internal
import java.io.Serializable

/**
 * All connections for a video.
 */
@JsonClass(generateAdapter = true)
data class VideoConnections(

    /**
     * Information about the comments on this video.
     */
    @Json(name = "comments")
    val comments: Connection? = null,

    /**
     * Information about the users credited in this video.
     */
    @Json(name = "credit")
    val credit: Connection? = null,

    /**
     * Information about the users who have liked this video.
     */
    @Json(name = "likes")
    val likes: Connection? = null,

    /**
     * Information about this video's live stream stats.
     */
    @Internal
    @Json(name = "live_stats")
    val liveStats: Connection? = null,

    /**
     * Information about the video's on-demand status.
     */
    @Internal
    @Json(name = "ondemand")
    val onDemand: Connection? = null,

    /**
     * Information about this video's thumbnails.
     */
    @Json(name = "pictures")
    val pictures: Connection? = null,

    /**
     * The DRM playback status connection for this video.
     */
    @Json(name = "playback")
    val playback: Connection? = null,

    /**
     * The recommendations for this video.
     */
    @Json(name = "recommendations")
    val recommendations: Connection? = null,

    /**
     * Related content for this video.
     */
    @Json(name = "related")
    val related: Connection? = null,

    /**
     * Information about the video's season.
     */
    @Json(name = "season")
    val season: VideoSeasonConnection? = null,

    /**
     * Information about this video's text tracks.
     */
    @Json(name = "texttracks")
    val textTracks: Connection? = null,

    /**
     * Information about this video's VOD trailer.
     */
    @Json(name = "trailer")
    val trailer: Connection? = null,

    /**
     * Information about the user privacy of this video, if the video privacy is users.
     */
    @Json(name = "users_with_access")
    val usersWithAccess: Connection? = null,

    /**
     * Connection to get all the logged-in user's available albums that this video can be added to.
     */
    @Json(name = "available_albums")
    val availableAlbums: Connection? = null,

    /**
     * Connection to get all the logged-in user's available channels that this video can be added to.
     */
    @Json(name = "available_channels")
    val availableChannels: Connection? = null,

    /**
     * Connection to get the Publish to Social data for this video.
     */
    @Json(name = "publish_to_social")
    val publish: PublishJobConnection? = null
) : Serializable {

    companion object {
        private const val serialVersionUID = -16585L
    }
}
