package enums

enum class PaymentStatus(val desc: String) {
    UNPAID("미지급"), PAID("지급 완료"), REFUNDED("환불"),
}