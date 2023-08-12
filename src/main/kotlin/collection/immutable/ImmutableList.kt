package collection.immutable

class ImmutableList {
    val list = listOf("l", "i", "s", "t")

    val builderList = buildList {
        add("l")
        add("i")
        add("s")
        add("t")
    }

    fun iterate() {
        builderList.map {

        }
    }
}