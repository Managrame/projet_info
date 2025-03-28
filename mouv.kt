

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

    

}

