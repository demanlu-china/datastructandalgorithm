package com.demanmath.dataandalgorithm.session

import com.demanmath.dataandalgorithm.base.ISolutionInterface
import com.demanmath.dataandalgorithm.data.linkedlist.ListNode
import java.lang.StringBuilder

/*
* @author   demanmath
* @date     2020/9/17
输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，
* 本题从1开始计数，即链表的尾节点是倒数第1个节点。
* 例如，一个链表有6个节点，
* 从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。


*/
class Session22:ISolutionInterface {

    override fun run() {
        var head = ListNode<Int>(1)
        head.next = null
        var temp = head
        for(i in 2..10){
            temp = temp.addEnd(i)
        }
        println(head?.dumpList())
        var result = getKthFromEnd2(head,3)
        println(result?.dumpList())
    }
    /**
     *
      */
    fun getKthFromEnd(head: ListNode<Int>?, k: Int): ListNode<Int>? {
        var slow = 0
        var fast = slow+k-1
        var i = 0

        var slowP = head
        var fastP = head
        if(head == null){
            return null
        }

        while (fastP?.next!=null){
            //find fast place
            if(i<fast){
                fastP = fastP.next
                i++
            }else if(i >= fast){
                fastP = fastP.next
                slowP = slowP?.next
                println(slowP?.`val`)
                i++
            }
        }

        if(i<fast){
            //not enough item
            return null
        }else{
            return slowP
        }

    }


    fun getKthFromEnd2(head: ListNode<Int>?, k: Int): ListNode<Int>?{
        var former = head
        var latter = head
        for(i in 0 until k){
            if(former == null){
                return null
            }
            former = former.next
        }
        while (former!=null){
            former = former.next
            latter = latter?.next
        }
        return latter
    }

}