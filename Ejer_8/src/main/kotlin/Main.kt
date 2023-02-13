fun main(args: Array<String>) {
    //cicloForContinue()
    //multiplos()
    //ciclosForConBreak()
    //cantidadCaracteres()
    anidadoForSalida()
}

/*
Continue: Es una expresión de salto de linea o sentencia, que solo se
permite de los cuerpos de los ciclos , su funcionalidad es saltar las sentencias de una
interación y pasar a la siguiente linea o sentencia,, en base a una condición
 */

fun cicloForContinue(){//Ciclo para imprimir números impares
    for( num in 1..10){
        if( num % 2 == 0 ){
            continue //Termina ese punto del ciclo y brinca a la siguiente posición
        }
        print( "$num" )
    }
}


/*
Implimenta un programa que permita imprimir los multiplos de un valor que te da el usuario
que te dan o xisten en un conjunto del 1 al 20
*/


fun pedir() : Int {

    print( "Dame un número: " )
    var leer = readln().toInt()
    return leer
}

fun multiplos(){
    var pedir = 0
    pedir = pedir()

    for (i in 1..20) {
        if (i % pedir != 0) {
            continue
        }
        println(i)
    }
}

/*
BREAK: Tambien es una expresionde salto de linea o sentencia , que
se permite solo al interior de los ciclos.Su objetivo es pasar el control
al siguiente punto del rograma luego del ciclo, es decir, finalizar el ciclo.
*/

fun ciclosForConBreak(){
    for( num in 1 .. 10 ){
        if ( num % 5 == 0 ){
            break
        }
        print( "$num" )
    }
}

fun anidadoForSalida(){
    for( num in 1..10 ){
        println( "Multiplos de $num: " )
        Cp@for( num2 in 1 .. 10 ){
            if( num2 % num == 0 ){
                if( num % 5 == 0 ){
                    println( "Ya me canse" )
                    break@Cp
                }
                println( "$num2" )
            }
        }
    }
}


/*
Imprimir la cantidad de caracteres de cada palabra que el usuario ingrese con el teclado
Terminar la aplicacion si se escribe salir
*/

fun cantidadCaracteres(){
    var pedirstring = ""


    do {
        pedirstring = pedirstring()
        if (pedirstring == "salir") {
            break
        }
        println("La palabra '$pedirstring' tiene ${pedirstring.length} caracteres.")

    }
    while (true)

}

fun pedirstring() : String {

    print( "Dame una palabra: " )
    var leer = readln().toString()
    return leer
}

