package ff.paste.kpaste.json.adapter

import ff.paste.kpaste.json.Syntax
import ff.paste.kpaste.domain.Syntax as SyntaxDomain
/**
 * Produces a domain [SyntaxDomain] from a json [Syntax], and vice versa.
 */
internal fun Syntax.asDomainObject(): SyntaxDomain {
    return SyntaxDomain(id, short, name)
}