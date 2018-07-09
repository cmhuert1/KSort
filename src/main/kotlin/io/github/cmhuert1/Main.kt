package io.github.cmhuert1
import io.github.cmhuert1.ksort.Sort
import java.util.*
import kotlin.system.measureTimeMillis

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
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

        println("Quick KSort.Sort Time: $quickSortTime\n" +
                "Bubble KSort.Sort Time: $bubbleSortTime\n" +
                "Merge KSort.Sort Time: $mergeSortTime")

    }
}