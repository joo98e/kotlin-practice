import collection.immutable.ImmutableList
import collection.immutable.ImmutableMap
import collection.immutable.ImmutableSet
import collection.mutable.MutableList
import collection.mutable.MutableMap
import collection.mutable.MutableSet
import enums.PaymentStatus
import extends.BullDog
import extends.Dog
import interator.JIterable
import interator.enums.JIterableType
import `interface`.ImplementsMyInterface
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

    println("=========================")
    val dog = Dog("멍멍")
    val bullDog = BullDog("뭉멍")

    println(dog.sound())
    println(bullDog.sound())

    println("=========================")
    val myInterface = ImplementsMyInterface("lastName")
    myInterface.addFirstName("first Name")
    println(myInterface.lastName)

    val status = PaymentStatus.valueOf("PAID")
    println(status.desc)

    println("=========================")
    val immutableList = ImmutableList()
    val immutableMap = ImmutableMap()
    val immutableSet = ImmutableSet()

    val mutableList = MutableList()
    val mutableSet = MutableSet()
    val mutableMap = MutableMap()

}
