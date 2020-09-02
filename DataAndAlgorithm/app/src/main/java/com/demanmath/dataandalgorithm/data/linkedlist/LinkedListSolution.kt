package com.demanmath.dataandalgorithm.data.linkedlist

import com.demanmath.dataandalgorithm.base.ISolutionInterface
import com.demanmath.dataandalgorithm.base.TraceLog
import java.util.*

/*
* @author   deman
* @date     2020/9/2
*/
class LinkedListSolution:ISolutionInterface {

    override fun run() {
        var linkedList = LinkedList<Int>()
        linkedList.initList()
        linkedList.addNode(1)
        linkedList.addNode(2)
        linkedList.addNode(3)
        linkedList.addNode(4)
        linkedList.addNode(5)
        reverseLinkedList(linkedList)
    }

     private fun <T> reverseLinkedList(list: LinkedList<T>):LinkedList<T>{
         TraceLog.i(list.dumpList())
         /*方法一，用stack的特性，存储链表的数据，然后反转*/
         var stack = Stack<T>()
         var temp:Node<T>? = list.header.next
         while(temp!=null){
             stack.push(temp.value)
             temp = temp.next
         }

         var resultNode = LinkedList<T>()
         resultNode.initList()
         while (!stack.isEmpty()){
             resultNode.addNode(stack.pop())
         }
         TraceLog.i(resultNode.dumpList())
         return resultNode
     }
}