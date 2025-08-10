fun main() {
    print("Ingrese la contraseña: ")
    val contrasena = readLine() ?: ""

    val mensaje = when {
        contrasena.length < 6 -> "Muy débil"
        contrasena.length in 6..8 -> "Débil"
        else -> "Fuerte"
    }

    println("Fortaleza: $mensaje")
}
