fun main() {
    var consumoTotal = 0.0
    val bateriaInicial = 100.0

    for (periodo in 1..5) {
        print("Porcentaje consumido en el periodo $periodo: ")
        val consumo = readln().toDouble()

        if (consumo < 0) {
            println("El consumo no puede ser negativo.")
            return
        }

        if (consumoTotal + consumo > bateriaInicial) {
            println("El consumo acumulado no puede superar el 100%.")
            return
        }

        consumoTotal += consumo
    }

    val bateriaRestante = bateriaInicial - consumoTotal

    println("\nRESUMEN DE BATERIA")
    println("Consumo total: $consumoTotal%")
    println("Bateria restante: $bateriaRestante%")
}