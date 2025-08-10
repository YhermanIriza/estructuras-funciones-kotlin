fun main() {
    val estudiantes = mapOf("Ana" to 85, "Luis" to 45, "Marta" to 70)

    for ((nombre, nota) in estudiantes) {
        val estado = if (nota >= 50) "Aprobado" else "Reprobado"
        println("$nombre: $estado")
    }
}
