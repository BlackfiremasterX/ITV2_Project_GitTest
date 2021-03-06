import java.util.*
import kotlin.math.sqrt

fun main() {

    Info()
    var user_answer = ""
    var run = true

    loop@ while (true) {
        print(
            "\n\nВыберите задачу из списка!\n" +
                    "Вводите Ваш запрос:"
        )
        user_answer = readLine().toString().toLowerCase()
        when (user_answer) {
            "b1" -> Begin1()
            "b4" -> Begin4()
            "b7" -> Begin7()
            "b9" -> Begin9()
            "if5" -> if5()
            "if6" -> if6()
            "if7" -> if7()
            "if8" -> if8()
            else -> print("Такой задачи в списке нет!")
        }
        run = true
        while (run) {
            print("\n\nПродолжить?[y/n]")
            user_answer = readLine().toString().toLowerCase()
            when (user_answer) {
                "y" -> {
                    print("Продолжаем")
                    for (i in 0..2) {
                        Thread.sleep(333)
                        print(".")
                    }
                    run = false
                    continue@loop
                }
                "n" -> {
                    print("До свидания")
                    for (i in 0..2) {
                        Thread.sleep(333)
                        print("!")
                    }
                    run = false
                    break@loop
                }
                else -> print("Тут всего 2 варианта ответа[y/n]")
            }
        }
    }
}


fun Info() {

    var timing = 200
    print("Бобро пожаловать в консольную версию задачника с примерами!\n")
    Thread.sleep(timing.toLong())
    print("y - кнопка отвечающая за ответ \"да\"\n")
    Thread.sleep(timing.toLong())
    print("n - кнопка отвечающая за ответ \"нет\"\n")
    Thread.sleep(timing.toLong())
    print("Код задачи определяется ее первой буквой в названии\n")
    Thread.sleep(timing.toLong())
    print("+ порядковый номер в списке.\n")
    Thread.sleep(timing.toLong())
    print("Например, Begin1 - b1.\n")
    Thread.sleep(timing.toLong())
    print("После ввода ответа нужно нажать клавишу Enter!")
    Thread.sleep(timing.toLong())
}

fun Begin1() {

    println("\n\nBegin1. Дана сторона квадрата a. Найти его периметр P = 4*a")
    print("Введите сторону квадрата a: ")
    var a = readLine()!!.toDouble()
    var P = 4 * a
    print("Периметр квадрата со стороной а = $a: $P")

}


fun Begin4() {

    println(
        "\n\nBegin4. Дан диаметр окружности d. Найти ее длину L = π·d. В качестве\n" +
                "значения π использовать 3.14."
    )
    print("Введите диамерт окружности d: ")
    var d = readLine()!!.toDouble()
    var L = 3.14 * d
    print("диаметр окружности d с длинной L = $d: $L")


}


fun Begin7() {
    println(
        "Найти длину окружности L и площадь круга S заданного радиуса R:\n" +
                "L = 2·π·R, S = π·R^2"
    )
    print("Введите радиус R:")


    val r: Double = Scanner(System.`in`).nextDouble()
    val l = 2 * 3.14 * r
    val s = 3.14 * r * r
    println("L = $l")
    println("S = $s")

}

fun Begin9() {

    println(
        "\n\nBegin9.  Даны два неотрицательных числа a и b. Найти их среднее геометрическое, то есть квадратный корень из их произведения: √\n" +
                "a·b."
    )
    print("Введите a: ")
    print("Введите b: ")
    var a = 3
    var b = 9.0
    var SQRT = sqrt(b)
    println("Корень квадратный из $b = $SQRT")

}


fun if5() {
    print(
        "If5. Даны три целых числа. Найти количество положительных и количество\n" +
                "отрицательных чисел в исходном наборе.\n"
    )
    print("Введите первое число: ")
    var a = readLine()!!.toInt()
    print("Введите второе число: ")
    var b = readLine()!!.toInt()
    print("Введите третье число: ")
    var c = readLine()!!.toInt()
    var count_positive = 0
    var count_negative = 0
    var count_null = 0
    if (a == 0)
        count_null++
    else
        if (a < 0)
            count_negative++
        else
            count_positive++
    if (b == 0)
        count_null++
    else
        if (b < 0)
            count_negative++
        else
            count_positive++
    if (c == 0)
        count_null++
    else
        if (c < 0)
            count_negative++
        else
            count_positive++
    print(
        "Кол-во положительных чисел - $count_positive \n" +
                "Кол-во отрицательных - $count_negative\n" +
                " Кол-во нулей - $count_null"
    )


}

fun if6() {
    print("If6. Даны два числа. Вывести большее из них.\n")
    print("Введите первое число - ")
    var a = readLine()!!.toInt()
    print("Введите второе число - ")
    var b = readLine()!!.toInt()
    if (a == b)
        print("Числа равны")
    else
        if (a > b)
            print("Большее число - а, оно равно $a")
        else
            print("Большее число - b, оно равно $b")


}

fun if7() {
    print("If7. Даны два числа. Вывести порядковый номер меньшего из них.\n")
    print("Введите первое число - ")
    var a = readLine()!!.toInt()
    print("Введите второе число - ")
    var b = readLine()!!.toInt()
    if (a == b)
        print("Числа равны")
    else
        if (a > b)
            print("Второе число меньше.")
        else
            print("Первое число меньше.")
}

fun if8() {
    print("If8. Даны два числа. Вывести вначале большее, а затем меньшее из них.\n")
    print("Введите первое число - ")
    var a = readLine()!!.toInt()
    print("Введите второе число - ")
    var b = readLine()!!.toInt()
    if (a == b)
        print("Числа равны")
    else
        if (a > b)
            print("Первое число а, которое равно $a больше второго числа, которое равно $b")
        else
            print("Второе число b, которое равно $b, больше первого числа, которое равно $a")


}