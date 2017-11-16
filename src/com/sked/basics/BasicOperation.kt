package com.sked.basics

import java.sql.DriverManager.println


/**
 * Created by Android on 11/15/2017.
 */
fun main(array: Array<String>) {
    val user = User(name = "John Doe",age =  24)
    printUser(user);
}

fun printUser(user: User) {
    println(user)
}

data class User(var name: String, var age: Long)