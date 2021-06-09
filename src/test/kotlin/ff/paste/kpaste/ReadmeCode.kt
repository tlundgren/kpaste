package ff.paste.kpaste

import ff.paste.kpaste.domain.PasteDraft
import ff.paste.kpaste.domain.Section
import ff.paste.kpaste.service.PasteServiceProvider
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertTrue

/**
 * This class is meant to serve as the place where to write code for the landing page.
 * As a test, it allows verifying the code would work.
 */
class ReadmeCode {
    @Test
    fun functionReadmeCode() = runBlocking {
        val developerKey = "xxx"
        val someKey = "yyy"

        // Retrieve the service
        val service = PasteServiceProvider.pasteService

        // Submit a paste using your developer key
        // first, create a paste draft
        val pasteDraft = PasteDraft(
            false,
            "Greetings paste.",
            listOf(Section(1, "autodetect", "Greetings", "Hello, world."))
        )
        // then, submit the draft
        try {
            val pasteLink = service.postPasteDraft(developerKey, pasteDraft)
            // print link and id of created paste
            println("$pasteLink")
        } catch (e: Exception) {
            // handle exception
        }

        // Posting a paste using an application key follows the same procedure - if you
        // do not know about the different keys available, read paste.ees documentation.

        // Finding out about a key
        try {
            val info = service.getKeyInfo(someKey)
            println("$info")
        } catch (e: Exception) {
            // handle exception
        }

        // You can also get and delete a paste, get a list of the syntax available, get
        // the details of a specific syntax, and more.
    }
}