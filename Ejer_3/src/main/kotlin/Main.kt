fun main(args: Array<String>) {
    condiciones()
}

fun valX():Int{
    print("Dame la variable X:")
    var x:Int = readln().toInt()
    return x
}

fun valY():Int{
    print("Dame la variable Y:")
    var y:Int = readln().toInt()
    return y
}

fun valZ():Int{
    print("Dame la variable Z:")
    var z:Int = readln().toInt()
    return z
}




fun condiciones(){
    var x = valX()
    var y = valY()
    var z = valZ()


    if(x==y && x==z ){
        println("Son numeros iguales ")
    }
    else if(x==y ){
        println(" $x y $y Son  iguales ")
    }
    else if(x==z ){
        println(" $x y $z Son  iguales ")
    }
    else if(z==y ){
        println(" $z y $y Son  iguales ")
    }



    else if(x<=y && x<=z){
        println("$x   Es el numero minimo")
        if(y<=z){
            println("$y    Es el numero de enmedio")
            println("$z   Es el numero minimo")
        }
        else {
            println("$z    Es el numero de enmedio")
            println("$y   Es el numero maximo")
        }
    }
    else if(y<=x && y<=z){
        println("$y   Es el numero minimo")
        if(x<=z){
            println("$x    Es el numero de enmedio")
            println("$z   Es el numero maximo")
        }
        else {

            println("$z    Es el numero de enmedio")
            println("$x   Es el numero maximo")

        }
    }
    else{
        println("$z   Es el numero minimo")

        if(x<=y){
            println("$x    Es el numero de enmedio")
            println("$y   Es el numero maximo")

        }
        else{

            println("$y   Es el numero de enmedio")
            println("$x  Es el numero maximo")

        }
    }
}
