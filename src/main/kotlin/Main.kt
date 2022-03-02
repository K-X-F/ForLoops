fun main(args: Array<String>) {
    var things = mutableListOf<String>("perro", "gato")

    for (each_thing in things) {
        println(each_thing)
    }
    things.forEach {
        println(it)
    }
    var dict = mutableMapOf<String,Float>("god of war" to 39.99f,"minecla" to 59.99f)
    println(dict["god of war"])

    dict["bob"] = 0.0f
    println("the map is $dict")

    dict.remove("god of war")
    println("now it is $dict")

    for ((key, value) in dict) {
        println("$key-> $value")
    }
    dict.forEach {
    println("${it.key} -> ${it.value}")
    }
}