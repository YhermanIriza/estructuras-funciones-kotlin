fun main() {
    print("Ingrese un número: ")
    val texto = readLine() ?: ""

    try {
        val numero = try {
            texto.toInt()
        } catch (_: NumberFormatException) {
            println("Error: No es un número válido.")
            return
        }

        try {
            val resultado = 100 / numero
            println("Resultado de la división: $resultado")
        } catch (_: ArithmeticException) {
            println("Error: División por cero.")
        }

    } catch (e: Exception) {
        println("Error general: ${e.message}")
    }
}
