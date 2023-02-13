fun main(args: Array<String>) {

    println("Program arguments: ${args.joinToString()}")
}

fun areaCuadrado(lado: Double): Double {
    return lado * lado
}

fun areaTriangulo(base: Double, altura: Double): Double {
    return (base * altura) / 2
}

fun areaCirculo(radio: Double): Double {
    return Math.PI * Math.pow(radio, 2)
}

fun areaRectangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun areaParalelogramo(base: Double, altura: Double): Double {
    return base * altura
}
