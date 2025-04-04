import kotlin.collections.mutableListOf
import kotlin.collections.mutableListOf
class Account(val accountNumber: Int) {
    var balance = 0.0
    var history: MutableList<Mouv> = mutableListOf()
   
    fun deposit(amount: Float,cat:String,sr:String,date:List<Int>) {
        balance += amount
        history.add(Mouv(amount, amount.compareTo(0),cat,sr,date))
    }

}