
        fun main() {
            val array = intArrayOf(10, 2, 10, 3, 1, 2, 5, 2, -1, 3)
            val n = array.size
            var temp = 0
            for (i in 0 until n) {
                println("Deistvie" + (i + 1))
                for (j in 1 until n - 1) {
                    println("Sravnenie" + array[j - 1] + "i" + array[j])
                    if (array[j - 1] > array[j]) {

                        temp = array[j - 1]
                        array[j - 1] = array[j]
                        array[j] = temp
                        println(array[j].toString() + " bolshe chem" + array[j - 1])
                        println(array.contentToString())

                        println("for GIT")
                        println("for GIT commit")
                    }
                }
            }
        }
































































































































































































































































































