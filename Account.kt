import kotlin.collections.mutableListOf
import kotlin.collections.mutableListOf

class Account(val accountNumber: Int) {
    var balance = 0.0
    var history: MutableList<Mouv> = mutableListOf()
   
    fun add_mouv(mouv:Mouv){
        balance+=mouv.montant
        history.add(mouv);
    } 

    fun get_hist():MutableList<Mouv>{
        return history
    }

    fun get_balance():Double{
        return balance
    }

    fun sum():Double {
        var a=0.0
        for (i in history) {
            a=a+i.get_montant()
        }
        
        return a
    }

    fun swap(i:Int,j:Int){
        var b=history.get(i)
        history.set(i, history.get(j))
        history.set(j, b)
    }

    fun ordered_by_date(){
        var i =history.size;
        while (i>1) {
            for(j in 0..i-1 ){
                   if(history.get(j).comparedate(history.get(j+1).date)<0)
                   swap(j, j+1)
            }
            i=i-1;
        }
}
}