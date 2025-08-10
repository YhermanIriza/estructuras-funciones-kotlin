fun main() {
    print("Ingrese su rol (admin, moderador, usuario, invitado): ")
    val rol = readLine()?.lowercase() ?: ""

    val permisos = when (rol) {
        "admin" -> "Acceso total al sistema"
        "moderador" -> "Puede editar y eliminar contenido"
        "usuario" -> "Puede ver y comentar"
        "invitado" -> "Solo puede ver contenido"
        else -> "Rol no reconocido"
    }

    println("Permisos: $permisos")
}
