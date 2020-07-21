package Chapter4_variableAndMethod

/**
 * 기본 매개변수 사용법
 */
fun sayHello(name: String = "kkang") {
    println("Hello "+name);
}

fun sayHelloInt(name: String = "kkang", no :Int) {
    println("Hello "+name +" "+no);
}
fun main(args: Array<String>) {
    sayHello();
    sayHello("KIM")

    //sayHelloInt(10) => error
    sayHelloInt(no = 10);
    sayHelloInt("lee", 10);
    sayHelloInt(name="kim", no = 20);
}