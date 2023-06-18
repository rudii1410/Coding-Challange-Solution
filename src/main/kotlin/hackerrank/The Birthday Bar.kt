package hackerrank// https://www.hackerrank.com/challenges/the-birthday-bar/problem

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    return s.toList().windowed(m, 1).mapNotNull { l ->
        l.takeIf { it.sum() == d }
    }.size
}

fun main() {
    println(birthday("1 2 1 3 2".split(" ").map { it.toInt() }.toTypedArray(), 3, 2))
}