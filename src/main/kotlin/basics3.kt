/*
Создать приложение, которое преобразует введенное пользователем натуральное число
из 10-ичной системы в двоичную.
*/
package main.kotlin

fun number_input(num: Int): Int{
    var newnum = num

    try{
        newnum = readln().toInt()
    } catch(e: NumberFormatException) {
        println("Введите ЧИСЛО.")
        number_input(newnum)
    }

    return newnum
}

fun main(){
    var num: Int = 100

    println("Введите натуральное число для преобразования в двоичную систему: ")
    num = number_input(num)

    println(num)
}