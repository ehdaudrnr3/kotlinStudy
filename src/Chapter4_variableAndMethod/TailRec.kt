package Chapter4_variableAndMethod

/**
 * 재귀처리
 */

/**
 * 기존 재귀
 */
fun recPrint(no:Int = 1, count:Int=1) {
    println("recPrint");
    return if(no == count) return else recPrint(no-1, count);
}

/**
 * tailrec 사용
 * java코드로 보면 반복문으로 컴파일됨
 * 이는 StackOverFlowError의 부담감에서 벗어날 수 있음
 * 허나 재귀함수 호출구문은 반드시 마지막에 작성해야함
 */
tailrec fun tailRecPrint(no:Int = 1, count:Int=1) {
    println("recPrint");
    return if(no == count) return else recPrint(no-1, count);
}

/**
 * 마지막에 재귀함수를 호출하였지만 앞에 n + 하는 연산식이 붙어서
 * 컴파일시 반복문이 아닌 재귀함수로 호출되는 코드로 변환됨
 */
tailrec fun sum(n:Int): Int {
    if(n<= 0 ) return  n;
    else return n + sum(n-1);
}

/**
 * 마지막에 연산식이 없고 재귀함수를 호출하였으므로 
 * 반복문으로 컴파일되어 정상적인 코드로 변환됨
 */
tailrec fun sum2(n:Int, result:Int = 0): Int {
    if(n<= 0 ) return  n;
    else return sum2(n-1, n + result);
}
fun main(args: Array<String>) {
    recPrint(3);
    tailRecPrint(3)
}