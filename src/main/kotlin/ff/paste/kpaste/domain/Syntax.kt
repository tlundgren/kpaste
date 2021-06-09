package ff.paste.kpaste.domain

/**
 * Tells paste.ee the structure a text conforms to.
 */

data class Syntax(
    val id: Int,
    val shortName: String,
    val name: String
)