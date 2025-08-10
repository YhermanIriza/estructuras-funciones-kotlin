fun main() {
    try {
        print("Ingrese el dividendo: ")
        val a = readLine()?.toDoubleOrNull() ?: 0.0
        print("Ingrese el divisor: ")
        val b = readLine()?.toDoubleOrNull() ?: 0.0
        println("Resultado: ${a / b}")
    } catch (_: ArithmeticException) {
        println("Error: No se puede dividir por cero.")
    } finally {
        println("Operación finalizada")
    }
}
