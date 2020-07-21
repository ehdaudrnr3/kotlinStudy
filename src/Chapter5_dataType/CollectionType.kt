package Chapter5_dataType

fun array(): Unit {
    var array = arrayOf(1, "kkang", true)
    array[0] = 10
    array[2] = "world"

    println("${array[0]} .. ${array[1]} .. ${array[2]}")
    println("size : ${array.size} .. ${array.get(0)} ... ${array.get(1)} .. ${array.get(2)}")

    //제너릭
    var arrayInt = arrayOf<Int>(10, 20, 30)
    println("arrayInt : ${arrayInt.get(0)} .. ${arrayInt.get(1)} .. ${arrayInt.get(2)}")

    //xxxArrayOf 사용
    var intArray = intArrayOf(10, 20, 30);
    println("intArray: ${intArray.get(0)} .. ${intArray.get(1)} .. ${intArray.get(2)}")

    //Array 클래스를 이용한 배열
    var arrayClass = Array(3, { t -> t*10});
    println("arrayClass: ${arrayClass.get(0)} .. ${arrayClass.get(1)} .. ${arrayClass.get(2)}")

    //빈 배열 만들기
    var emptyArray1 = arrayOfNulls<Any>(3)
    emptyArray1[0] = 10
    emptyArray1[1] = "hello"
    emptyArray1[2] = true

    println("emptyArray1: ${emptyArray1.get(0)} .. ${emptyArray1.get(1)} .. ${emptyArray1.get(2)}")

    var emptyArray2 = Array<String>(3, {""})
    emptyArray2[0] = "hello"
    emptyArray2[1] = "world"
    emptyArray2[2] = "kkang"
    println("emptyArray2: ${emptyArray2.get(0)} .. ${emptyArray2.get(1)} .. ${emptyArray2.get(2)}")
}

fun list(): Unit {
    val immutableList:List<String> = listOf("hello", "world");
    println("immutableList : ${immutableList.get(0)} .. ${immutableList.get(1)}");

    val mutableList:MutableList<String> = mutableListOf("hello", "world")
    mutableList.add("kkang");
    mutableList.set(1, "korea")
    println("mutableList : ${mutableList.get(0)} .. ${mutableList.get(1)} .. ${mutableList.get(2)}");

    val arrayList :ArrayList<String> = ArrayList()
    arrayList.add("hello")
    arrayList.add("kkang")
    arrayList.set(1, "world")
    println("arrayList : ${arrayList.get(0)} .. ${arrayList.get(1)}");
}

fun map():Unit {
    val immutableMap1 = mapOf<String, String>(Pair("one", "hello"), Pair("two", "world"))
    println("immutableMap1 : ${immutableMap1.get("one")} .. ${immutableMap1.get("two")}");

    val immutableMap2 = mapOf<String, String>("one" to "hello", "two" to "world")
    println("immutableMap2 : ${immutableMap2.get("one")} .. ${immutableMap2.get("two")}");

    val mutableMap = mutableMapOf<String, String>()
    mutableMap.put("one", "hello")
    mutableMap.put("two", "world")
    println("mutableMap : ${mutableMap.get("one")} .. ${mutableMap.get("two")}");
}

/**
 * 기존 자바 유틸클래스의 List, Map, Set을 사용할 수 있음
 */
fun set():Unit {
    val immutableSet = setOf<String>("hello", "hello", "world")
    println("immutableSet : ${immutableSet.elementAt(0)} .. ${immutableSet.elementAt(1)}");

    val mutableSet = mutableSetOf<String>()
    mutableSet.add("hello")
    mutableSet.add("world")
    println("mutableSet : ${mutableSet.elementAt(0)} .. ${mutableSet.elementAt(1)}");
}

fun javaUtil():Unit {
    val arrayList:ArrayList<String> = ArrayList();
    arrayList.add("hello")
    arrayList.add("world")

    val map:HashMap<String, String> = HashMap()
    map.put("one", "hello")
    map.put("two", "world")

    val set:HashSet<String> = HashSet()
    set.add("hello")
    set.add("hello")
    set.add("world")
}

fun main(args: Array<String>) {
    array();
    list()
    map()
    set()
    javaUtil()
}