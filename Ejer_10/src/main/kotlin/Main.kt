fun main(args: Array<String>) {
    //matrixM()
    //matrixDimension()
    //matrixIntLambda()
    //matrixIntSoloDimension()
    ma()
}

fun matrixM(){

    var M = arrayOf (
        intArrayOf(1, 2 ,3),//Las matrices son de tamaño m a n y el tamaño no es necesario
                            // definirlo puede ser mas grande un arreglo que otro
        intArrayOf(4, 5 ,6),
        intArrayOf(7, 8 ,9)


    )
    for( i in M ){//Con un solo for puedes desplegar de manera optima todos los arreglos
        println( i.contentToString())
    }
}

fun matrixDimension(){
    val f = 3
    val c = 4

    //Sin inicializar la matrix
     val M = Array(f) { IntArray( c ) { 1 } }//Aqui se inicializa en "1" pero puede ser cualquier valor
    for( f in M ){
        println( f.contentToString() )

    }

}

fun matrixIntLambda(){
    val f = 3
    val c = 4

    val M = Array(f) { r -> IntArray( c ) { c -> r + c } }
    for( f in M ){
        println ( f.contentToString() )
    }
}

fun matrixIntSoloDimension() {
    val M  = arrayOfNulls<IntArray>( 3 )//Solo hace ejemplo: 5x5
                                            //Si no agregamos valores para el arreglo pone null

    M[ 0 ] = intArrayOf( 1, 2, 3)
    M[ 1 ] = intArrayOf( 4, 5, 6)
    M[ 2 ] = intArrayOf( 7, 8, 9)


    for( f in M ){
        println( f?.contentToString() ) //Al poner el signo imprime los valores dentro del arreglo
                                        //Si se quita hace la referencia del indice del arreglo o solo imprime los indices
    }
}



fun pedirF():Int{
    print( "Dime el número de filas: ")
    var x = readln().toInt()
    return  x
}
fun pedirC():Int{
    print( "Dime el número de columnas: ")
    var y = readln().toInt()
    return  y
}

fun pedirnumeracion():Int{
    print( "Dime con que número quieres llenar los arrays: ")
    var z = readln().toInt()
    return  z
}

fun ma(){
    var pedirf = 0
    var pedirc = 0
    pedirf  = pedirF()
    pedirc  = pedirC()



    //Sin inicializar la matrix
    val M = Array(pedirf) { r -> IntArray( pedirc ) { c -> r + c } }

    for( f in M ){
        println( f.contentToString() )

    }
}


