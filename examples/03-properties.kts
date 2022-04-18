class Pokemon(val name: String, val type: String) {
    val description: String
        get() = "Pokemon ${name} is ${type} type"

    var power = 0.0
        set(value) {
            if (value > 0) {
                field = value
            }
        }
}

val pokemon = Pokemon("Pikachu", "eletric") // there's no 'new' keyword in Kotlin

println(pokemon.description)

try {
    pokemon.power = -200.0 // - Throw error
} catch (exception: java.lang.Exception) {
    println(exception)
}

pokemon.power = 100.0
println(pokemon.power)

