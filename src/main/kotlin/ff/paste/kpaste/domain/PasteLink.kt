package ff.paste.kpaste.domain

/**
 * A [PasteLink] is the id and url of a paste at paste.ee.
 */
data class PasteLink(
    val id: String,
    val link: String
)