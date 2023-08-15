import collection.immutable.ImmutableList
import collection.immutable.ImmutableMap
import collection.immutable.ImmutableSet
import collection.mutable.MutableList
import collection.mutable.MutableMap
import collection.mutable.MutableSet
import data.OnlyDataClass
import developer.model.BackendDeveloper
import developer.model.FrontendDeveloper
import developer.pool.DeveloperPool
import enums.PaymentStatus
import extends.BullDog
import extends.Dog
import interator.JIterable
import interator.enums.JIterableType
import `interface`.ImplementsMyInterface
import lateInit.LateInit
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

    println("=========================")
    val onlyDataClass1 = OnlyDataClass("name1")
    val onlyDataClass2 = OnlyDataClass("name1")

    println(onlyDataClass1 == onlyDataClass2)

    val copy = onlyDataClass1.copy(name = "test")

    println("=========================")

    val frontDeveloper = FrontendDeveloper("frontend", "typescript")
    val backendDeveloper = BackendDeveloper("backend", "kotlin")

    DeveloperPool.add(frontDeveloper)
    DeveloperPool.add(backendDeveloper)

    val frontendDeveloper = DeveloperPool.getDeveloperOrElseNull(frontDeveloper)


    println(frontendDeveloper)
    println(DeveloperPool.getSize())

    println(frontendDeveloper?.introduce())

    println("=========================")
    val charSequence: CharSequence
    val string = ""

    println("=========================")
    val lateInit = LateInit()

    println(lateInit.text)

}
