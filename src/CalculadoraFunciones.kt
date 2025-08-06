// Funciones para operaciones
fun sumar(a: Double, b: Double): Double = a + b
fun restar(a: Double, b: Double): Double = a - b
fun multiplicar(a: Double, b: Double): Double = a * b
fun dividir(a: Double, b: Double): Double = if (b != 0.0) a / b else Double.NaN

fun main() {
    var continuar = true

    while (continuar) {
        println("\n--- Menú de Operaciones ---")
        println("1. Sumar")
        println("2. Restar")
        println("3. Multiplicar")
        println("4. Dividir")
        println("5. Salir")
        print("Seleccione una opción: ")

        val opcion = readLine()

        if (opcion == "5") {
            println("¡Hasta luego!")
            continuar = false
            continue
        }

        print("Ingrese el primer número: ")
        val num1 = readLine()?.toDoubleOrNull()
        print("Ingrese el segundo número: ")
        val num2 = readLine()?.toDoubleOrNull()

        if (num1 == null || num2 == null) {
            println("Entrada inválida. Intente de nuevo.")
            continue
        }

        val resultado = when (opcion) {
            "1" -> sumar(num1, num2)
            "2" -> restar(num1, num2)
            "3" -> multiplicar(num1, num2)
            "4" -> dividir(num1, num2)
            else -> {
                println("Opción no válida.")
                continue
            }
        }

        println("Resultado: $resultado")
    }
}
