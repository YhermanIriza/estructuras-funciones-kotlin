fun main() {
    print("Ingrese la temperatura: ")
    val temperatura = readLine()?.toIntOrNull() ?: 0

    val estado = when {
        temperatura < 0 -> "Bajo cero"
        temperatura in 0..14 -> "Fría"
        temperatura in 15..25 -> "Agradable"
        else -> "Calurosa"
    }

    println("La temperatura está: $estado")
}
