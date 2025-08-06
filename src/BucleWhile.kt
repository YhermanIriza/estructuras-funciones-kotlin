fun main() {
    var contador = 0

    while (true) {
        print("Ingrese un número (negativo para salir): ")
        val numero = readLine()?.toIntOrNull()

        if (numero == null) {
            println("Por favor, ingrese un número válido.")
            continue
        }

        if (numero < 0) {
            break
        }

        contador++
    }

    println("Cantidad de números ingresados: $contador")
}
