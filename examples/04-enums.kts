enum class Console {
    GBA,
    PLAYSTATION,
    XBOX,
    SWITCH,
    PC
}

class Game(val name: String,
           val console: Console) {
    fun play(): String {
        return "You're playing $name on $console"
    }
}

var game1 = Game("Fire Red", Console.GBA)
var game2 = Game("The Witcher", Console.PC)

println(game1.play())
println(game2.play())
