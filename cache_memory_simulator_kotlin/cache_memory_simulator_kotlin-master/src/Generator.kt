class Generator {

    fun generateEmptyBlocks(quantity: Int): MutableList<Block> {

        val blockList = mutableListOf<Block>()

        for (n in 0 until quantity) {

            val block = Block(n, -1)
            blockList.add(block)


        }

        return blockList

    }

}