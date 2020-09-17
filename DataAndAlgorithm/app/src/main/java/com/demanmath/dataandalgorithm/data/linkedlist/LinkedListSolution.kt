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
//        val linkedList = LinkedList<Int>()
//        linkedList.initList()
//        linkedList.addNode(1)
//        linkedList.addNode(2)
//        linkedList.addNode(3)
//        linkedList.addNode(4)
//        linkedList.addNode(5)
//        reverseLinkedList(linkedList)

        val nodeHead = ListNode(1)
        var i = 2
        var temp = nodeHead
        while(i<6){
            var e = ListNode(i)
            temp.next = e
            e.next = null
            temp = e
            i++
        }
        TraceLog.i(nodeHead?.dumpList()?:"")
        var res = reverseNode(nodeHead)
        TraceLog.i(res?.dumpList()?:"")

    }

     private fun <T> reverseLinkedList(list: LinkedList<T>):LinkedList<T>{
         TraceLog.i(list.dumpList())
         /*方法一，用stack的特性，存储链表的数据，然后反转*/
         var stack = Stack<T>()
         var temp:ListNode<T>? = list.header.next
         while(temp!=null){
             stack.push(temp.`val`)
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

    private fun <T> reverseNode(head: ListNode<T>?):ListNode<T>?{
        /*方法一，用stack的特性，存储链表的数据，然后反转*/
        /**
         * 如果链表为空时，代码是否能正常工作？
         * 如果链表只包含一个结点时，代码是否能正常工作？
         * 如果链表只包含两个结点时，代码是否能正常工作？
         * 代码逻辑在处理头结点和尾结点的时候，是否能正常工作？
         */
        head?.let {p->
            p.next?.let {
                var stack = Stack<T>()
                var temp:ListNode<T>? = head
                while (temp!=null){
                    stack.push(temp!!.`val`)
                    temp = temp!!.next
                }

                var newHead = ListNode<T>(stack.pop())
                var temp2 = newHead
                while (!stack.isEmpty()){
                    var e = ListNode(stack.pop())
                    temp2.next = e
                    e.next = null
                    temp2 = e
                }
                return newHead

            }?: kotlin.run {
                return head
            }
        }?: kotlin.run {
            return null
        }
    }

    /**
     * 快慢指针法，1个慢指针，一个快指针，如果在移动过程中2者想叫，则存在环。
     */
    private  fun <T> checkCycle(header:ListNode<T>?){

    }
}