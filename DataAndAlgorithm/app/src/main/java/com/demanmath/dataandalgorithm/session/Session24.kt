package com.demanmath.dataandalgorithm.session

import com.demanmath.dataandalgorithm.data.linkedlist.ListNode
import java.util.*

/*
* @author   demanmath
* @date     2020/9/22
* 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
*/
class Session24 {
    fun <T> reverseList(head: ListNode<T>?): ListNode<T>? {
        head?.let {p->
            p.next?.let {
                var stack = Stack<T>()
                var temp: ListNode<T>? = head
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

    fun <T> reverseList2(head: ListNode<T>?): ListNode<T>? {
        head?.let {p->
            var stack = Stack<ListNode<T>?>()
            var temp:ListNode<T>? = head
            while (temp!=null){
                stack.push(temp)
                temp = temp.next
            }
            var newHead = stack.pop()
            temp = newHead
            while (stack.isNotEmpty()){
                temp?.next = stack.pop()
                temp = temp?.next
            }
            temp?.next = null
            return newHead

        }?: kotlin.run {
            return null
        }
    }
}