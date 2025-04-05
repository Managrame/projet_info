
class User(val name:String, var pwd:String, var accounts:MutableList<Account>, var categories:MutableList<String>){
    fun addAccount(account:Account){
        accounts.add(account)
    }
    fun removeAccount(account:Account){
        accounts.remove(account)
    }
    fun addCategory(category:String){
        categories.add(category)
    }
    fun removeCategory(category:String){
        categories.remove(category)
    }
    fun changePassword(newPwd:String){
        pwd = newPwd
    }
    fun getUserAccounts():MutableList<Account>{
        return accounts
    }
    fun getUserCategories():MutableList<String>{
        return categories
    }
    fun getUserName():String{
        return name
    }
  
  
    fun categoriesPercentages_depense(account:Account):MutableMap<String,Double>{
        var percentages = mutableMapOf<String,Double>()
        var s=account.sum()
        if (s == 0.0) return percentages

    for (mouv in account.history) {
        if(mouv.get_sign()==-1){
        percentages[mouv.cat] = (percentages[mouv.cat] ?: 0.0) + mouv.montant}
    }

    for ((cat, montant) in percentages) {
        percentages[cat] = montant / s
    }
        return percentages
    }


    fun categoriesPercentages_revenue(account:Account):MutableMap<String,Double>{
        var percentages = mutableMapOf<String,Double>()
        var s=account.sum()
        if (s == 0.0) return percentages

    for (mouv in account.history) {
        if(mouv.get_sign()==1){
        percentages[mouv.cat] = (percentages[mouv.cat] ?: 0.0) + mouv.montant}
    }

    for ((cat, montant) in percentages) {
        percentages[cat] = montant / s
    }
        return percentages
    }
    


}