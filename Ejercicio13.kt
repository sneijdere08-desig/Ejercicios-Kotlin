open class Dispositivo(
    val marca: String,
    val modelo: String
) {
    fun mostrarInformacion() {
        println("Marca: $marca")
        println("Modelo: $modelo")
    }
}

class Smartphone(
    marca: String,
    modelo: String,
    val cantidadCamaras: Int
) : Dispositivo(marca, modelo) {
    fun mostrarCamaras() {
        println("Cantidad de camaras: $cantidadCamaras")
    }
}

class Tablet(
    marca: String,
    modelo: String,
    val tieneLapiz: Boolean
) : Dispositivo(marca, modelo) {
    fun mostrarLapiz() {
        println("Incluye lapiz: $tieneLapiz")
    }
}

fun main() {
    val telefono = Smartphone("Samsung", "Galaxy", 3)
    val tablet = Tablet("Lenovo", "Tab", true)

    println("SMARTPHONE")
    telefono.mostrarInformacion()
    telefono.mostrarCamaras()

    println("\nTABLET")
    tablet.mostrarInformacion()
    tablet.mostrarLapiz()
}