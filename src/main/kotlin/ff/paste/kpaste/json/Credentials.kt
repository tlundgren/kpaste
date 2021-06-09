package ff.paste.kpaste.json

/**
 * Document body for a post request "users/authenticate".
 */
internal data class Credentials(
    val username: String,
    val password: String
)