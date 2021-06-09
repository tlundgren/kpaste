package ff.paste.kpaste.json

/**
 * Document returned by get request "syntaxes".
 */
internal class GetSyntaxes(
    val syntaxes: List<Syntax>,
    val success: Boolean
)