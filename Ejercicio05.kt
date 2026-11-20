fun main() {
    var notificacionesActivas = true
    var modoOscuro = false

    println("CONFIGURACION DE LA APLICACION")
    println("1. Activar notificaciones")
    println("2. Desactivar notificaciones")
    println("3. Activar modo oscuro")
    println("4. Consultar informacion")
    println("5. Salir")

    print("Selecciona una opcion: ")
    val opcion = readln().toInt()

    when (opcion) {
        1 -> {
            notificacionesActivas = true
            println("Notificaciones activadas.")
        }
        2 -> {
            notificacionesActivas = false
            println("Notificaciones desactivadas.")
        }
        3 -> {
            modoOscuro = true
            println("Modo oscuro activado.")
        }
        4 -> {
            println("Aplicacion: Configuracion movil")
            println("Version: 1.0")
        }
        5 -> println("Has seleccionado salir.")
        else -> println("Opcion no valida.")
    }

    println("Notificaciones activas: $notificacionesActivas")
    println("Modo oscuro: $modoOscuro")
}