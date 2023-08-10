package interator

import interator.enums.JIterableType

class JIterable private constructor(
) {

    fun iterable(type: JIterableType) {
        when (type) {
            JIterableType.LOOP_1 -> {
                println("0..3 은 0, 1, 2, 3 반복")
                for (i in 0..3) {
                    println(i)
                }
            }

            JIterableType.LOOP_2 -> {
                println("1..<3 은 0, 1, 2 반복")
                for (i in 1..<3) {
                    println(i)
                }
            }

            JIterableType.LOOP_3 -> {
                println("Step 은 step 만큼 증가 시킨다")
                for (i in 0..6 step 2) {
                    println(i)
                }
            }

            JIterableType.LOOP_ARRAY -> {
                val ints = arrayOf(1, 2, 3)
                for (i in ints) {
                    println(i)
                }
            }

            else -> println("not implementation")
        }

    }

    companion object {
        fun init(): JIterable {
            return JIterable()
        }
    }
}