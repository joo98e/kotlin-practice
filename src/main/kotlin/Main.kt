import interator.JIterable
import interator.enums.JIterableType
import nullable.JNullable
import practice.Practice

fun main(args: Array<String>) {

    val practice = Practice.init()
    practice.addFirstName("joo")
    println(practice.name)

    val jIterable = JIterable.init()
    jIterable.iterable(type = JIterableType.LOOP_1)
    jIterable.iterable(type = JIterableType.LOOP_2)
    jIterable.iterable(type = JIterableType.LOOP_3)
    jIterable.iterable(type = JIterableType.LOOP_ARRAY)

    println("=========================")

    val jNullable = JNullable.init()
    println("jNullable.elvis, ${jNullable.elvis(true, "keyword")}")
    println("jNullable.elvis, ${jNullable.elvis(false, "keyword")}")


}