fun main() {
    val pinCorrecto = "1234"
    var intentos = 0
    var pinIngresado: String

    do {
        print("Ingrese el PIN: ")
        pinIngresado = readLine() ?: ""
        intentos++

        if (pinIngresado == pinCorrecto) {
            println("PIN correcto. Acceso permitido.")
            break
        } else {
            println("PIN incorrecto.")
        }
    } while (intentos < 3)

    if (pinIngresado != pinCorrecto) {
        println("Acceso bloqueado por demasiados intentos.")
    }
}
