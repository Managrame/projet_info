

  
    fun main() {
        val m = Mouv(150.0, -1, "Courses", "Supermarché", listOf(5, 4, 2024))
    
        println("Test get_montant: " + (m.get_montant() == 150.0))
        println("Test get_sign: " + (m.get_sign() == -1))
        println("Test get_cat: " + (m.get_cat() == "Courses"))
        println("Test get_sr: " + (m.get_sr() == "Supermarché"))
    
        val datePlusTard = listOf(6, 4, 2024)
        val datePlusTot = listOf(4, 4, 2024)
        val dateMeme = listOf(5, 4, 2024)
    
        println("Test comparedate (plus tard): " + (m.comparedate(datePlusTard) < 0))
        println("Test comparedate (plus tôt): " + (m.comparedate(datePlusTot) > 0))
        println("Test comparedate (égal): " + (m.comparedate(dateMeme) == 0))
    }
