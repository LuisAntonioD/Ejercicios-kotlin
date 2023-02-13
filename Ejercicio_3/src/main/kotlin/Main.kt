fun main(args: Array<String>) {
    condiciones()
}

fun valX() : Int {
    print(" X : ")
    var x : Int = readln().toInt()
    return x
}

fun valY() : Int {
    print(" Y : ")
    var y : Int = readln().toInt()
    return y
}


fun condiciones(){
    //var x = 10
    //var y = 5
    var x = valX()
    var y = valY()
    if ( x == y ) {
        println( "Son iguales" )
    }
    else if( x > y) {
        println( "$x es mayor que $y" )
    }
    else if( x > y) {
        println( "$x es menor que $y" )
    }
    if( x != y ) {
        println( "$x y $y son diferentes" )
    }
}