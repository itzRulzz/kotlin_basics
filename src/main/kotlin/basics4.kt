/*
Создать приложение, с помощью которого пользователь, введя два числа и символ операции, узнает результат.
Символами операции могут быть: / — деление, * — умножение, + — сложение, - — вычитание. Числа могут быть вещественными.
Числа и знак операции разделяются между собой одним пробелом. Ввод производится в формате - ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ.
*/
// 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

/*
fun main() {
   while (true) {
       println("Enter your equation:")
       val equation = readLine()!!
       val (num1, num2, operation) = string_splitting(equation)

       when (operation) {
           "+" -> return num1 + num2
           "-" -> return num1 - num2
           "*" -> return num1 * num2
           "/" -> if (num1 / num2 == Double.POSITIVE_INFINITY) {
               println("На ноль делить нельзя!")
           } else {
               return num1 / num2
           }
           else -> {
               println("Вы ввели неверную операцию!")
           }
       }
   }
}
*/

package main.kotlin

fun string_input(): String {
    val equation = readln()

    if (equation == "") {
        println("Введите выражение.")
        return string_input()
    }
    if (equation.count { it == ' ' } != 2) {
        println("Введите выражение с пробелами между числами и операцией.")
        return string_input()
    }
    if (',' in equation){
        println("Вместо , в десятичной дробе должна быть .")
        return string_input()
    }

    return equation
}

fun equation_calculation(equation: String): Double{
    val (num1, num2, operation) = string_splitting(equation)

    when (operation) {
        "+" -> return num1 + num2
        "-" -> return num1 - num2
        "*" -> return num1 * num2
        "/" -> if (num1 / num2 == Double.POSITIVE_INFINITY)
            println("На ноль делить нельзя!")
        else
            return num1 / num2
        else -> {
            println("Вы ввели неверную операцию!")
        }
    }

    return 0.0
}

fun string_splitting(equation: String): Triple<Double, Double, String> {
    val splitted_equation = equation.split(' ')

    val num1 = splitted_equation[0].toDouble()
    val num2 = splitted_equation[1].toDouble()
    val operation = splitted_equation[2]

    return Triple(num1, num2, operation)
}

fun main(){
    println("Введите арифмитическое выражение из двух чисел вида «ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ» (пробелы обязательны): ")
    val equation = string_input()
    val (num1, num2, operation) = string_splitting(equation)

    println("Ответ: $num1 $operation $num2 = ${equation_calculation(equation)}")
}
