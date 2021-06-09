package ff.paste.kpaste.json

/**
 * Part of a paste.
 */
internal data class Section(
    val id: Int,
    val syntax: String,
    val name: String,
    val contents: String
)