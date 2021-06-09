package ff.paste.kpaste.service

import ff.paste.kpaste.domain.*
import retrofit2.http.*

/**
 * Interface to access paste.ee api.
 * Read about what the requests do in the documentation of paste.ee.
 */
interface PasteService {
    @GET("syntaxes")
    suspend fun getSyntaxes(@Header("X-Auth-Token") token: String): List<Syntax>

    @GET("syntaxes/{id}")
    suspend fun getSyntax(@Header("X-Auth-Token") token: String, @Path("id") id: Int): Syntax

    @Headers("Content-Type: application/json")
    @POST("pastes")
    suspend fun postPasteDraft(
        @Header("X-Auth-Token") token: String,
        @Body pasteDraft: PasteDraft
    ): PasteLink

    @GET("pastes/{id}")
    suspend fun getPaste(@Header("X-Auth-Token") token: String, @Path("id") id: String): Paste

    @DELETE("pastes/{id}")
    suspend fun deletePaste(@Header("X-Auth-Token") token: String, @Path("id") id: String): Void

    @GET("users/info")
    suspend fun getKeyInfo(@Header("X-Auth-Token") token: String): KeyType

    @POST("users/authenticate")
    suspend fun getApplicationKey(
        @Header("X-Auth-Token") token: String,
        @Body credentials: Credentials
    ): ApplicationKey
}