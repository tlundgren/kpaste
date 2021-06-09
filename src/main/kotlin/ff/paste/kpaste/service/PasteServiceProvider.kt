package ff.paste.kpaste.service

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import ff.paste.kpaste.json.adapter.*
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object PasteServiceProvider {
    private const val baseUrl = "https://api.paste.ee/v1/"

    private val moshi = Moshi.Builder()
        .add(GetSyntaxAdapter())
        .add(GetSyntaxesAdapter())
        .add(PasteDraftAdapter())
        .add(GetPasteAdapter())
        .add(PostPasteAdapter())
        .add(GetKeyInfoAdapter())
        .add(GetApplicationKeyAdapter())
        .add(CredentialsAdapter())
        .addLast(KotlinJsonAdapterFactory())
        .build()

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .baseUrl(baseUrl)
        .build()

    val pasteService : PasteService by lazy { retrofit.create(PasteService::class.java) }
}