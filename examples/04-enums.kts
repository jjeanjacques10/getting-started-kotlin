enum class Console(val year: Int) {
    GBA(2003),
    PLAYSTATION(2000),
    XBOX(2005),
    SWITCH(2017),
    PC(1946)
}

class Game(
    val name: String,
    val console: Console
) {
    fun play(): String {
        return "You're playing $name on $console (realeased at ${console.year})"
    }
}

var game1 = Game("Fire Red", Console.GBA)
var game2 = Game("The Witcher", Console.PC)

println(game1.play())
println(game2.play())
