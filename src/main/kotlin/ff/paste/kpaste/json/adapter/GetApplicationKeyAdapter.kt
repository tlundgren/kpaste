package ff.paste.kpaste.json.adapter

import ff.paste.kpaste.domain.ApplicationKey
import ff.paste.kpaste.json.GetApplicationKey
import com.squareup.moshi.FromJson

/**
 * Produces a domain [ApplicationKey] from a json [GetApplicationKey].
 */
internal class GetApplicationKeyAdapter {
    @FromJson
    fun getApplicationKey(getApplicationKey: GetApplicationKey): ApplicationKey {
        return ApplicationKey(getApplicationKey.key)
    }
}