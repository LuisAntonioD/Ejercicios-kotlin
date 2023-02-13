fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")

    suma()
    suma_parametros(25,10 )
    println( "Resultado : " + suma_parametros_Dev( 40 , 10))

    //Ejercicios
    resta_parametros(10,5 )
    println( "La resta es igual a : " + resta_parametros_Dev( 20 , 10))

    Divicion_parametros(3.0f,5.0f )
    println( "La división es igual a : " + Divicion_parametros_Dev( 5.0f , 10.0f))

    Mul_parametros(10,10 )
    println( "La multiplicación es igual a : " + Mul_parametros_Dev( 5, 5))

    Modulo_parametros(101,10 )
    println( "El modulo es  : " + Modulo_parametros_Dev( 51, 5))
}

fun suma(){
    val x  = 10
    val y : Int  = 5
    var r = x + y
    println("La suma es igual a $r")
}

fun suma_parametros( x : Int, y : Int){
    var r = x + y
    println("La suma es igual a $r")

}

fun suma_parametros_Dev ( x : Int, y : Int) : Int {
    var r = x + y
    return r

}

//Polimorfismo resepcion de valores


//Operaciones  de resta con polimosrfismo
fun resta_parametros( x : Int, y : Int){
    var r = x - y
    println("La resta de $x - $y es igual a $r")

}

fun resta_parametros_Dev ( x : Int, y : Int) : Int {
    var r = x - y
    return r

}


//Operaciones  de divición con polimosrfismo
fun Divicion_parametros( x : Float, y : Float){
    var r = x / y
    println("La división de $x / $y es igual a $r")

}

fun Divicion_parametros_Dev ( x : Float, y : Float) : Float {
    var r = x / y
    return r

}


//Operaciones  de divición con polimosrfismo
fun Mul_parametros( x : Int, y : Int){
    var r = x * y
    println("La multiplicación de $x * $y es igual a $r")

}

fun Mul_parametros_Dev ( x : Int, y : Int) : Int {
    var r = x * y
    return r

}


//Operaciones  de divición con polimosrfismo
fun Modulo_parametros( x : Int, y : Int){
    var r = x % y
    println("El modulo de $x % $y es igual a $r")

}

fun Modulo_parametros_Dev ( x : Int, y : Int) : Int {
    var r = x % y
    return r

}