fun main() {
    print("Ingrese un carácter: ")
    val caracter = readLine()?.firstOrNull() ?: ' '

    val tipo = when {
        caracter.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u') -> "Vocal"
        caracter.isLetter() -> "Consonante"
        caracter.isDigit() -> "Número"
        else -> "Símbolo especial"
    }

    println("El carácter es: $tipo")
}
