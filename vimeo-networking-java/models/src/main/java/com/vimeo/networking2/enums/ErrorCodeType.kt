package com.vimeo.networking2.enums

/**
 * All the error codes that can come back from the Vimeo Api.
 */
enum class ErrorCodeType(override val value: String?) : StringValue {

    BAD_REQUEST("1000"),

    UNAUTHORIZED("1001"),

    FORBIDDEN("1002"),

    NOT_FOUND("1003"),

    INTERNAL_SERVER_ERROR("1004"),

    NOT_IMPLEMENTED("1005"),

    SERVICE_UNAVAILABLE("1006"),

    MISSING_REQUIRED_HEADER("2000"),

    MISSING_REQUIRED_QUERY_PARAM("2001"),

    MISSING_REQUIRED_BODY("2002"),

    UNSUPPORTED_HEADER("2100"),

    UNSUPPORTED_QUERY_PARAM("2101"),

    INVALID_HEADER_VALUE("2200"),

    INVALID_QUERY_PARAM_VALUE("2201"),

    INVALID_URI("2202"),

    INVALID_AUTHENTICATION_INFO("2203"),

    INVALID_INPUT("2204"),

    INVALID_BODY("2205"),

    INVALID_ACCEPT_HEADER("2206"),

    INVALID_NO_INPUT("2207"),

    INVALID_INPUT_GRANT_TYPE("2219"),

    INVALID_INPUT_EMBED_TYPE("2220"),

    INVALID_INPUT_VIEW_TYPE("2221"),

    INVALID_INPUT_VIDEO_PASSWORD_MISMATCH("2222"),

    INVALID_INPUT_VIDEO_NO_PASSWORD("2223"),

    INVALID_TOKEN("2300"),

    NON_EXISTENT_PROPERTY("2301"),

    MALFORMED_TOKEN("2302"),

    UNABLE_TO_CREATE_USER_CAN_NOT_VALIDATE_TOKEN("2315"),

    APP_DOES_NOT_HAVE_DELETE_CAPABILITY("2500"),

    INVALID_INPUT_NON_JSON_CONTENT_TYPE("2700"),

    PRODUCT_NOT_FOUND("2507"),

    INVALID_INPUT_GOOGLE_RECEIPT_VALIDATION_FAILED("3113"),

    INVALID_INPUT_RECEIPT_VALIDATION_UNSUCCESSFUL("3115"),

    OPERATION_TIMED_OUT("4000"),

    RESOURCE_NOT_FOUND("5000"),

    ACCESS_TOKEN_NOT_GENERATED("5001"),

    METHOD_NOT_IMPLEMENTED("6000"),

    SERVER_BUSY("7000"),

    SERVER_OVERLOADED("7100"),

    INVALID_CREDENTIALS("8000"),

    UNAUTHORIZED_CLIENT("8001"),

    EMPTY_AUTHENTICATION("8003"),

    INVALID_INPUT_NAME_TOO_LONG("2208"),

    INVALID_INPUT_NO_PASSWORD("2209"),

    INVALID_INPUT_PASSWORD_TOO_SHORT("2210"),

    INVALID_INPUT_PASSWORD_TOO_SIMPLE("2211"),

    INVALID_INPUT_PASSWORD_TOO_OBVIOUS("2212"),

    INVALID_INPUT_NO_NAME("2213"),

    INVALID_INPUT_NO_EMAIL("2214"),

    INVALID_INPUT_NO_RFC_822_EMAIL("2215"),

    INVALID_INPUT_EMAIL_TOO_LONG("2216"),

    INVALID_INPUT_EMAIL_NOT_RECOGNIZED("2217"),

    INVALID_INPUT_PASSWORD_EMAIL_MISMATCH("2218"),

    // Auth Errors
    UNABLE_TO_CREATE_USER_INVALID_TOKEN("2303"),

    UNABLE_TO_CREATE_USER_NON_EXISTENT_PROPERTY("2304"),

    UNABLE_TO_CREATE_USER_MALFORMED_TOKEN("2305"),

    UNABLE_TO_CREATE_USER_NO_TOKEN("2306"),

    UNABLE_TO_CREATE_USER_TOKEN_CAN_NOT_DECRYPT("2307"),

    UNABLE_TO_CREATE_USER_TOKEN_TOO_LONG("2308"),

    UNABLE_TO_LOGIN_NON_EXISTENT_PROPERTY("2310"),

    UNABLE_TO_LOGIN_MALFORMED_TOKEN("2311"),

    UNABLE_TO_LOGIN_NO_TOKEN("2312"),

    UNABLE_TO_LOGIN_TOKEN_CAN_NOT_DECRYPT("2313"),

    UNABLE_TO_LOGIN_TOKEN_TOO_LONG("2314"),

    // Google Auth Errors
    UNABLE_TO_CREATE_USER_MISSING_EMAIL_GOOGLE("2325"),

    UNABLE_TO_CREATE_USER_TOKEN_TOO_LONG_GOOGLE("2326"),

    UNABLE_TO_LOGIN_NO_TOKEN_GOOGLE("2327"),

