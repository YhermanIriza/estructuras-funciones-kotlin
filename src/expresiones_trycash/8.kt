fun convertirASeguroNumero(texto: String): Int {
    return try {
        texto.toInt()
    } catch (e: Exception) {
        0
    }
}

fun main() {
    print("Ingrese un número: ")
    val entrada = readLine() ?: ""
    val numero = convertirASeguroNumero(entrada)
    println("Número convertido: $numero")
}
