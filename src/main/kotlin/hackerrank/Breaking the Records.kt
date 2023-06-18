package hackerrank

// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

fun breakingRecords(scores: Array<Int>): Array<Int> {
    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE
    var countMin = -1
    var countMax = -1
    scores.forEach {
        val tmpMax = max
        max = max.coerceAtLeast(it)
        if (tmpMax != max) countMax += 1

        val tmpMin = min
        min = min.coerceAtMost(it)
        if (tmpMin != min) countMin += 1
    }

    return arrayOf(countMax, countMin)
}

fun main() {
    println(breakingRecords("10 5 20 20 4 5 2 25 1".split(" ").map { it.toInt() }.toTypedArray()).contentToString())
}