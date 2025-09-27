package jp.ac.jec.cm0199.hellokotlin

// メソッド作成のテスト
fun main() {
    var ret = sum(1, 2)
    println(ret)
    sum2(1, 2)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) {
    println(a + b)
}