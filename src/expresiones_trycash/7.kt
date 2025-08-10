fun main() {
    print("Ingrese su edad: ")
    val edad = readLine()?.toIntOrNull() ?: 0

    if (edad < 0) {
        throw IllegalArgumentException("La edad no puede ser negativa.")
    }

    println("Edad registrada: $edad")
}
