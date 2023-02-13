fun main(args: Array<String>) {
    //ArrayNuevo()
    //arrayFor()
    //arrayFora()
    arrayUno()
}

fun ArrayNuevo(){
    var datos: Int = canValores() //Esta función sera para determinar el tamaño deacuerdo con el usuario
    var A = arrayOf ( "Lu","Ma","Mi","Ju","Vi","Sa","Do" ) //Este sera definido

    println( A.get(0))
    println( A.get(1))
    println( A.get(2))
    println( A.get(3))

}
fun arrayFor(){
    var cant: Int = canValores()
    var A = arrayOf ( "Lu","Ma","Mi","Ju","Vi","Sa","Do" ) //Este sera definido
    var B = arrayOfNulls<Int>(cant)
    for( (posicion,valor) in A.withIndex()){
        println( "Posicion: $posicion  Valor: $valor" )
    }
    /*
    A[0] = 9
    A[1] = 5

    ...

    A[n] = x

    var x : Int = 0
    for(( i,x ) in A.withIndex()){
        var num: Int = pedir()

        A.set(i,x)
        println(A.get(i))
        println( "Posicion $i  : Valor  $x")

    }*/
    var dato = 0
    for (i in  0  until cant ){
        println( "Nuevo $i" )
        dato = readln().toInt()
        B.set( i, dato.toInt())
    }
    for ((posicion,valor) in B.withIndex())
        println( "Posicion: $posicion  Valor: $valor" )
}
fun canValores(): Int{
    print("Dame el número de espacios: ")
    var can : Int = readln().toInt()
    return can
}

//until = hasta donde

fun arrayFora(){//Ciclo for para pedir datos y guardarlos en un array
    var cant: Int = canValores() //Aqui se pide el valor o la dimesión

    var B = arrayOfNulls<Int>(cant) //Aqui se contruye y se declara  el array

    var dato = 0 //Aqui se declara la variable para guardar
    for (i in  0  until cant ){ //Este es el ciclo de llenadoo
        print( "Dame el valor [$i]: " )//Aqui se imprime la indicacion dependiendo la catidad que ingresemos en el for
        dato = readln().toInt() //Aqui se lee el valor indicado pr el usuario
        B.set( i, dato.toInt()) // Aqui se guarda en el arreglo el valor indicado
    }
    /*
    En este ciclo se imprime desde la 1er posicion hasta la ultima
    va de uno en uno,es una posicicón
     */
    println( "" )
    println( "Estos son los datos" )
    for ((posicion,valor) in B.withIndex())
        println( "Posicion: $posicion  Valor: $valor" )
}

fun arrayUno() {//Ciclo for para pedir datos y guardarlos en un array
    var cant: Int = canValores() //Aqui se pide el valor o la dimesión

    var X = arrayOfNulls<Int>(cant) //Aqui se contruye y se declara  el array
    var Y = arrayOfNulls<Int>(cant) //Aqui se contruye y se declara  el array
    var Z = arrayOfNulls<Int>(cant) //Aqui se contruye y se declara  el array

    var dato = 0 //Aqui se declara la variable para guardar
    var datob = 0

    for (i in 0 until cant) { //Este es el ciclo de llenadoo
        print("[Arreglo 1] Dame el valor [$i]: ")//Aqui se imprime la indicacion dependiendo la catidad que ingresemos en el for
        dato = readln().toInt() //Aqui se lee el valor indicado pr el usuario
        X.set(i, dato.toInt()) // Aqui se guarda en el arreglo el valor indicado
    }


    for (i in 0 until cant) { //Este es el ciclo de llenadoo
        print("[Arreglo 2] Dame el valor [$i]: ")//Aqui se imprime la indicacion dependiendo la catidad que ingresemos en el for
        datob = readln().toInt() //Aqui se lee el valor indicado pr el usuario
        Y.set(i, datob.toInt()) // Aqui se guarda en el arreglo el valor indicado
    }

    for( i in 0 until cant ){
        var sumar = X.get(i)?.plus(Y.get(i)!!)
        Z.set(i, sumar?.toInt() )
    }
    println("Valores de arreglo C")
    for( (posicion,valor) in Z.withIndex()){
        println( "Suma de la posición: $posicion = $valor" )
    }



}

