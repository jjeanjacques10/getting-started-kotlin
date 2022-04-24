import java.util.*

fun main() {
    val binaryRepresentation = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryRepresentation[c] = binary
    }

    for ((letter, binary) in binaryRepresentation) {
        println("$letter - $binary")
    }
}