fun main() {

    val mesesDelAno1:Array<String> = arrayOf("Enero", "Febrero", "Marzo")   // Especificando el tipo
    val mesesDelAno2 = arrayOf("Enero", "Febrero", "Marzo")                 // Sin especificar tipo (inferencia de tipos)
    val miMatriz1 = arrayOf(15, 25, 8, -7, 92)                              // Sin especificar tipo (inferencia de tipos)
    val miMatriz2 = Array(5){0}                                             // Se declara el array de 5 elementos, todos con valor incial 0

    val miArray = Array(5){0}
    miArray[2] = 7
    println(miArray[2]) 													// Imprime una posicion concreta

    println(miArray.joinToString())	                                        // Imprime el array completo
    val miArray2 = intArrayOf(1, 7, 9, 15, 25)								// Desclarar con arrayOf indicando el tipo de dato
    println(miArray2.joinToString())

    lateinit var miArray3:Array<String>										// Incicializar un array vacio

}