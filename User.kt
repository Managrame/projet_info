class User(val name:String, var pwd:String, var accounts:mutableListOf<Account>, var categories:mutableListOf<String>){
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
    fun getAccounts():mutableListOf<Account>{
        return accounts
    }
    fun getCategories():mutableListOf<String>{
        return categories
    }
    fun getName():String{
        return name
    }
    fun categoriesPercentages(account:Account):mutableMapOf<String,Double>{
        var percentages = mutableMapOf<String,Double>()
        for (mouv in hist){
            percentages[mouv.cat] = account.getCategoryPercentage(mouv.amount)
        }
        return percentages
    }

}