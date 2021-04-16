class Item(var key: Int, val value: String)

class Repository(var data: MutableList<Item>) {


    fun delete(key: Int) :MutableList<Item> {
        val strg = mutableListOf<Item>()
        val newOne = key
        for (item in data) {
            if (newOne != item.key) {
                strg.add(item)
            }
        }
        return strg
    }

    fun put(key:Int, value:String)  {
        val i = Item(key, value)
        for (item in data){
            if (i.key == item.key) {
                data = delete(item.key)
                data.add(i)
            } else {
                   data.add(i)
            }

        }
    }

    fun get(key: Int) :String {

        for(item in data){

            if (key == item.key){
                return item.value
            }

        }

return ""
    }
}


fun main(args: Array<String>) {
    val items = mutableListOf<Item>()
    val repository = Repository(items)
    repository.put(122, "ivan")
    repository.put(12312, "kolya")
    val name = repository.get(12312)
    println(name)
}
