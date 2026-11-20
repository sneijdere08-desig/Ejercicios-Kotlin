fun main() {
    print("Nombre del producto: ")
    val producto = readln()

    print("Precio unitario: $")
    val precio = readln().toDouble()

    print("Cantidad que desea comprar: ")
    val cantidad = readln().toInt()

    if (precio < 0 || cantidad <= 0) {
        println("El precio no puede ser negativo y la cantidad debe ser mayor que cero.")
        return
    }

    val subtotal = precio * cantidad
    val iva = subtotal * 0.16
    val total = subtotal + iva

    println("\nDETALLE DE COMPRA")
    println("Producto: $producto")
    println("Precio unitario: $precio")
    println("Cantidad: $cantidad")
    println("Subtotal: $subtotal")
    println("IVA (16%): $iva")
    println("Total a pagar: $total")
}