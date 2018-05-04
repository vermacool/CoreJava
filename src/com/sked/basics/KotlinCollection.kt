package com.sked.basics

/**
 * Created by Android on 12/19/2017.
 */
class KotlinCollection {

    fun filterContent(listInt: List<Int>): List<Int> {
        var evenNumList = listInt.filter { it % 2 == 1 }
        return evenNumList
    }
}

fun main(args: Array<String>) {

    val list = listOf(2, 4, 89, 25, 15, 89, 21, 3)
    var obj = KotlinCollection()
    println("list of numbers: " + obj.filterContent(list))
    println("grater than 25: " + list.firstOrNull { it > 4 })
    println("search 89: " + list.getOrElse(3) { 67 })
    println("drop after num>25: " + list.dropWhile { it < 25 })
}

public class singleton private constructor() {
    init {
        println("This ($this) is a singleton")
    }

    private object Holder {
        val INSTANCE = singleton()
    }

    companion object {
        val instance: singleton by lazy { Holder.INSTANCE }
    }

    var b: String? = null
}