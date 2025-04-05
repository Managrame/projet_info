import kotlin.collections.mutableListOf
import kotlin.collections.mutableListOf
import kotlin.Int

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
            for(j in 1..i-1 ){
                   if(history.get(j-1).comparedate(history.get(j).date)<0)
                   swap(j, j+1)
            }
            i=i-1;
        }
    }


    fun previsionel(period:List<Int>,cur:List<Int>):MutableList<Double>{
        ordered_by_date()
        var l=mutableListOf<Double>()
        var d=listOf<Int>(cur.get(0)-period.get(0),cur.get(1)-period.get(1),cur.get(2)-period.get(2))
        for (i in history) {
            if(i.comparedate(d)>0){
                l.add(i.get_montant())
            }
        }
        var m=l.sum()/l.size
        var s=mutableListOf<Double>()
        var a=balance
        for (i in 0 until l.size) {
            a=a+m
            s.add(a)
            
        }
      
        return s
    }
}