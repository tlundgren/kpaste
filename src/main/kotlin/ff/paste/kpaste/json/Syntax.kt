package ff.paste.kpaste.json

/**
 * Part of the document returned by requests "syntaxes/id", "syntaxes".
 */
internal data class Syntax(
    val id: Int,
    val short: String,
    val name: String
)