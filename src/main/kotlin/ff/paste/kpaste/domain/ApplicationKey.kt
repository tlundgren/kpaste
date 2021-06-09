package ff.paste.kpaste.domain

/**
 * An application key can be used as authentication token to make requests to paste.ee
 * so that pastes submitted can later be recovered using the same token. Find out more
 * at paste.ee.
 */
data class ApplicationKey(
    val key: String
)