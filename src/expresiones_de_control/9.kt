fun indicePrimeraVocal(texto: String): Int {
    val vocales = listOf('a', 'e', 'i', 'o', 'u')
    for ((indice, caracter) in texto.lowercase().withIndex()) {
        if (caracter in vocales) return indice
    }
    return -1
}

fun main() {
    val palabra = "programa"
    val indice = indicePrimeraVocal(palabra)
    println("Índice de la primera vocal: $indice")
}
