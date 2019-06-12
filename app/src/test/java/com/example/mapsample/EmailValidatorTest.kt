package com.example.mapsample

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun isValidEmail_CorrectEmailSimple_ReturnsTrue() {
        assertThat(EmailValidator.isValidEmail("teste@test.com"), `is` (true))
    }

    @Test
    fun isValidEmail_InvalidEmailSimple_ReturnsTrue() {
        assertThat(EmailValidator.isValidEmail("test.com"), `is` (false))
    }

}