fun main(args: Array<String>) {
    println("Mi primera vez en kotlin")
    println("Program arguments: ${args.joinToString()}")

    /*mensajes()
    declaracion()
    SumOperacion()
    ResOperacion()
    DivOperacion()
    MulOperacion()*/

    SumaVal(3,4)

}


fun SumaVal(x: Int, y: Int) {
    val z : Int = x + y
    println("La suma de $x + $y es = $z")
}
fun mensajes(){
    println("Luis Antonio Arredondo Deanda")
    println("La mejor materia en la UTEQ")
    println("Programacion en moviles")

}

fun declaracion(){
    //val = se usa para constantes
    //var se usa para variables que cambian

    val a : Int = 10
    val b =  20
    var c = 30  //Variable que va a cambiar
    var d : Float = 50.0f
    val e = 3.14f
    val f : Double = 56.456 //Las variables de tipo double no necesita ningun caracter de referencia en su asignación
    var g = 56.78
    var h = 'x' //La asigancion es directa
    var i : Char = 'J'
    var j : Char = '9'
    var t : Boolean = true
    //var k : false

    println("CHAR : $i")//Aqui en el print para hacer la referencia a una variable se debe poner el signo de pesos $


}

fun SumOperacion(){
    val x = 10
    val y = 20
    val res = x + y
    println("La suma de $x + $y es = $res")
}

fun ResOperacion(){
    val x = 5
    val y = 2
    val res = x - y
    println("La resta de $x - $y es = $res")
}

fun DivOperacion(){
    val x = 20.0f  //Se puede usar esta estructura para variables de tipo float
    val y = 21.0f
    val s : Double = 10.0  //Se puiede usar esta estructura para variables de tipo Double
    var res = x / y
    println("La divición de $x / $y es = $res")
}

fun MulOperacion(){
    val x = 6
    val y = 4
    val res = x * y
    println("La multiplicación de $x x $y es = $res")
}



