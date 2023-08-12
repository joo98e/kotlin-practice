package collection.immutable

class ImmutableMap {
    private val map = mapOf("one" to 1, "two" to 2)

    val builderMap = buildMap {
        this["one"] = 1
        this["one"] = 2
        this["one"] = 3
        this["one"] = 4
    }

    fun getMapKeys(): List<String> {
        return map.entries.map {
            it.key
        }
    }

    fun getMapValues(): List<Int> {
        return map.map { it.value }
    }
}