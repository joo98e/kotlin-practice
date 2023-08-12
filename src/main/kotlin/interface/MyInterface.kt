package `interface`

interface MyInterface {
    var lastName: String

    fun addFirstName(firstName: String) {
        this.lastName = "$firstName ${this.lastName}"
    }
}