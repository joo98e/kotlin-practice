package interator

import interator.enums.JIterableType

class JIterable private constructor(
) {

    fun iterable(type: JIterableType) {
        println("=========================")

        when (type) {
            JIterableType.LOOP_1 -> {
                for (i in 0..3) {
                    println("0..3 은 0, 1, 2, 3 반복, $i")
                }
            }

            JIterableType.LOOP_2 -> {
                for (i in 1..<3) {
                    println("1..<3 은 0, 1, 2 반복 $i")
                }
            }

            JIterableType.LOOP_3 -> {
                for (i in 0..6 step 2) {
                    println("Step 은 step 만큼 증가 시킨다 $i")
                }
            }

            JIterableType.LOOP_ARRAY -> {
                val ints = arrayOf(1, 2, 3)
                for (i in ints) {
                    println("list 를 활용한 반복은 길이 만큼 반복 한다$i")
                }
            }

            else -> throw NotImplementedError("")
        }

    }

    companion object {
        fun init(): JIterable {
            return JIterable()
        }
    }
}