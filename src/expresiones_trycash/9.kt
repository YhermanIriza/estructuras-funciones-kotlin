fun main() {
    print("Ingrese un número: ")
    val entrada = readLine() ?: ""

    val resultado = runCatching {
        entrada.toInt()
    }

    resultado.onSuccess {
        println("Número convertido: $it")
    }.onFailure {
        println("Error: ${it.message}")
    }
}
