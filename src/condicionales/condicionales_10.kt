fun main() {
    print("Ingrese su edad: ")
    val edad = readLine()?.toIntOrNull() ?: 0

    print("¿Tiene invitación especial? (si/no): ")
    val invitacion = readLine()?.lowercase() == "si"

    if (edad >= 18 || invitacion) {
        println("Acceso permitido")
    } else {
        println("Acceso denegado")
    }
}
