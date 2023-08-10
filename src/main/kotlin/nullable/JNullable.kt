package nullable

class JNullable private constructor() {
    fun elvis(condition: Boolean, keyword: String = "joo98e"): Int {
        val a: String? = if (condition) keyword else null
        return a?.length ?: 0
    }

    companion object {
        fun init(): JNullable {
            return JNullable()
        }
    }
}