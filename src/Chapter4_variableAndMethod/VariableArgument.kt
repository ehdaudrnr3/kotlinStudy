package Chapter4_variableAndMethod

/**
 * 가변인수
 */
fun <T> varargsFun(a1: Int, vararg args: T) {
    for (arg in args) {
        println("arg = ${arg}")
    }
}

fun main(args: Array<String>) {
    varargsFun(10, "hello", "world");
    varargsFun(10,20, false);
}