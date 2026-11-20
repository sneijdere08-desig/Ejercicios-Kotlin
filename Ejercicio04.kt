fun main() {
    print("Ingresa tu edad: ")
    val edad = readln().toInt()

    if (edad < 0) {
        println("La edad no puede ser negativa.")
    } else if (edad >= 18) {
        println("Registro permitido. Puedes continuar.")
    } else {
        println("Registro no permitido: necesitas tener 18 años.")
    }
}