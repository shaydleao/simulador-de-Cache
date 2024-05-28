class Printer {

    companion object {
        fun printCache(cache: CacheMemory) {

            println("+--------------------------+")
            println("|      Cache Direto        |")
            println("+--------------------------+")
            println("|Tamanho Cache: ${cache.blocks.size}         |")
            println("+----------+---------------+")
            println("|Pos Cache |Posição Memória|")
            println("+----------+---------------+")
            for ((position, valor) in cache.blocks) {
                println("|          $position | $valor         |")
                println("+----------+---------------+")
            }

        }
    }

}