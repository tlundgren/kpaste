package ff.paste.kpaste.json.adapter

import ff.paste.kpaste.json.GetSyntaxes
import ff.paste.kpaste.domain.Syntax as SyntaxDomain
import com.squareup.moshi.FromJson

/**
 * Produces a list of domain [SyntaxDomain] from a json [GetSyntaxes].
 */
internal class GetSyntaxesAdapter {
    @FromJson
    fun getSyntaxes(getSyntaxes: GetSyntaxes): List<SyntaxDomain> {
        return getSyntaxes.syntaxes.map { syntax ->
            syntax.asDomainObject()
        }
    }
}