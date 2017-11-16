package com.sked.collection.arraylist

import java.util.*

/**
 * Created by Android on 11/16/2017.
 */

fun main(args: Array<String>) {
    var arrayList = ArrayList<Employee>()
    arrayList.add(Employee("Manish", 25, 21000))
    arrayList.add(Employee("Ompal", 33, 20000))
    arrayList.add(Employee("hom", 28, 30000))
    arrayList.add(Employee("harsh", 35, 67000))
    arrayList.add(Employee("ashu", 28, 38000))
    arrayList.add(Employee("Bhavya", 25, 67000))
    arrayList.add(Employee("Ajju", 28, 40000))
    arrayList.add(Employee("Biswajeet", 25, 40000))

    println(arrayList)
    /**
     * print in csv format
     */
    println("\n Result in csv operation\n")
    println(listToCsv(arrayList))
    /**
     * Swap operaion on arraylist
     */
    Collections.swap(arrayList, 1, 0)
    println("\n Result after swap operation\n")
    for (item in arrayList) println(item)
    /**
     * Reverse operation on arraylist
     */
    Collections.reverse(arrayList)
    println("\n Result after reverse operation\n")
    for (item in arrayList) println(item)

    Collections.shuffle(arrayList)
    println("\n Result after shuffle operation\n")
    for (item in arrayList) println(item)
    /**
     * Sort operation on arrayList
     */
    Collections.sort(arrayList, MySalaryComparator())
    println("\nResult after sort operation\n")
    for (item in arrayList) println(item)
    /**
     * getting subRange from arraylist
     */
    var subList = arrayList.subList(1, 3)
    println("\nResult after sublist operation\n")
    for (item in subList) println(item)
}

fun listToCsv(arrayList: ArrayList<Employee>): String {
    var stringBuilder = StringBuilder()
    for (item in arrayList){
        if(stringBuilder.isNotEmpty()){
            stringBuilder.append(",")
        }
        stringBuilder.append(item)
    }
    return stringBuilder.toString()
}

class MySalaryComparator : Comparator<Employee> {
    override fun compare(emp1: Employee?, emp2: Employee?): Int {
        if ((emp1?.salary)!! > emp2?.salary!!) {
            return 1
        } else {
            return -1
        }
    }

}

data class Employee(var name: String, var age: Int, var salary: Int)