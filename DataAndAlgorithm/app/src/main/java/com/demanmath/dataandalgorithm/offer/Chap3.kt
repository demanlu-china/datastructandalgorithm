package com.demanmath.dataandalgorithm.offer

import com.demanmath.dataandalgorithm.base.TraceLog

/*
* @author   demanmath
* @date     2021/1/3
*/
class Chap3:ISolution {

    override fun runAction() {
        val nums = arrayOf(2,2,1,3,4)
        val b = findRepeatNumber(nums.toIntArray())
        print(b)
    }

    /*index 0~n-1, i 0~n-1*/
    fun findRepeatNumber(nums: IntArray): Int {
        var m = 0;
        var temp = 0
        var index = 0;
        while (index<nums.size){
            if(nums[index] == index){
                index++
            }else{
                m = nums[index]
                if(nums[m] == m){
                    return m
                }else{
                    temp = nums[index]
                    nums[index] = nums[m]
                    nums[m] = temp
                }
            }
        }
        return -1

    }


}