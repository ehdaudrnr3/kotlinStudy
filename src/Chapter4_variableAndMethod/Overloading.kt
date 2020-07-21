package Chapter4_variableAndMethod

/**
 * 오버로딩
 */
fun some(a:String) {
    println("some String call");
}

fun some(a:Int) {
    println("some int call");
}

fun some(a:Int, b:String) {
    println("some int and String call");
}

fun main(args: Array<String>) {
    some("Hello");
    some(10);
    some(10,"Hello");
}