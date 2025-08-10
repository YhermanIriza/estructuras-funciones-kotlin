import java.io.File
import java.io.FileNotFoundException

fun main() {
    try {
        val archivo = File("archivo.txt")
        val contenido = archivo.readText()
        println(contenido)
    } catch (e: FileNotFoundException) {
        println("Error: El archivo no existe.")
    }
}
