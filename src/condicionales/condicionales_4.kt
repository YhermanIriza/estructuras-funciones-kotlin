fun main() {
    print("Ingrese un número (1-7): ")
    val numero = readLine()?.toIntOrNull() ?: 0

    val dia = when (numero) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miércoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> "Número inválido"
    }

    println(dia)
}
