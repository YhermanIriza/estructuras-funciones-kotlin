fun main() {
    print("Ingrese un número: ")
    val texto = readLine() ?: ""
    print("Ingrese el divisor: ")
    val divisorTexto = readLine() ?: ""

    try {
        val numero = texto.toInt()
        val divisor = divisorTexto.toInt()
        println("Resultado: ${numero / divisor}")
    } catch (e: Exception) {
        when (e) {
            is NumberFormatException -> println("Error: Valor no es un número.")
            is ArithmeticException -> println("Error: División por cero.")
            else -> println("Error desconocido: ${e.message}")
        }
    }
}
