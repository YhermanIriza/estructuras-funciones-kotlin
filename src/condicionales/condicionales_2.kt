fun main() {
    print("Ingrese la nota: ")
    val nota = readLine()?.toIntOrNull() ?: 0

    val mensaje = when {
        nota >= 90 -> "Excelente"
        nota in 70..89 -> "Bueno"
        nota in 50..69 -> "Regular"
        else -> "Reprobado"
    }

    println("Clasificación: $mensaje")
}
