package hackerrank// https://www.hackerrank.com/challenges/repeated-string/problem

fun repeatedString(s: String, n: Long): Long {
    val len = s.length
    val sumA = MutableList(len) { 0 }
    var totalA = 0
    for (i in 0 until len) {
        if (s[i] == 'a') {
            totalA += 1
        }
        sumA[i] = totalA
    }

    val left = (n % len).toInt().takeIf {it > 0}?.let { sumA[it - 1] } ?: 0
    return ((n / len) * totalA) + left
}

fun main(args: Array<String>) {
    println(repeatedString("abba", 8))
}