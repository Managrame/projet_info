fun main() {
    // Création d’un compte avec quelques mouvements
    val acc = Account(101)
    acc.add_mouv(Mouv(100.0, 1, "Salaire", "Entreprise", listOf(1, 1, 2024)))
    acc.add_mouv(Mouv(-50.0, -1, "Courses", "Supermarché", listOf(2, 1, 2024)))
    acc.add_mouv(Mouv(-50.0, -1, "Transport", "Bus", listOf(3, 1, 2024)))

    // Création de l'utilisateur
    val user = User("Alice", "1234", mutableListOf(acc), mutableListOf("Courses", "Transport","Salaire"))

    // Test getName + getAccounts
    println("Test getName: " + (user.getUserName() == "Alice"))
    println("Test getAccounts: " + (user.getUserAccounts().size == 1))

    // Test addAccount / removeAccount
    val newAcc = Account(102)
    user.addAccount(newAcc)
    println("Test addAccount: " + (user.getUserAccounts().contains(newAcc)))

    user.removeAccount(newAcc)
    println("Test removeAccount: " + (!user.getUserAccounts().contains(newAcc)))

    // Test addCategory / removeCategory
    user.addCategory("Loisir")
    println("Test addCategory: " + (user.getUserCategories().contains("Loisir")))

    user.removeCategory("Loisir")
    println("Test removeCategory: " + (!user.getUserCategories().contains("Loisir")))

    // Test changePassword
    user.changePassword("abcd")
    println("Test changePassword: " + (user.pwd == "abcd"))

    // Test categoriesPercentages
    val percent = user.categoriesPercentages_depense(acc)
    println("Test categoriesPercentages_depense: ")
    for ((cat, p) in percent) {
        println("$cat: ${"%.2f".format(p * 100)}%")
    }

    val percent1 = user.categoriesPercentages_revenue(acc)
    println("Test categoriesPercentages_revenue: ")
    for ((cat, p) in percent1) {
        println("$cat: ${"%.2f".format(p * 100)}%")
    }
}
