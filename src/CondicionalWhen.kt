fun main() {
    println("Ingrese un número del 1 al 7 para conocer el día de la semana:")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) {
        val dia = when (numero) {
            1 -> "Lunes"
            2 -> "Martes"
            3 -> "Miércoles"
            4 -> "Jueves"
            5 -> "Viernes"
            6 -> "Sábado"
            7 -> "Domingo"
            else -> "Número fuera de rango"
        }

        println("Día correspondiente: $dia")
    } else {
        println("Dato inválido. Ingrese un número válido.")
    }
}
