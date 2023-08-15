package developer.type

interface Developer {
    val name: String
    val language: String

    fun introduce():String {
        return "저의 이름은 ${name}이고, 주 언어는 $language 입니다."
    }
}