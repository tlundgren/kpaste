package ff.paste.kpaste.json.adapter

import ff.paste.kpaste.domain.PasteLink
import ff.paste.kpaste.json.PostPaste
import com.squareup.moshi.FromJson

/**
 * Produces a domain [PasteLink] from a json [PostPaste].
 */
internal class PostPasteAdapter {
    @FromJson
    fun getPasteLink(postPaste: PostPaste): PasteLink {
        return PasteLink(postPaste.id, postPaste.link)
    }
}