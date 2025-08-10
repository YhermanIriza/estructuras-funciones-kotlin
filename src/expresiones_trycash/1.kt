fun main() {
    try {
        print("Ingrese el dividendo: ")
        val a = readLine()?.toDoubleOrNull() ?: 0.0
        print("Ingrese el divisor: ")
        val b = readLine()?.toDoubleOrNull() ?: 0.0

        val resultado = a / b
        println("Resultado: $resultado")
    } catch (e: ArithmeticException) {
        println("Error: No se puede dividir por cero.")
    }
}
