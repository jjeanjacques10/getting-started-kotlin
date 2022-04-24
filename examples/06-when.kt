enum class Console(val year: Int) {
    GBA(2003),
    PLAYSTATION(2000),
    XBOX(2005),
    SWITCH(2017),
    PC(1946)
}

fun getPrice(console: Console): Int =
    when (console) {
        Console.GBA -> 1000
        Console.PLAYSTATION -> 5299
        Console.SWITCH -> 2500
        Console.XBOX -> 4200
        Console.PC -> 5000
    }

fun haveDiscount(console: Console): String {
    return when (console) {
        Console.GBA, Console.SWITCH, Console.PC -> "have discount"
        Console.PLAYSTATION, Console.XBOX -> "not have discount"
    }
}

fun main() {
    val price = getPrice(Console.PLAYSTATION)
    println("Console price is R$$price and this console ${haveDiscount(Console.PLAYSTATION)}")

    val pricePC = getPrice(Console.PC)
    println("Console price is R$$pricePC and this console ${haveDiscount(Console.PC)}")
}