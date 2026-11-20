fun main() {
    val contrasenaCorrecta = "Kotlin123"
    var intentos = 0
    val maximoIntentos = 3
    var accesoPermitido = false

    while (intentos < maximoIntentos && !accesoPermitido) {
        print("Ingresa tu contrasena: ")
        val contrasenaIngresada = readln()
        intentos++

        if (contrasenaIngresada == contrasenaCorrecta) {
            accesoPermitido = true
            println("Acceso permitido.")
        } else {
            println("Contrasena incorrecta.")
            println("Intentos utilizados: $intentos")
        }
    }

    if (!accesoPermitido) {
        println("Acceso bloqueado. Agotaste los intentos.")
    }
}