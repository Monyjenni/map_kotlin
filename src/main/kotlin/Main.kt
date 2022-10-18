fun main(args: Array<String>) {
    //Map
    // Example 1

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 4)

    // print out thr strings in map
    println("All keys : ${numbersMap.keys}")
    println("All values : ${numbersMap.values}")

    if("key2" in numbersMap) println("it has ${numbersMap}")
    if(1 in numbersMap.values) println("The value 1 is in the map")
    if(numbersMap.containsValue(1)) println("The value is in map")


    // Example 2
    val number2Map = mapOf("car1" to 1, "car2" to 2, "car3" to 3)
    println("All cars ${number2Map.keys}")
    println("All cars values ${number2Map.values}")

    if("car1" in number2Map.keys) println("car1 is in the map}")
    if(2 in number2Map.values) println("2 value is in ${number2Map["car2"]}")
    if(number2Map.containsValue(2)) println("alright, it's true")
    if(number2Map.containsKey("car3")) println("also has car 3  ")

    // Equal Maps

    // Example 3

    val numMap = mapOf("a" to 1, "b" to 2)
    val anotherMap = mapOf("a" to 1, "b" to 2)

    println(" These are equal : ${numMap == anotherMap}")

    // MutableMap
    // Example 4

    val num1Map = mutableMapOf("one" to 1, "two" to 2,"three" to 3)
    num1Map.put("four", 4)
    num1Map["one"] = 11

    println("The new version of the map ${num1Map}")



    // Example 5
    val num2Map = mutableMapOf("harry potter" to 1, "subtle of not giving a damn " to 2, "girls power" to 3)

    num2Map.put("software A to Z" , 4)
    num2Map["harry potter"] = 0

    println("The new map list ${num2Map}")













}