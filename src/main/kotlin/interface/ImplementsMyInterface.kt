package `interface`

class ImplementsMyInterface(override var lastName: String) : MyInterface {

    override fun addFirstName(firstName: String) {
        super.addFirstName(firstName)
    }
}