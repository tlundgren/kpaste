package ff.paste.kpaste.json

/**
 * Part of the document returned by request "pastes/id".
 */
internal data class Paste(
    val id: String,
    val encrypted: Boolean,
    val description: String,
    val views: Int,
    val created_at: String,
    val expires_at: String,
    val sections: List<Section>
)