class Person(
    val name: String, // val represents immutability
    val age: Int
) {
    val isOlder
        get() = age > 18
}


fun main() {
    val person1: Person = Person("Jean", 22)
    val person2: Person = Person("Alice", 10)

    println("Person 1: $person1")
    println("Person 2: $person2")

    println("Person1 is older - ${person1.isOlder}")
}



