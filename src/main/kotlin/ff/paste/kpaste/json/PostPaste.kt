package ff.paste.kpaste.json

/**
 * Document returned by post request "pastes".
 */
internal data class PostPaste(
    val id: String,
    val link: String
)