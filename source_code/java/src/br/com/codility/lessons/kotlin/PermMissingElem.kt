package br.com.codility.lessons.kotlin

class PermMissingElem {

    companion object {
        fun solution(A: IntArray): Int {

            var sum = 0

            A.forEach {
                println("SUM: $sum")
                sum +=it
            }

            return if (A.size % 2 == 0) {
                -sum + (A.size / 2 + 1) * (A.size + 1)
            } else {
                -sum + (A.size / 2 + 1) * (A.size + 2)
            }

        }
    }

}