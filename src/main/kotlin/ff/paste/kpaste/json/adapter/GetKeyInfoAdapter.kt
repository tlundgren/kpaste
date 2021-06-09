package ff.paste.kpaste.json.adapter

import ff.paste.kpaste.domain.KeyType
import ff.paste.kpaste.json.GetKeyInfo
import com.squareup.moshi.FromJson

/**
 * Produces a domain [KeyType] from a json [GetKeyInfo].
 */
internal class GetKeyInfoAdapter {
    @FromJson
    fun getKeyType(getKeyInfo: GetKeyInfo): KeyType {
        return KeyType(getKeyInfo.type)
    }
}