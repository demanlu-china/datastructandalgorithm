package com.demanmath.dataandalgorithm.data.linkedlist

import com.demanmath.dataandalgorithm.ExampleUnitTest

import org.junit.After
import org.junit.Assert
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

/*
 * @author   deman
 * @date     2020/9/2
 */
class LinkedListTest : ExampleUnitTest() {

    private var linkedList = LinkedList<Int>()
    @Before
    fun setUp() {
        linkedList.initList()
    }

    @Test
    fun addNode(){
        linkedList.addNode(1)
        linkedList.addNode(2)
        linkedList.addNode(3)
        linkedList.addNode(4)
        linkedList.addNode(5)
        assertTrue(linkedList.size == 5)
    }

    @After
    fun tearDown() {
        linkedList.dumpList()
    }
}