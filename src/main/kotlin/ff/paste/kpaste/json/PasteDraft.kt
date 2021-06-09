package ff.paste.kpaste.json

/**
 * Document body for a post request "pastes".
 */
internal data class PasteDraft(
    val encrypted: Boolean,
    val description: String,
    val sections: List<Section>
)