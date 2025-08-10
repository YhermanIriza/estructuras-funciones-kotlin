fun main() {
    val letras = listOf('A', 'B', 'C', 'D')

    for ((indice, letra) in letras.withIndex()) {
        println("Índice $indice: $letra")
    }
}
