fun main() {
    print("Ingrese su edad: ")
    val edad = readLine()?.toIntOrNull() ?: 0

    val tarifa = when {
        edad < 12 -> "Tarifa infantil"
        edad in 12..64 -> "Tarifa general"
        else -> "Tarifa de adulto mayor"
    }

    println(tarifa)
}
