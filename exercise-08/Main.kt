
fun greetUser(username: String?): String {
    return if (!username.isNullOrEmpty()) {
        "¡Hola, $username!"
    } else {
        "¡Hola! Bienvenido/a."
    }
}

fun main() {
    val username1: String? = "Juan"
    val username2: String? = null
    val username3: String? = ""

    println(greetUser(username1))
    println(greetUser(username2))
    println(greetUser(username3))
}
