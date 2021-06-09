package ff.paste.kpaste.domain

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

/**
 * A [Paste] is a message stored at paste.ee. It has some metadata, and its actual contents are
 * stored in "sections".
 */
data class Paste(
    val id: String,
    val isEncrypted: Boolean,
    val description: String,
    val viewCount: Int,
    val creationDateString: String,
    val expirationDateString: String,
    val sections: List<Section>
) {
    /**
     * If [isCreationDateValid], [creationDateString] as [LocalDateTime], else [LocalDateTime.MIN].
     */
    val creationDate: LocalDateTime
    val isCreationDateValid: Boolean
    /**
     * If [isExpirationDateValid], [expirationDateString] as [LocalDateTime], else [LocalDateTime.MIN].
     */
    val expirationDate: LocalDateTime
    val isExpirationDateValid: Boolean

    init {
        val pasteeDateFormatter = DateTimeFormatter.ofPattern("yyyy-M-d H:mm:ss")

        var result = try {
            Pair(LocalDateTime.parse(creationDateString, pasteeDateFormatter), true)
        } catch (e: DateTimeParseException) {
            Pair(LocalDateTime.MIN, false)
        }
        creationDate = result.first
        isCreationDateValid = result.second

        result = try {
            Pair(LocalDateTime.parse(expirationDateString, pasteeDateFormatter), true)
        } catch (e: DateTimeParseException) {
            Pair(LocalDateTime.MIN, false)
        }
        expirationDate = result.first
        isExpirationDateValid = result.second
    }
}