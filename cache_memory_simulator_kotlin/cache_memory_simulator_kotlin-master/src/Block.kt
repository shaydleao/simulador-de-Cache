class Block(
    var position: Int,
    var bitValue: Int
) {
    operator fun component1(): Int {
        return position
    }

    operator fun component2(): Int {
        return bitValue
    }

}