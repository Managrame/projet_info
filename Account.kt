class Account(val accountNumber: Int) {
    var balance = 0.0
    var history: mutableListOf<Mouv>() = mutableListOf()
    fun deposit(amount: Double) {
        balance += amount
        history.add(Mouv(amount, "deposit"))
    }

}