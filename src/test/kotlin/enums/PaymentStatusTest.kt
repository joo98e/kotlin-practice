package enums

import io.kotest.assertions.throwables.shouldThrowExactly
import org.junit.jupiter.api.Test
import kotlin.random.Random

class PaymentStatusTest {

    @Test
    fun `정의 되지 않은 value 로 valueOf 를 실행 시 Exception 발생`() {
        val values = PaymentStatus.entries
        val randomIndex = Random.nextInt(0, values.size)
        val notValidStatusName = "NotValid${values[randomIndex]}"
        shouldThrowExactly<IllegalArgumentException> {
            PaymentStatus.valueOf(notValidStatusName)
        }
    }
}