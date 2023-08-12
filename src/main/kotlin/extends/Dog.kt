package extends

open class Dog(
    val name: String,
) {
    open fun sound(): String {
        return "멍멍"
    }
}