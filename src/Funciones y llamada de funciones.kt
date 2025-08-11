fun calcularPrecioTotal(
    precioBase: Double,
    impuesto: Double = 21.0,
    descuento: Double = 0.0
): Double {
    // 1. Aplicar descuento
    val precioConDescuento = precioBase - (precioBase * (descuento / 100))

    // 2. Aplicar impuesto
    val precioFinal = precioConDescuento + (precioConDescuento * (impuesto / 100))

    return precioFinal
}

fun main() {
    // 1. Solo precioBase
    val total1 = calcularPrecioTotal(100.0)
    println("Total 1 (solo precioBase): $total1")

    // 2. precioBase + descuento (argumento nombrado)
    val total2 = calcularPrecioTotal(100.0, descuento = 10.0)
    println("Total 2 (con descuento): $total2")

    // 3. precioBase + impuesto (argumento nombrado)
    val total3 = calcularPrecioTotal(100.0, impuesto = 15.0)
    println("Total 3 (con impuesto): $total3")

    // 4. Todos los parámetros cambiando el orden con argumentos nombrados
    val total4 = calcularPrecioTotal(impuesto = 18.0, precioBase = 200.0, descuento = 5.0)
    println("Total 4 (todos los parámetros): $total4")
}
