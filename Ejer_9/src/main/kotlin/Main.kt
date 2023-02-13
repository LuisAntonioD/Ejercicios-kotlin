import kotlin.math.roundToInt
fun main(args: Array<String>) {


    menuOperaciones()
}

fun pedir():Int{
    var x = readln().toInt()
    return  x
}

fun menuOperaciones() {

    var opc = 0

    do {
        println("OPERACIONES")
        println("[1] Suma")
        println("[2] Resta")
        println("[3] Multiplicación")
        println("[4] División")
        println("[5] Salir")
        print("Dame una opción: ")
        opc = pedir()
        if (opc != 5) {



        print("Dime el tamaño de los dos arreglos: ")
        var tam = pedir()


        println("Valores del arreglo 1")

        var A = arrayOfNulls<Int>(tam)
        var dato = 0
        for (i in 0 until tam) {
            print("Valor $i: ")
            dato = readln().toInt()
            A.set(i, dato.toInt())
        }

        println("Valores del arreglo 2")

        var B = arrayOfNulls<Int>(tam)
        for (i in 0 until tam) {
            print("Valor $i: ")
            dato = readln().toInt()
            B.set(i, dato.toInt())
        }

        var C = arrayOfNulls<Double>(tam)

        when (opc) {
            1 -> for (i in 0 until tam) {
                C.set(i, sumaValores(A.get(i)!!, B.get(i)!!).toDouble())
            }

            2 -> for (i in 0 until tam) {
                C.set(i, restaValores(A.get(i)!!, B.get(i)!!).toDouble())
            }

            3 -> for (i in 0 until tam) {
                C.set(i, multiplicaValores(A.get(i)!!, B.get(i)!!).toDouble())
            }

            4 -> for (i in 0 until tam) {
                C.set(i, divideValores(A.get(i)!!, B.get(i)!!))
            }


            else -> println("Opcion no valida")
        }

        println("Operaciones guardadas en el arreglo C")
        for ((posicion, valor) in C.withIndex()) {
            println("Posicion: $posicion Valor: $valor")
        }
    }
}
        while (opc != 5)



}


fun sumaValores( A: Int, B: Int) : Double{
    var suma: Double = A.toDouble() + B.toDouble()
    return  suma
}

fun restaValores( A: Int, B: Int) : Double{
    var resta: Double = A.toDouble() - B.toDouble()
    return  resta
}

fun multiplicaValores( A: Int, B: Int) : Double{
    var mul: Double = A.toDouble() * B.toDouble()
    return  mul
}

fun divideValores( A: Int, B: Int) : Double{
    var div: Double = A.toDouble() / B.toDouble()
    var divv = (div * 100.0).roundToInt() / 100.0
    return  divv
}