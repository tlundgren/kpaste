package ff.paste.kpaste.json.adapter

import ff.paste.kpaste.json.GetSyntax
import ff.paste.kpaste.domain.Syntax as SyntaxDomain
import com.squareup.moshi.FromJson

/**
 * Produces a domain [SyntaxDomain] from a json [GetSyntax].
 */
internal class GetSyntaxAdapter {
    @FromJson
    fun getSyntax(getSyntax: GetSyntax): SyntaxDomain {
        return getSyntax.syntax.asDomainObject()
    }
}