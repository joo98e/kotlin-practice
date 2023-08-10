package practice

class Practice private constructor(
    name: String,
) {
    var name: String = name
        private set

    fun addFirstName(firstName: String = "Joo") {
        this.name = "$firstName, ${this.name}"
    }

    companion object {
        fun init(lastName: String = "joo98e"): Practice {
            return Practice(lastName)
        }
    }
}