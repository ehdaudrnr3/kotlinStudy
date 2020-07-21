package Chapter5_dataType

fun getLength(obj:Any): Int  {
    if(obj is String) {
        return obj.length;
    }
    return 0;
}

fun cases(obj:Any) : String {
    when(obj) {
        1->return "One"
        "Hello"->return "Greeting"
        is Long -> return "Long"
        !is String -> return "Not a string"
        else->return "unknown"
    }
}

fun paserInt(str:String): Int? {
    return str.toIntOrNull()
}

/**
 * Any? <- Any = O
 * Any <- Any = X
 */
fun anyNullToAny() {
    val myVal:Any = 10
    val myVal2:Any? = myVal

    val myVal3:Any? = 10
    //val myVal4:Any = myVal3  // -> 에러
    val myVal5:Any = myVal3 as Any      //명시적 타입으로 형변환
}

fun main(args: Array<String>) {
    println(getLength("Hello"));
    println(getLength(10));

    println(cases(1))
    println(cases(10))

    anyNullToAny()
}
