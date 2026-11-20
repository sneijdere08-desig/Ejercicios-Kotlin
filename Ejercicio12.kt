class Bateria {
    private var porcentaje: Int = 100

    fun consultarPorcentaje() {
        println("Bateria actual: $porcentaje%")
    }

    fun consumir(cantidad: Int) {
        if (cantidad <= 0) {
            println("La cantidad a consumir debe ser mayor que cero.")
        } else if (cantidad > porcentaje) {
            println("No hay suficiente bateria.")
        } else {
            porcentaje -= cantidad
            println("Consumo realizado.")
        }
    }

    fun cargar(cantidad: Int) {
        if (cantidad <= 0) {
            println("La cantidad de carga debe ser mayor que cero.")
        } else if (porcentaje + cantidad > 100) {
            println("La carga no puede superar el 100%.")
        } else {
            porcentaje += cantidad
            println("Carga realizada.")
        }
    }
}

fun main() {
    val bateria = Bateria()
    bateria.consultarPorcentaje()
    bateria.consumir(30)
    bateria.consultarPorcentaje()
    bateria.cargar(20)
    bateria.consultarPorcentaje()

    // No se permite acceder directamente:
    // bateria.porcentaje = 50
}