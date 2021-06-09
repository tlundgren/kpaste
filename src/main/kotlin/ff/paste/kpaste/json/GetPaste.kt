package ff.paste.kpaste.json

/**
 * Document returned by get request "pastes/id".
 */
internal data class GetPaste(
    val success: Boolean,
    val paste: Paste
)