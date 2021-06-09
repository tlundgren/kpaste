package ff.paste.kpaste.json.adapter

import ff.paste.kpaste.json.PasteDraft
import ff.paste.kpaste.json.Section
import ff.paste.kpaste.domain.PasteDraft as PasteDraftDomain
import com.squareup.moshi.ToJson

/**
 * Produces a json [PasteDraft] from a domain [PasteDraftDomain].
 */
internal class PasteDraftAdapter {
    @ToJson
    fun getPasteDraft(pasteDraft: PasteDraftDomain): PasteDraft {
        return PasteDraft(
            pasteDraft.isEncrypted,
            pasteDraft.description,
            pasteDraft.sections.map { section ->
                Section(section.id, section.syntaxShortName, section.name, section.contents)
            }
        )
    }
}