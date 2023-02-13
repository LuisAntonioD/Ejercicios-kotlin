fun main(args: Array<String>) {
    println("Hoy en jueves")
    //validaCondicionesWhen()
    //validaCondicionesWhenRango()
    //validasemestre()
    //println("Program arguments: ${args.joinToString()}")
}

fun pideOpcion() : Int {
    println( "1.- Pizza: ")
    println( "2.- Mc Nuggets: ")
    println( "3.- Alitas: ")
    println( "4.- Costilla BBQ: ")
    println( "Opción: ")
    var op : Int = readln().toInt()
    return op
}
fun validaCondicionesWhen(){
    var op = pideOpcion()
    when( op ) {
        1 -> println( "Pizza de peperoni - Mexicana" )
        2 -> println( "Nuggets con Nopales" )
        3 -> println( "Alitas con chile habanero" )
        4 -> println( "Costillas con una bien fria" )
        else -> println( "Mejor vete a tu casa a comer" )

    }
}

fun validaCondicionesWhenRango(){
    var opc = validaCuatrimestre()
    when( opc ) {
        in 1..4 -> println( "Estas en el 1er. cuatrimestre" )
           in 5..9 -> println( "Estas en el 3er. cuatrimestre" )
        in 9..11 -> println( "Estas en el 3er. cuatrimestre" )
        else -> println( "Mes incorrecto" )

    }
}


fun validaCuatrimestre(): Int{
    print( "Dame un mes: ")
    var opc  : Int = readln().toInt()
    return opc

    }


//Desarrollla e implementa un programa que usando when me permita identificar el
// semestre a partir de el mes que da el usuario

fun validasemestre(){
    var opc = validanum()
    when( opc ) {
        in 1..6 -> println( "Estas en el 1er. semestre" )
        in 7..12 -> println( "Estas en el 2do. semestre" )
        else -> println( "Mes incorrecto" )

    }
    validanumero(opc)
}

fun validasem(): Int{
    print( "Dame un mes: ")
    var op  : Int = readln().toInt()
    return op

}

//2,4,6,8,10, si el usuario captura cualquiera de esos valores luego entonces dara u
// na respuesta que le valor es par y si el usuario da un valor como 1,3,5,7,9,11 luego
// entonces dira que es immpar el mes indicado

fun validanumero(opc : Int){
    when( opc ) {
        1,3,5,7,11 -> println( "Este número es impar" )
        2,4,6,8,10 -> println( "Este número es par" )

        else -> println( "Número fuera de rango" )

    }
}

fun validanum(): Int{
    print( "Dame un valor: ")
    var opc  : Int = readln().toInt()
    return opc

}

fun ranCadWhen(){
    val opc = 10
    when( opc ){
        Char.MAX_VALUE.toInt() -> println( "Estan en el 1er. RANGO" )
        Char.MAX_VALUE.toInt() -> println( "Estan en el 2do. RANGO" )
    }
}

fun conWhenGuarda(){
    var opc = pideValor()
    val responder : String = when ( opc ){
        in 1..6 -> "1er. Semestre"
        in 7..12 -> "7do. Semestre"
        !in 1..12 -> "No existes, te dierón de baja"
        else -> "Entrada invalida"
    }
    println( "Respuesta : $responder" )
}

fun pideValor(): Int{
    print( "Dame un valor: ")
    var opc  : Int = readln().toInt()
    return opc

}

