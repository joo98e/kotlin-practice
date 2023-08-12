package collection.mutable

class MutableList {
    val list = mutableListOf<String>().apply {
        add("l")
        add("i")
        add("s")
        add("t")
    }

    val builderList = buildList {
        add("l")
        add("i")
        add("s")
        add("t")
    }.toMutableList()
}