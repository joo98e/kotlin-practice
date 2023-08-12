package collection.immutable

class ImmutableSet {
    val set = setOf(1, 2, 3, 4)

    val buildSet = buildSet {
        add(1)
        add(2)
        add(3)
        add(4)
    }
}