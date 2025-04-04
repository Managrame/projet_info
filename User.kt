
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
    fun getAccounts():MutableList<Account>{
        return accounts
    }
    fun getCategories():MutableList<String>{
        return categories
    }
    fun getName():String{
        return name
    }
  
  
    fun categoriesPercentages(account:Account):MutableMap<String,Double>{
        var percentages = mutableMapOf<String,Double>()
        var s=account.sum()
        for (mouv in account.history){
            percentages[mouv.cat] = mouv.montant/s
        }
        return percentages
    }

}