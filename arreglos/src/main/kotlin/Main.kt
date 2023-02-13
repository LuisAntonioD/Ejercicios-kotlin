fun main(args: Array<String>) {
    //arregloArrayOf()
    //arregloArra()
    arreglosDeArrayOfNull()
}
/*Arreglos, reservar espacios en memoria , guardar tipos de datos primitivos ,
por ejemplo:
A: Int = 1,56,5,56768,88,etc,
Estructura de tipos de datos , indice.
1:  arrayOf<String> : Declaración de un arreglo que recibe un argumento
variable con elementos de tipo T(int,double,string,etc) y retorna el arreglo que los contienen.
2: arrayOfNull(size: Int) : Crea un arreglo de tamaño "n" con elementos de tipo T(int,double,string,etc)
e inicializa valores null
3: emptyArray(): Crea un arreglo vacio de tamaño T
*/

fun arregloArrayOf(){

    //No te preocupes si se te olvida poner el tipo de dato, Kotlin lo hace por ti
    val A = arrayOf<Double>(2.2,3.3,4.4,5.5,6.6)
    val B = arrayOf(1,2,3,4,5,6,7) //Esto es inferencia de datos
    print( "$A" )
    print( "$B" )


}

fun arregloArra(){

    val C = Array( 10) {

        -(it+1)

    }
    println( C.joinToString() )
}

fun arreglosDeArrayOfNull(){
    val D = arrayOfNulls<String>(7)

    D[0] = "Lunes"
    D[1] = "Martes"
    D[2] = "Miercoles"
    D[3] = "Jueves"
    D[4] = "Viernes"
    D[5] = "Sabado"
    D[6] = "Domingo"

    println( D.contentToString() )



}