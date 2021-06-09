package ff.paste.kpaste.domain

/**
 * [Credentials] of a paste.ee account. If you use this class, make sure you do it in a secure way.
 */
data class Credentials(
    val username: String,
    val password: String
)