fun main() {
    print("Capacidad total del dispositivo en GB: ")
    val capacidad = readln().toDouble()

    print("Espacio ocupado por aplicaciones en GB: ")
    val aplicaciones = readln().toDouble()

    print("Espacio ocupado por fotografias en GB: ")
    val fotografias = readln().toDouble()

    print("Espacio ocupado por videos en GB: ")
    val videos = readln().toDouble()

    if (capacidad <= 0) {
        println("La capacidad debe ser mayor que cero.")
        return
    }

    if (aplicaciones < 0 || fotografias < 0 || videos < 0) {
        println("Los espacios ocupados no pueden ser negativos.")
        return
    }

    val espacioUtilizado = aplicaciones + fotografias + videos

    if (espacioUtilizado > capacidad) {
        println("El espacio ocupado supera la capacidad del dispositivo.")
        return
    }

    val espacioDisponible = capacidad - espacioUtilizado
    val porcentaje = (espacioUtilizado / capacidad) * 100

    println("\nRESUMEN DE ALMACENAMIENTO")
    println("Espacio utilizado: $espacioUtilizado GB")
    println("Espacio disponible: $espacioDisponible GB")
    println("Porcentaje ocupado: $porcentaje%")
}