fun main() {
    val acc = Account(12345)

    // Création de mouvements
    val m1 = Mouv(100.0, 1, "Salaire", "Entreprise", listOf(1, 1, 2024))
    val m2 = Mouv(-30.0, -1, "Courses", "Supermarché", listOf(5, 2, 2024))
    val m3 = Mouv(-10.0, -1, "Café", "Starbucks", listOf(20, 3, 2024))

    // Ajout des mouvements
    acc.add_mouv(m1)
    acc.add_mouv(m2)
    acc.add_mouv(m3)

    println("Test add_mouv et get_balance: " + (acc.get_balance() == 60.0))
    println("Test sum(): " + (acc.sum() == 60.0))

    // Test swap
    acc.swap(0, 2)
    println("Test swap: " + (acc.get_hist()[0] == m3 && acc.get_hist()[2] == m1))

    // Test tri par date
    acc.ordered_by_date()
    println("Test ordered_by_date: ")
    acc.get_hist().forEach { println("${it.date}") }

    // Test previsionel
    val period = listOf(0, 2, 0)  // 2 mois avant
    val cur = listOf(1, 4, 2024)  // 1 avril 2024

    val prev = acc.previsionel(period, cur)

    println("Test previsionel:")
    prev.forEach { println(it) }
}
