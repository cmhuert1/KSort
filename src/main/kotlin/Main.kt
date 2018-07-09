import java.util.*
import kotlin.system.measureTimeMillis

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println("hi")
        val r = Random()
        val arr = arrayOfNulls<Int?>(1000)
        for (i in 0 until arr.size) {
            arr[i] = r.nextInt()%600
        }
        val quickSortTime = measureTimeMillis {
            Sort.quickSort(arr.requireNoNulls())
        }

        val bubbleSortTime = measureTimeMillis {
            Sort.buubleSort(arr.requireNoNulls())
        }

        val mergeSortTime = measureTimeMillis {
            Sort.mergeSort(arr.requireNoNulls())
        }

        println("Quick Sort Time: $quickSortTime\n" +
                "Bubble Sort Time: $bubbleSortTime\n" +
                "Merge Sort Time: $mergeSortTime")

    }
}