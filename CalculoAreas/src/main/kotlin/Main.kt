fun main(args: Array<String>) {

    opciones()

}

fun opciones(){
    println("Calculo de areas")
    println( "1. Area de un cuadrado" )
    println( "2. Area de un  triangulo" )
    println( "3. Area de un circulo" )
    println( "4. Area de un rectangulo" )
    println( "5. Area de un  paralelogramo" )
    print( "Dame una opción: " )
    val op : Int = readln().toInt()

    when( op ){
        1 -> Cuadrado()
        2 -> Triangulo()
        3 -> Circulo()
        4 -> Rectangulo()
        5 -> Paralelogramo()
        else -> println( "Opción no encontrada" )
    }
}

fun Lado(): Double{
    print("Dame el valor del lado x: ")
    val lado : Double = readln().toDouble()
    return lado
}

fun Base(): Double{
    print("Dame la base: ")
    val base : Double = readln().toDouble()
    return base
}

fun Altura(): Double{
    print("Dame la altura: ")
    val altura : Double = readln().toDouble()
    return altura
}

fun Radio(): Double{
    print("Dame el valor del radio: ")
    val radio : Double = readln().toDouble()
    return radio
}

fun Cuadrado(){
    val lado: Double = Lado()
    val area : Double = lado * lado
    println("El area del cuadrado es: $area")
}

fun Triangulo(){
    val base: Double = Base()
    val altura: Double = Altura()
    val area : Double = ( base*altura ) / 2
    println("El area del triangulo es: $area")
}

fun Rectangulo(){
    val base: Double = Base()
    val altura: Double = Altura()
    val area : Double = base * altura
    println("El area del rectangulo es: $area")
}

fun Circulo() {
    val radio: Double = Radio()
    val area : Double = Math.PI * (radio * radio)
    println( "El area del circulo es: $area" )
}

fun Paralelogramo(){
    val base: Double = Base()
    val altura: Double = Altura()
    val area : Double =  base * altura
    println("El area del paralelogramo es: $area")
}