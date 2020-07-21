package Chapter4_variableAndMethod

/**
 * 중위표현식
 */
//중위 표현식(조건 : 클래스의 멤버 함수로 선언하거나 클래스의 확장함수 일때, 매개변수가 하나인 함수일 때)
//함수 확장
infix fun Int.myFun(x:Int) : Int {
    return x*x
}

class FunClass {
    infix fun infixFun(a:Int) {
        println("infixFun call...")
    }
}

fun main(args: Array<String>) {
    val obj = FunClass()
    obj.infixFun(10);

    //중위표현식
    obj infixFun 10
    println(10 myFun 10);

    println(10 myFun(10));
}