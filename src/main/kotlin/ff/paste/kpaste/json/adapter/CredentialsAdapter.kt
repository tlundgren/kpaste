package ff.paste.kpaste.json.adapter

import com.squareup.moshi.ToJson
import ff.paste.kpaste.json.Credentials
import ff.paste.kpaste.domain.Credentials as CredentialsDomain

/**
 * Produces a json [Credentials] from a domain [CredentialsDomain].
 */
internal class CredentialsAdapter {
    @ToJson
    fun getCredentials(credentials: CredentialsDomain): Credentials {
        return Credentials(credentials.username, credentials.password)
    }
}