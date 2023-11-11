/*
Создать приложение, с помощью которого пользователь, введя два числа и символ операции, узнает результат.
Символами операции могут быть: / — деление, * — умножение, + — сложение, - — вычитание. Числа могут быть вещественными.
Числа и знак операции разделяются между собой одним пробелом. Ввод производится в формате - ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ.
*/
package main.kotlin

fun string_input() {
    var equation = readln()
    if (equation == "") {
        println("Введите выражение.")
        string_input()
    }
    if (equation.count { it == ' ' } != 2) {
        println("Введите выражение с пробелами между числами и операцией.")
        string_input()
    }
}

fun equation_calculation(equation: String){
    string_splitting(equation)


}

fun string_splitting(equation: String){
    var num1: String = ""
    var num2: String = ""
    val c: Char

    // split; when
}

fun main(){
    println("Введите арифмитическое выражение из двух чисел вида «ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ» (пробелы обязательны): ")
    val equation = string_input()

    println("Ответ: $equation = ${equation_calculation(equation)}")
}