    UNABLE_TO_LOGIN_NON_EXISTENT_PROPERTY_GOOGLE("2328"),

    UNABLE_TO_LOGIN_EMAIL_NOT_FOUND_VIA_TOKEN_GOOGLE("2329"),

    UNABLE_TO_CREATE_USER_INSUFFICIENT_PERMISSIONS_GOOGLE("2330"),

    UNABLE_TO_CREATE_USER_CAN_NOT_VALIDATE_TOKEN_GOOGLE("2331"),

    UNABLE_TO_CREATE_USER_DAILY_LIMIT_GOOGLE("2332"),

    UNABLE_TO_LOGIN_INSUFFICIENT_PERMISSIONS_GOOGLE("2333"),

    UNABLE_TO_LOGIN_CAN_NOT_VALIDATE_TOKEN_GOOGLE("2334"),

    UNABLE_TO_LOGIN_DAILY_LIMIT_GOOGLE("2335"),

    UNABLE_TO_LOGIN_GOOGLE_COULD_NOT_VERIFY_TOKEN("2336"),

    UNABLE_TO_CREATE_USER_GOOGLE_COULD_NOT_VERIFY_TOKEN("2337"),

    TWITTER_COULD_NOT_VERIFY_TOKEN("2339"),

    LINKEDIN_COULD_NOT_VERIFY_TOKEN("2340"),

    // Albums
    ALBUM_THUMBNAIL_ACCESS_FORBIDDEN("3200"),

    ALBUM_EDIT_FORBIDDEN_FOR_AUTHENTICATED_USER("3429"),

    ADD_VIDEO_TO_ALBUM_FORBIDDEN("3433"),

    UNEXPECTED_ALBUM_THUMBNAIL_EXCEPTION("4016"),

    // Generic Auth Errors
    USER_EXISTS("2400"),

    EMAIL_BLOCKED("2401"),

    SPAMMER_USER("2402"),

    PURGATORY_USER("2403"),

    URL_UNAVAILABLE("2404"),

    USER_NOT_AUTHORIZED_TO_DELETE_ACCOUNT("2406"),

    CONNECTED_APP_ALREADY_EXISTS("2419"),

    CONNECTED_APP_IS_CONNECTED_TO_ANOTHER_ACCOUNT("2420"),

    INVALID_INPUT_BAD_UPLOAD_TYPE("2230"),

    INVALID_INPUT_NO_CLIP_NAME("2231"),

    INVALID_INPUT_BAD_CLIP_PRIVACY_VIEW("2232"),

    INVALID_INPUT_CLIP_PRIVACY_PASSWORD_MISSING_PASSWORD("2233"),

    INVALID_INPUT_BAD_LICENSE_TYPE("2234"),

    INVALID_INPUT_BAD_LANGUAGE_TYPE("2235"),

    INVALID_INPUT_BAD_REVIEW_LINK("2236"),

    INVALID_INPUT_BAD_CLIP_PRIVACY_ADD("2237"),

    INVALID_INPUT_BAD_CLIP_PRIVACY_DOWNLOAD("2238"),

    INVALID_INPUT_BAD_CLIP_PRIVACY_EMBED("2239"),

    INVALID_INPUT_BAD_CLIP_PRIVACY_COMMENTS("2240"),

    INVALID_INPUT_BAD_USER_URI("2241"),

    INVALID_INPUT_NO_USER_URI("2242"),

    INVALID_INPUT_NO_CLIP_USERS("2244"),

    INVALID_INPUT_EMPTY_USERS_ARRAY("2245"),

    CLIP_PRIVACY_NOT_SET_TO_USERS("2246"),

    INVALID_INPUT_NO_CLIP_PRIVACY_WHEN_SETTING_USERS("2247"),

    INVALID_INPUT_BAD_CLIP_PRIVACY_FOR_SETTING_USERS("2248"),

    INVALID_INPUT_BAD_CLIP_DESCRIPTION_TYPE("2249"),

    INVALID_INPUT_CLIP_NAME_TOO_LONG("2250"),

    INVALID_INPUT_CLIP_DESCRIPTION_TOO_LONG("2251"),

    INVALID_INPUT_BAD_CLIP_NAME_TYPE("2252"),

    INVALID_INPUT_EMPTY_USER_NAME("2253"),

    USER_NOT_ALLOWED_TO_SET_PUBLIC_OR_NOBODY_CLIP_PRIVACY("2409"),

    USER_NOT_ALLOWED_TO_SET_USERS_CLIP_PRIVACY("2410"),

    USER_NOT_ALLOWED_TO_SET_DISABLE_CLIP_PRIVACY("2411"),

    USER_NOT_ALLOWED_TO_SET_CONTACTS_CLIP_PRIVACY("2412"),

    // Upload
    UNABLE_TO_UPLOAD_VIDEO_MISSING_USER_ID_FOR_AUTHENTICATION_TOKEN("8002"),

    USER_NOT_ALLOWED_TO_UPLOAD_VIDEO_UNVERIFIED_EMAIL("3400"),

    UPLOAD_TICKET_CREATION_ERROR("4003"),

    UPLOAD_QUOTA_SIZE_EXCEEDED_CAP("3428"),

