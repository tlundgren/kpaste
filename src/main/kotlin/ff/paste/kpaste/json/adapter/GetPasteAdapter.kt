package ff.paste.kpaste.json.adapter

import ff.paste.kpaste.json.GetPaste
import ff.paste.kpaste.domain.Paste as PasteDomain
import com.squareup.moshi.FromJson

/**
 * Produces a domain [PasteDomain] from a json [GetPaste].
 */
internal class GetPasteAdapter {
    @FromJson
    fun getPaste(getPaste: GetPaste): PasteDomain {
        return getPaste.paste.asDomainObject()
    }
}