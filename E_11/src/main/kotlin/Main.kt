fun main(args: Array<String>) {

    Matrix()
}
fun Matrix() {
    val filas = pedirF()
    val columnas = pedirC()
    val ma = Array(filas) { IntArray( columnas ) }
    llenado(ma)
    mostrarMatriz(ma)
    sumaF( ma )
    sumaC( ma )
    multiM( ma )
}

fun pedir():Int{
    print("Dame un valor: ")
    val x: Int = readln().toInt()
    return x
}

fun pedirF(): Int{
    print( "Dame el numero de filas: " )
    val filas : Int = readln().toInt()
    return  filas
}

fun pedirC(): Int{
    print( "Dame el numero de columnas: " )
    val columnas : Int = readln().toInt()
    return  columnas
}

fun llenado(ma: Array<IntArray>) {

    for (i in 0 until ma.size) {
        for (j in 0 until ma[0].size) {
            ma[i][j] = (0..9).random()
        }
    }
}

fun mostrarMatriz(ma: Array<IntArray>){
    for (f in ma) {
        for (valor in f) {
            print("$valor ")
        }
        println()
    }
}

fun sumaF(ma: Array<IntArray>){
    var suma =0
    println("Suma filas")
    for (i in 0 until ma.size) {
        for (j in 0 until ma[0].size) {
            suma = suma + ma[i][j]
        }

        println("${i+1}: $suma")
        suma=0
    }
}

fun sumaC(ma: Array<IntArray>){
    var suma =0
    println("Suma columnas")
    for (i in 0 until ma[0].size) {
        for (j in 0 until ma.size) {
            suma = suma + ma[j][i]
        }

        println("${i+1}: $suma")
        suma=0
    }
}

fun multiM(ma: Array<IntArray>) {

    val valX = pedir()

    for (i in 0 until ma.size) {
        for (j in 0 until ma[0].size) {
            ma[i][j] *= valX
        }
    }
    println( "Esta es la multiplicación de la matriz por el numero $valX")
    mostrarMatriz( ma )
}

