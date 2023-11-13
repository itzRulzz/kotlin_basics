/*
Создать приложение, с помощью которого пользователь, введя два числа и символ операции, узнает результат.
Символами операции могут быть: / — деление, * — умножение, + — сложение, - — вычитание. Числа могут быть вещественными.
Числа и знак операции разделяются между собой одним пробелом. Ввод производится в формате - ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ.
*/
// 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

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

fun string_splitting(equation: String) {
    val splitted_equation = equation.split(' ')

    var num1 = splitted_equation[0].toDouble()
    var num2 = splitted_equation[1].toDouble()
    var operation = splitted_equation[2]

    return num1, num2, operation
}

fun main(){
    println("Введите арифмитическое выражение из двух чисел вида «ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ» (пробелы обязательны): ")
    val equation = string_input().toString()

    println("Ответ: $equation = ${equation_calculation(equation)}")
}