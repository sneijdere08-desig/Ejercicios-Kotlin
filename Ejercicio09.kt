fun validarNombre(nombre: String): Boolean {
    return nombre.isNotBlank()
}

fun validarCorreo(correo: String): Boolean {
    return correo.contains("@")
}

fun validarEdad(edad: Int): Boolean {
    return edad >= 18
}

fun validarContrasena(contrasena: String): Boolean {
    return contrasena.length >= 8
}

fun main() {
    print("Nombre: ")
    val nombre = readln()

    print("Correo: ")
    val correo = readln()

    print("Edad: ")
    val edad = readln().toInt()

    print("Contrasena: ")
    val contrasena = readln()

    val nombreValido = validarNombre(nombre)
    val correoValido = validarCorreo(correo)
    val edadValida = validarEdad(edad)
    val contrasenaValida = validarContrasena(contrasena)

    println("\nRESULTADO DE VALIDACIONES")
    println("Nombre valido: $nombreValido")
    println("Correo valido: $correoValido")
    println("Edad valida: $edadValida")
    println("Contrasena valida: $contrasenaValida")

    if (nombreValido && correoValido && edadValida && contrasenaValida) {
        println("Informacion correcta. Registro permitido.")
    } else {
        println("Hay datos que necesitan corregirse.")
    }
}