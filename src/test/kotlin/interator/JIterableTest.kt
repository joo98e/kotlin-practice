package interator

import interator.enums.JIterableType
import org.junit.jupiter.api.Test

class JIterableTest {

    @Test
    fun iterable() {
        val jIterable = JIterable.init()

        jIterable.iterable(JIterableType.LOOP_1)
    }
}