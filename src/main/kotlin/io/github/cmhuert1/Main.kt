package io.github.cmhuert1
import io.github.cmhuert1.ksort.Sort
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.runBlocking
import java.util.*
import kotlin.system.measureTimeMillis

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val r = Random()
        val arrBubbleSort = arrayOfNulls<Int?>(10)
        for (i in arrBubbleSort.indices) {
            arrBubbleSort[i] = r.nextInt() % 600
        }
        val arrQuickSort = arrBubbleSort.copyOf()
        val bubblesort = async { Sort.bubbleSort(arrBubbleSort.requireNoNulls()) }
        val quicksort = async { Sort.quickSort(arrQuickSort.requireNoNulls()) }

        runBlocking {
            bubblesort.await()
            quicksort.await()
            arrQuickSort.forEach { print("$it ") }
            println()
            arrBubbleSort.forEach { print("$it ") }
        }
    }
}
