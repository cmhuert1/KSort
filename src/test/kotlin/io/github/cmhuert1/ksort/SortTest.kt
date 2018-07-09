package io.github.cmhuert1.ksort

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import kotlin.test.assertFalse

class SortTest {

    @Before
    fun setUp() {

    }

    @Test
    fun unsortedArraysDoNotEqual() {
        val arr = arrayOf(3, 4, 1, 5, 10, 6, 7, 8, 2, 9)
        val arr2 = arrayOf(3, 4, 1, 5, 10, 6, 7, 8, 2, 9)
        Sort.bubbleSort(arr)
        assertFalse(arr.contentDeepEquals(arr2))
    }

    @Test
    fun quickSort() {
        val arr = arrayOf(3, 4, 1, 5, 10, 6, 7, 8, 2, 9)
        val arr2 = arrayOf(3, 4, 1, 5, 10, 6, 7, 8, 2, 9)
        Sort.quickSort(arr)
        arr2.sort()
        assert(arr.contentDeepEquals(arr2))
    }

    @Test
    fun bubbleSort() {
        val arr = arrayOf(3, 4, 1, 5, 10, 6, 7, 8, 2, 9)
        val arr2 = arrayOf(3, 4, 1, 5, 10, 6, 7, 8, 2, 9)
        Sort.bubbleSort(arr)
        arr2.sort()
        assert(arr.contentDeepEquals(arr2))
    }

    @Test
    fun mergeSort() {
        val arr = arrayOf(3, 4, 1, 5, 10, 6, 7, 8, 2, 9)
        val arr2 = arrayOf(3, 4, 1, 5, 10, 6, 7, 8, 2, 9)
        Sort.mergeSort(arr)
        arr2.sort()
        assert(arr.contentDeepEquals(arr2))
    }

    @Test
    fun insertionSort() {
        val arr = arrayOf(3, 4, 1, 5, 10, 6, 7, 8, 2, 9)
        val arr2 = arrayOf(3, 4, 1, 5, 10, 6, 7, 8, 2, 9)
        Sort.insertionSort(arr)
        arr2.sort()
        assert(arr.contentDeepEquals(arr2))
    }
}