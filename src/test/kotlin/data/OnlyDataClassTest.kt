package data

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class OnlyDataClassTest {

    fun <T> asReturn(data: T): T {
        return data
    }

    @Test
    fun `equals test`() {
        val dataClass1 = OnlyDataClass("test1")
        val dataClass2 = OnlyDataClass("test2")

        val asReturn = asReturn(dataClass1)
//        dataClass1.equals(asReturn) shouldBe true
        (dataClass1 == asReturn) shouldBe true

        (dataClass1 == dataClass2) shouldBe false
    }
}