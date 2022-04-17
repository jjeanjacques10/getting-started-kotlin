fun sum(a: Int, b: Int): Int {
    return a + b
}

println("Result: " + sum(1, 2))

// or

fun sumSameLine(a: Int, b: Int) = a + b

println("Result: ${sumSameLine(1, 2)}")

// Concatenate Examples

fun bestAnime(): String {
    return "Naruto"
}

println("Best Animes: " + bestAnime())
println("Best Animes: ${bestAnime()}")