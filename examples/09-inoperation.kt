fun main() {
    println(isLetter('J')) // true
    println(isNotDigit('x')) // true
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'