package collection.mutable

class MutableMap {
    private val mutableMap = mutableMapOf<String, Int>()

    init {
        mutableMap["one"] = 1
        mutableMap["two"] = 2
    }

    val builderMap = buildMap {
        this["one"] = 1
        this["one"] = 2
        this["one"] = 3
        this["one"] = 4
    }.toMutableMap()
}