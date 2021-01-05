package com.demanmath.dataandalgorithm.offer

import com.demanmath.dataandalgorithm.base.TraceLog

/*
* @author   demanmath
* @date     2021/1/5
*/
object Chap4:ISolution {

    override fun runAction() {
        var matrix = arrayOf(intArrayOf(-1,3))
        var b = findNumberIn2DArray(matrix,3)
        print(b)
    }

    fun findNumberIn2DArray(matrix: Array<IntArray>, target: Int): Boolean {
        if(matrix.isEmpty()|| matrix[0].isEmpty()){
            return false
        }
        var line = 0
        var col = matrix[0].size-1
        while((line<matrix.size) && (col>=0)){
            when {
                target == matrix[line][col] -> {
                    return true
                }
                matrix[line][col]>target -> {
                    /*move left*/
                    col--
                }
                matrix[line][col]<target -> {
                    /*move down*/
                    line++
                }
            }
        }
        return false
    }

    data class Positon(var i:Int,var j:Int)
}