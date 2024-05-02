// Coordenada inicial
var coordenada = Pair(0, 0)

// Programa principal
fun moureDreta(coordenada: Pair<Int, Int>): Pair<Int, Int> {
    val (x, y) = coordenada
    val novaCoordenada = Pair(x + 1, y)
    return novaCoordenada
}

fun moureEsquerra(coordenada: Pair<Int, Int>): Pair<Int, Int> {
    val (x, y) = coordenada
    val novaCoordenada = Pair(x - 1, y)
    return novaCoordenada
}

fun moureAmunt(coordenada: Pair<Int, Int>): Pair<Int, Int> {
    val (x, y) = coordenada
    val novaCoordenada = Pair(x, y + 1)
    return novaCoordenada
}

fun moureAvall(coordenada: Pair<Int, Int>): Pair<Int, Int> {
    val (x, y) = coordenada
    val novaCoordenada = Pair(x, y - 1)
    return novaCoordenada
}

// Executar moviments
coordenada = moureDreta(coordenada)
println("Nova coordenada després de moure a la dreta: $coordenada")

coordenada = moureAmunt(coordenada)
println("Nova coordenada després de moure amunt: $coordenada")
