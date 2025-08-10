fun main() {
    print("Ingrese el primer número: ")
    val num1 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Ingrese el segundo número: ")
    val num2 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Ingrese el operador (+, -, *, /): ")
    val op = readLine() ?: ""

    try {
        val resultado = when (op) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> num1 / num2
            else -> throw IllegalArgumentException("Operador no válido")
        }
        println("Resultado: $resultado")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}
