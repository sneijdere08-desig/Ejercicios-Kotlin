class Usuario {
    var nombre: String = ""
    var correo: String = ""
    var edad: Int = 0
    var cuentaActiva: Boolean = true

    fun mostrarInformacion() {
        println("Nombre: $nombre")
        println("Correo: $correo")
        println("Edad: $edad")
        println("Cuenta activa: $cuentaActiva")
    }
}

fun main() {
    val usuario1 = Usuario()
    usuario1.nombre = "Andrea"
    usuario1.correo = "andrea@email.com"
    usuario1.edad = 21
    usuario1.cuentaActiva = true

    val usuario2 = Usuario()
    usuario2.nombre = "Luis"
    usuario2.correo = "luis@email.com"
    usuario2.edad = 24
    usuario2.cuentaActiva = false

    println("PRIMER USUARIO")
    usuario1.mostrarInformacion()

    println("\nSEGUNDO USUARIO")
    usuario2.mostrarInformacion()
}