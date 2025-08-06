fun main() {
    println("Ingrese su edad:")
    val edad = readLine()?.toIntOrNull()

    if (edad != null) {
        if (edad >= 18) {
            println("Eres mayor de edad.")
        } else {
            println("Eres menor de edad.")
        }
    } else {
        println("Dato inválido. Por favor, ingrese un número.")
    }
}
