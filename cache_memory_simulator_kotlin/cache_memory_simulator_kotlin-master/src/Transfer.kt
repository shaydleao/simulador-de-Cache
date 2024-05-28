class Transfer {


    companion object {
        var hitOrMiss = ""
        var numHit = 0
        var numMiss = 0
        fun runDirectMapping(totalCache: Int, memoryPositions: List<Int>, cacheMemory: CacheMemory) {

            Printer.printCache(cacheMemory)

            for (memoryPosition in memoryPositions) {
                for (index in memoryPositions.indices) {
                    val cachePosition = memoryPosition % totalCache

                    hitOrMiss = if (cacheMemory.blocks[cachePosition].bitValue == memoryPosition) {
                        numHit++
                        "Hit"
                    } else {
                        numMiss++
                        "Miss"
                    }
                    cacheMemory.blocks[cachePosition].bitValue = memoryPosition

                    println("Leitura linha $index,  posição de memória desejada $memoryPosition.")
                    println("Status: $hitOrMiss \n")
                    Printer.printCache(cacheMemory)

                    println("------------------------")
                    println("Resumo Mapeamento Direto")
                    println("------------------------")
                    println("Total de memórias acessadas: ${memoryPositions.size}")
                    println("Total HIT: $numHit")
                    println("Total MISS: $numMiss")
                    val cacheHitRatio = (numHit / memoryPositions.size) * 100
                    println(
                        "Taxa de Cache HIT: $cacheHitRatio"
                    )

                }

            }
        }


    }
}




