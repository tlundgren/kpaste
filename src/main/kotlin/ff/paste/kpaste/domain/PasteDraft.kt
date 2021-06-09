package ff.paste.kpaste.domain

/**
 * [PasteDraft]s are meant to be sent to paste.ee for pasting.
 */
data class PasteDraft(
    val isEncrypted: Boolean,
    val description: String,
    val sections: List<Section>
)