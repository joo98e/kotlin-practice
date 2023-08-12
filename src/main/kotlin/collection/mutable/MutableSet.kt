package collection.mutable

class MutableSet {
    val mutableSetField = mutableSetOf<Int>().apply {
        add(1)
        add(2)
        add(3)
        add(4)
    }

    val builderSet = buildSet {
        add(1)
        add(2)
        add(3)
        add(4)
    }.toMutableSet()

    fun iterate() {
        builderSet.map {

        }
    }
}