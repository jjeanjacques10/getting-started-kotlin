<center>
    <h2 align="center">Getting started Kotlin</h2>
    <img src="https://kotlinlang.org/docs/images/kotlin-logo.png" width="300px"/>
</center>

I'm learning Kotlin, so I have been updating it with examples and explanations about the language that I'm using at
work.

## Projects

Examples of projects using Kotlin:

- [Spring Boot](./projects/spring-boot)

## File types

- ``.kts`` Kotlin script
- ``.kt`` Kotlin class

## Variables

There are two ways to declare variables using Kotlin: ```val``` and ``var``.

- ``val`` is a constant
- ``var`` for a variable whose value can change

Example: [01-variable.kts](./examples/01-variables.kts)

It's possible use conditional statements to assign a value to variable:

``` kotlin
val answerString: String = if (count == 42) {
    "I have the answer."
} else if (count > 35) {
    "The answer is close."
} else {
    "The answer eludes me."
}
```

## Functions

We must pass params with types and every function needs return type too.

``` kotlin
fun sum(a: Int, b: Int): Int {
    return a + b
}

// or

fun sum(a: Int, b: Int) = a + b
```

Example: [02-functions.kts](./examples/02-functions.kts)

## Concat String and Variables

There are some ways to concatenate variables in a String

``` kotlin
fun bestAnime(): String {
    return "Naruto"
}

print("Best Animes:" + bestAnime())
print("Best Animes: ${bestAnime()}")
```

## Exception Handler

Example of Try-catch block for exception handling

``` kotlin
try {
    val message = "Hello World! I love Digimon!"
    message.toInt()
} catch (exception: NumberFormatException) {
    // ...
}
```

## Properties

Instead to use getters and setters we can use properties

- Getter

``` kotlin
class Pokemon(val name: String, val type: String) {
    val description: String
        get() = "Pokemon ${name} is ${type} type"
}
```

- Setter

``` kotlin
var power = 0.0
    set(value) {
        if (value > 0) {
            field = value
        }
    }
```

Example: [03-properties.kts](./examples/03-properties.kts)

## Enum

``` kotlin
enum class Console {
    GBA,
    PLAYSTATION,
    XBOX,
    SWITCH,
    PC
}
```

Example: [04-enums.kts](./examples/04-enums.kts)

## Class

Creating a class using Enum

``` kotlin
class Game(val name: String,
           val console: Console) {
    fun play(): String {
        return "You're playing $name on $console"
    }
}
```

Example: [05-classes.kt](./examples/05-classes.kt)

## Lists

There is some ways to create lists in Kotlin

````kotlin
var digimons = mutableListOf("Agumon", "Tailmon", "Angemon")
var digimons = listOf("Agumon", "Tailmon", "Angemon")
val digimonPower: MutableMap<Int, Int> = mutableMapOf(0 to 50, 1 to 50, 2 to 100)
````

## When

When is similar Java Switch

``` kotlin
fun getPrice(console: Console): Int =
    when (console) {
        Console.GBA -> 1000
        Console.PLAYSTATION -> 5299
        Console.SWITCH -> 2500
        Console.XBOX -> 4200
        Console.PC -> 5000
    }
```

Example: [06-when.k](./examples/06-when.kt)

## References

- [Learn the Kotlin programming language](https://developer.android.com/kotlin/learn?gclsrc=aw.ds&gclid=CjwKCAjw9e6SBhB2EiwA5myr9tk-mZhoAytl5-3nJeQ0lgYnyIGcs5GFh9-aN1tDvkwvcrFEAJZdLhoC0lAQAvD_BwE)
- [Get started with Kotlin - KotlinLang.org](https://kotlinlang.org/docs/getting-started.html)

---
developed by [Jean Jacques Barros](https://github.com/jjeanjacques10)
