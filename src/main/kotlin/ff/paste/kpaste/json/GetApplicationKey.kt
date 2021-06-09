package ff.paste.kpaste.json

/**
 * Document returned by get request "users/authenticate".
 */
internal data class GetApplicationKey(
    val success: Boolean,
    val key: String
)