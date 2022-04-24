interface Expression
class Number(val value: Int) : Expression
class Sum(val left: Expression, val right: Expression) : Expression

/*
fun exam(expression: Expression): Int {
    if (expression is Number) {
        // There is a smart cast here
        return expression.value
    }

    if (expression is Sum) {
        // There is a smart cast here
        return exam(expression.left) + exam(expression.right)
    }

    throw IllegalArgumentException("Expression is invalid")
}*/

fun exam(expression: Expression): Int =
    when (expression) {
        is Number -> {
            print("Expression with number: ${expression.value}")
            expression.value // Last expression in block will be returned as a result
        }
        is Sum -> exam(expression.left) + exam(expression.right)
        else -> throw IllegalArgumentException("Expression is invalid")
    }

fun main() {
    // ((1+2) + 4)
    val result = exam(Sum(Sum(Number(1), Number(2)), Number(4)))
    println("Result: $result")
}