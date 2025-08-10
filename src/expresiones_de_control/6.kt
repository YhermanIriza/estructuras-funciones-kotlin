fun hayAprobado(calificaciones: List<Int>): Boolean {
    for (nota in calificaciones) {
        if (nota > 60) return true
    }
    return false
}

fun main() {
    val notas = listOf(50, 40, 75, 30)
    println("¿Hay aprobado?: ${hayAprobado(notas)}")
}
