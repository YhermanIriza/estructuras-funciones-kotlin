fun main() {
    bucleExterno@ for (i in 0..3) {
        for (j in 0..3) {
            if (i == j) continue@bucleExterno
            println("i=$i, j=$j")
        }
    }
}
