

import kotlin.math.sign
class Mouv(var montant:Float,var sign:Int,var cat:String, var sender_receiver:String){
   

    fun get_montant():Float{
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

    fun comparedate( l1:List<Int>, l2:List<Int>):Int{
        
        if(l1[2].compareTo(l2[2])!=0){
            return l1[2].compareTo(l2[2])
        }
        else{
            if(l1[1].compareTo(l2[1])!=0){
                return l1[1].compareTo(l2[1])
            }
            else{
                if(l1[0].compareTo(l2[0])!=0){
                    return l1[0].compareTo(l2[0])
                }
                else{
                    return 0
                }
            }
        }
    }

    

}

