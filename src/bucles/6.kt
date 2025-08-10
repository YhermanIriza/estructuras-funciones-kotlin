fun main() {
    val lista = listOf(3, 5, 7, 9, 11)
    var i = 0

    while (i < lista.size) {
        if (lista[i] == 7) {
            println("Número 7 encontrado en la posición $i")
            break
        }
        i++
    }
}
