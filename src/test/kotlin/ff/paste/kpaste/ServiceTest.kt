package ff.paste.kpaste

import ff.paste.kpaste.domain.PasteDraft
import ff.paste.kpaste.domain.Section
import ff.paste.kpaste.service.PasteServiceProvider
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertTrue

/**
 * Calls to several service methods.
 * Can be used as a base for code to find out how Paste.ee API, Retrofit, etc, work; to test your keys;
 * to test code changes, etc.
 */
class ServiceTest {
    private val key = "xxx"
    private val syntaxAutodetectId = 170
    private val pasteDraft = PasteDraft(
        false,
        "Test paste.",
        listOf(Section(1, "autodetect", "The Paste", "Contents of the paste."))
    )
    private val pasteId = "xxx"
    private val pasteToDeleteId = "yyy"

    @Test
    fun pasteService() = runBlocking {
        val service = PasteServiceProvider.pasteService

        try {
            val keyInfo = service.getKeyInfo(key)
            println("getKeyInfo, keyInfo $keyInfo")

            val syntaxes = service.getSyntaxes(key)
            println("getSyntaxes, syntaxes $syntaxes")
            val syntaxFirst = syntaxes.first()
            println("syntax first $syntaxFirst")
            val syntaxLast = syntaxes.last()
            println("syntax last $syntaxLast")
            val syntax = service.getSyntax(key, syntaxAutodetectId)
            println("getSyntax, syntax $syntax}")

            val pasteLink = service.postPasteDraft(key, pasteDraft)
            println("postPasteDraft, pasteLink $pasteLink")
            val paste = service.getPaste(key, pasteId)
            println("getPaste, paste $paste")
            service.deletePaste(key, pasteToDeleteId)
        } catch (e: Exception) {
            println("$e")
        }

        assertTrue(true)
    }
}