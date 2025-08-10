fun main() {
    print("Ingrese el primer número: ")
    val num1 = readLine()?.toIntOrNull() ?: 0
    print("Ingrese el segundo número: ")
    val num2 = readLine()?.toIntOrNull() ?: 0
    print("Ingrese el tercer número: ")
    val num3 = readLine()?.toIntOrNull() ?: 0

    val mayor = maxOf(num1, num2, num3)
    val menor = minOf(num1, num2, num3)

    println("El mayor es: $mayor")
    println("El menor es: $menor")

    if (num1 == num2 || num1 == num3 || num2 == num3) {
        println("Hay números repetidos")
    } else {
        println("No hay números repetidos")
    }
}
