package extends

open class BullDog(
    name: String
) : Dog(name) {
    override fun sound(): String {
        return if (super.sound() === "멍멍") "멍뭉" else "뭉멍"
    }
}