fun main(args: Array<String>) {

    //cicloFor()
    //cicloWhile()
    menu()
}

fun inicio() : Int {
    print( "Inicio de ciclo de:" )
    var ini = readln().toInt()
    return ini
}

fun Fin() : Int {
    print( "Da el numero para finalizar el ciclo: " )
    var fin = readln().toInt()
    return fin
}

fun tabla() : Int {
    print( "Tabla que desea realizar: " )
    var tb = readln().toInt()
    return  tb
}

fun cicloFor() {
    var n = inicio()
    var m = Fin()
    var tb = tabla()
    for( num in n .. m ) {
        var r = tb * num
        println( "$tb x $num = $r" )
    }
}

fun cicloWhile() {
    var dia = 1
    println( "Empieza la semana" )
    while ( dia < 6 ) {
        if( dia == 1 ) {
            println( "$dia dia trabajado" )
        } else {
            println( "$dia dias trabajando" )
        }
        dia++
    }
    println( "A descansar" )
}

fun pedir() : Int {
    println( "Escoge un equipo de futbol" )
    println( "[1] Real Madrid FC" )
    println( "[2] Barcelona FC" )
    println( "[3] Brujas FC" )
    println( "[4] Salir " )
    print( "Eliga una opción: " )
    var leer = readln().toInt()
    return leer
}

fun menu() {
    var pedir = 0
    
    do {
        pedir = pedir()
        when ( pedir ) {
            1 -> println( "Escogiste al mejor equipo de futbol" )
            2 -> println( "Escogiste al Barca" )
            3-> println( "Este equipo existe?" )
            4-> println( "bye" )
            else-> println( "Opción no encontrada" )
        }
    }
    while ( pedir != 4 )
}