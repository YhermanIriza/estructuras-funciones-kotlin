fun main() {
    print("Ingrese la extensión del archivo: ")
    val extension = readLine()?.lowercase() ?: ""

    val tipo = when (extension) {
        "jpg", "png" -> "Imagen"
        "pdf" -> "Documento"
        "txt" -> "Texto plano"
        "mp3" -> "Audio"
        "mp4" -> "Video"
        else -> "Tipo desconocido"
    }

    println("Tipo de archivo: $tipo")
}
