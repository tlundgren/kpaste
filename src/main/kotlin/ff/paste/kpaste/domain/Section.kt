package ff.paste.kpaste.domain

/**
 * [Section]s hold the actual contents of a [Paste].
 */
data class Section(
    val id: Int,
    val syntaxShortName: String,
    val name: String,
    val contents: String
)