package ff.paste.kpaste.json

/**
 * Document returned by get request "syntaxes/id".
 */
internal data class GetSyntax(
    val syntax: Syntax,
    val success: Boolean
)