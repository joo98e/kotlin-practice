package developer.pool

import developer.model.Developer

object DeveloperPool {
    private val pool = mutableMapOf<String, Developer>()

    fun add(developer: Developer) {
        pool[developer.name] = developer
    }

    fun getSize(): Int {
        return pool.size
    }

    fun getDeveloperOrElseNull(developer: Developer): Developer? {
        return pool[developer.name]
    }
}