    UPLOAD_QUOTA_SIZE_EXCEEDED("4101"),

    UPLOAD_QUOTA_COUNT_EXCEEDED("4102"),

    INVALID_INPUT_BAD_CLIP_SIZE_TYPE("2254"),

    INVALID_INPUT_BAD_CLIP_UPGRADE_TO_1080_TYPE("2255"),

    INVALID_INPUT_BAD_CLIP_REDIRECT_URL_TYPE("2256"),

    INVALID_INPUT_BAD_CLIP_MACHINE_ID_TYPE("2257"),

    INVALID_INPUT_BAD_CLIP_CREATE_CLIP_TYPE("2258"),

    INVALID_INPUT_BAD_CLIP_CONTENT_RATINGS_TYPE("2259"),

    INVALID_INPUT_BAD_CLIP_SHOW_LIKE_BUTTON_TYPE("2260"),

    INVALID_INPUT_BAD_CLIP_SHOW_WATCH_LATER_BUTTON("2261"),

    INVALID_INPUT_BAD_CLIP_SHOW_SHARE_BUTTON_TYPE("2262"),

    INVALID_INPUT_BAD_CLIP_SHOW_EMBED_BUTTON_TYPE("2263"),

    INVALID_INPUT_BAD_CLIP_ALLOW_HD_EMBED_TYPE("2264"),

    INVALID_INPUT_BAD_CLIP_SHOW_FULLSCREEN_BUTTON_TYPE("2265"),

    INVALID_INPUT_BAD_CLIP_SHOW_VIMEO_LOGO_TYPE("2266"),

    INVALID_INPUT_BAD_CLIP_SHOW_CUSTOM_LOGO_TYPE("2267"),

    INVALID_INPUT_BAD_CLIP_CUSTOM_LOGO_STICKY_TYPE("2268"),

    INVALID_INPUT_BAD_CLIP_CUSTOM_LOGO_LINK_URL_TYPE("2269"),

    INVALID_INPUT_BAD_CLIP_SHOW_PLAYBAR_URL_TYPE("2270"),

    INVALID_INPUT_BAD_CLIP_SHOW_VOLUME_TYPE("2271"),

    INVALID_INPUT_BAD_CLIP_COLOR_TYPE("2272"),

    INVALID_INPUT_BAD_CLIP_PRIVACY_PASSWORD_EMPTY_PASSWORD("2273"),

    INVALID_INPUT_BAD_CLIP_SHOW_BYLINE_TYPE("2274"),

    INVALID_INPUT_BAD_CLIP_SHOW_PORTRAIT_TYPE("2275"),

    INVALID_INPUT_BAD_CLIP_SHOW_TITLE_TYPE("2276"),

    INVALID_INPUT_BAD_CLIP_SHOW_SCALING_BUTTON_TYPE("2277"),

    APP_DOES_NOT_HAVE_PROTECTED_VIDEO_CAPABILITY("2501"),

    INVALID_INPUT_DRM_NOT_ENABLED_ON_CLIP("2297"),

    INVALID_INPUT_BAD_LOGGING_PLAY_TYPE("2298"),

    USER_CANNOT_STREAM_CLIP("3419"),

    USER_HIT_STREAM_LIMITS_FOR_VIDEO("3420"),

    USER_HIT_DEVICE_LIMIT("3421"),

    DRM_INVALID_CREDENTIALS("8300"),

    // Publish to Social
    PTS_YOUTUBE_NO_CONNECTED_APP("12112"),
    PTS_YOUTUBE_TITLE_MISSING("12100"),
    PTS_YOUTUBE_TITLE_TOO_LONG("12104"),
    PTS_YOUTUBE_DESCRIPTION_TOO_LONG("12105"),
    PTS_YOUTUBE_PRIVACY_MISSING("12101"),
    PTS_YOUTUBE_INVALID_PRIVACY("12102"),
    PTS_YOUTUBE_INVALID_CATEGORY_ID("12118"),
    PTS_YOUTUBE_TAGS_TOO_LONG("12106"),
    PTS_FACEBOOK_NO_CONNECTED_APP("12111"),
    PTS_FACEBOOK_TITLE_TOO_LONG("12107"),
    PTS_FACEBOOK_DESCRIPTION_TOO_LONG("12108"),
    PTS_FACEBOOK_DESTINATION_MISSING("12103"),
    PTS_FACEBOOK_NO_VALID_DESTINATIONS("12109"),
    PTS_FACEBOOK_INVALID_DESTINATION("12110"),
    PTS_FACEBOOK_INVALID_CATEGORY_ID("12113"),
    PTS_FACEBOOK_INVALID_EMBEDDING_FLAG("12114"),
    PTS_FACEBOOK_INVALID_NEWS_FEED_FLAG("12115"),
    PTS_FACEBOOK_INVALID_SECRET_VIDEO_FLAG("12116"),
    PTS_FACEBOOK_INVALID_SOCIAL_INTERACTIONS_FLAG("12117"),

    /**
     * The default code that will be returned if the code returned from the server isn't
     * enumerated below.
     */
    DEFAULT(null)

}
