@file:JvmName("NotificationUtils")

package com.vimeo.networking2

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.vimeo.networking2.enums.NotificationType
import com.vimeo.networking2.enums.asEnum
import java.io.Serializable
import java.util.Date

/**
 * Notification data.
 */
@JsonClass(generateAdapter = true)
data class Notification(

    /**
     * The video associated with a video like notification.
     */
    @Json(name = "clip")
    val video: Video? = null,

    /**
     * The clip comment associated with a comment notification.
     */
    @Json(name = "comment")
    val comment: Comment? = null,

    /**
     * The ISODate time a notification was created.
     */
    @Json(name = "created_time")
    val createdTime: Date? = null,

    /**
     * The clip credit associated with a credit notification.
     */
    @Json(name = "credit")
    val credit: Credit? = null,

    /**
     * Is the notification marked as new.
     */
    @Json(name = "new")
    val new: Boolean? = null,

    /**
     * Is the notification marked as seen.
     */
    @Json(name = "seen")
    val seen: Boolean? = null,

    /**
     * The type of notification.
     * @see Notification.type
     */
    @Json(name = "type")
    val rawType: String? = null,

    /**
     * The notification's canonical relative URI.
     */
    @Json(name = "uri")
    val uri: String? = null,

    /**
     * The user associated with a user follow notification.
     */
    @Json(name = "user")
    val user: User? = null

) : Serializable {

    companion object {
        private const val serialVersionUID = -29L
    }
}

/**
 * @see Notification.rawType
 * @see NotificationType
 */
val Notification.type: NotificationType
    get() = rawType.asEnum(NotificationType.UNKNOWN)
