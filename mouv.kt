

import kotlin.math.sign
class Mouv(var montant:Double,var sign:Int,var cat:String, var sender_receiver:String,var date:List<Int>){
   

    fun get_montant():Double{
        return montant
    }
   
    fun get_sign():Int{
        return sign
    }


    fun get_cat():String{
        return cat
    }

    fun get_sr():String{
        return sender_receiver
    }

    fun comparedate(  l2:List<Int>):Int{
        
        if(date[2].compareTo(l2[2])!=0){
            return date[2].compareTo(l2[2])
        }
        else{
            if(date[1].compareTo(l2[1])!=0){
                return date[1].compareTo(l2[1])
            }
            else{
                if(date[0].compareTo(l2[0])!=0){
                    return date[0].compareTo(l2[0])
                }
                else{
                    return 0
                }
            }
        }
    }

    

}

