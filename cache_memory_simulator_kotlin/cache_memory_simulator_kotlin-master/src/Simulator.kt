import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)

    //valores que serão salvos nos blocos
    val accessPositions = mutableListOf(1, 1, 1, 1, 1, 1, 1, 1)

//    println("Por favor digite o tamanho da memoria principal (em bits) :")
//    val principalMemorySize = scanner.nextInt()

    println("Por favor digite o tamanho da memoria cache (em bits) :")
    val cacheMemorySize = scanner.nextInt()

    //configura todos os bits da memoria cache e principal para -1 (bit livre)
    Transfer.runDirectMapping(
        cacheMemorySize,
        accessPositions,
        CacheMemory(Generator().generateEmptyBlocks(cacheMemorySize))
    )


}

