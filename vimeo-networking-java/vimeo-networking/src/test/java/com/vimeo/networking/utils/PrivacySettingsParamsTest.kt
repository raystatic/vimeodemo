package com.vimeo.networking.utils

import com.vimeo.networking.Vimeo
import com.vimeo.networking2.enums.CommentPrivacyType
import com.vimeo.networking2.enums.EmbedPrivacyType
import com.vimeo.networking2.enums.ViewPrivacyType
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

/**
 * Tests for {@link PrivacySettingsParams}.
 */
class PrivacySettingsParamsTest {

    @Test
    fun `Check privacy settings are set`() {
        val privacySettingsParams = PrivacySettingsParams()
        privacySettingsParams
                .comments(CommentPrivacyType.ANYBODY)
                .embed(EmbedPrivacyType.PRIVATE)
                .view(ViewPrivacyType.ANYBODY)
                .addToCollections(true)
                .download(true)

        with(privacySettingsParams.params) {
            assertThat(this[Vimeo.PARAMETER_VIDEO_COMMENTS]).isEqualTo(CommentPrivacyType.ANYBODY.value)
            assertThat(this[Vimeo.PARAMETER_VIDEO_EMBED]).isEqualTo(EmbedPrivacyType.PRIVATE.value)
            assertThat(this[Vimeo.PARAMETER_VIDEO_VIEW]).isEqualTo(ViewPrivacyType.ANYBODY.value)
            assertThat(this[Vimeo.PARAMETER_VIDEO_ADD]).isEqualTo(true)
            assertThat(this[Vimeo.PARAMETER_VIDEO_DOWNLOAD]).isEqualTo(true)
        }
    }

    @Test
    fun `Check empty privacy settings are null`() {
        with(PrivacySettingsParams().params) {
            assertThat(this[Vimeo.PARAMETER_VIDEO_COMMENTS]).isNull()
            assertThat(this[Vimeo.PARAMETER_VIDEO_EMBED]).isNull()
            assertThat(this[Vimeo.PARAMETER_VIDEO_VIEW]).isNull()
            assertThat(this[Vimeo.PARAMETER_VIDEO_ADD]).isNull()
            assertThat(this[Vimeo.PARAMETER_VIDEO_DOWNLOAD]).isNull()
            assertThat(this).isEmpty()
        }
    }

}
