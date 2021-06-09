package ff.paste.kpaste.json.adapter

import ff.paste.kpaste.json.Paste
import ff.paste.kpaste.domain.Paste as PasteDomain
import ff.paste.kpaste.domain.Section as SectionDomain

/**
 * Produces a domain [PasteDomain] from a json [Paste].
 */
internal fun Paste.asDomainObject(): PasteDomain {
    return PasteDomain(
        id,
        encrypted,
        description,
        views,
        created_at,
        expires_at,
        sections.map { section ->
            SectionDomain(section.id, section.syntax, section.name, section.contents)
        }
    )
}