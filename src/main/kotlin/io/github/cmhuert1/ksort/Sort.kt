package io.github.cmhuert1.ksort

object Sort {
    fun quickSort(arr: Array<Int>) {
        quickSort(arr, 0, arr.size - 1)
    }

    private fun quickSort(arr: Array<Int>, low: Int, high: Int) {
        if (low < high) {
            val pi = partition(arr, low, high)
            quickSort(arr, low, pi - 1)
            quickSort(arr, pi + 1, high)
        }
    }

    private fun partition(arr: Array<Int>, low: Int, high: Int): Int {

        val pivot = arr[high]
        var i = low - 1
        for (j in low until high) {
            if (arr[j] <= pivot) {
                i++
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }

        }
        val temp = arr[i + 1]
        arr[i + 1] = arr[high]
        arr[high] = temp
        return i + 1
    }

    fun bubbleSort(arr: Array<Int>) {
        for (i in arr.indices) {
            for (j in 0 until arr.size - i - 1) {
                if (arr[j] > arr[j + 1]) {
                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                }
            }
        }
    }

    fun mergeSort(arr: Array<Int>) {
        mergeSort(arr, 0, arr.size - 1)
    }

    private fun mergeSort(arr: Array<Int>, l: Int, r: Int) {
        if (l < r) {
            // Find middle point
            val m = (l + r) / 2

            // KSort.Sort first and second halves
            mergeSort(arr, l, m)
            mergeSort(arr, m + 1, r)

            // Merge sorted arrays;
            merge(arr, l, m, r)
        }
    }

    private fun merge(arr: Array<Int>, l: Int, m: Int, r: Int) {
        val n1 = m - l + 1
        val n2 = r - m

        // Create temp arrays;
        val L = arrayOfNulls<Int>(n1)
        val R = arrayOfNulls<Int>(n2)

        for (i in L.indices) {
            L[i] = arr[l + i]
        }
        for (i in R.indices) {
            R[i] = arr[m + 1 + i]
        }

        // Merge temp arrays
        var i = 0
        var j = 0
        var k = l

        while (i < n1 && j < n2) {
            if (L[i]!! <= R[j]!!) {
                arr[k] = L[i]!!
                i++
            } else {
                arr[k] = R[j]!!
                j++
            }
            k++
        }

        while (i < n1) {
            arr[k] = L[i]!!
            i++
            k++
        }

        while (j < n2) {
            arr[k] = R[j]!!
            j++
            k++
        }
    }

    fun insertionSort(arr: Array<Int>) {

        for (i in 1 until arr.size) {
            val key = arr[i]
            var j = i - 1

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]
                j -= 1
            }

            arr[j + 1] = key
        }
    }
}