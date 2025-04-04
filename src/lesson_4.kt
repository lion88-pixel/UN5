fun main() {
    val crystallOre = 7
    val ironOre = 11
    val BAFF = 20

    val sBAFFcrystall: Int = crystallOre * BAFF / 100 + crystallOre
    val sverxCrystall = sBAFFcrystall - crystallOre
    val sBAFFiron: Int = ironOre * BAFF / 100 + ironOre
    val sverxIron = sBAFFiron - ironOre

    println("Количество кристалической руды сверх с учетом баффа $sverxCrystall")
    println("Количество железной руды сверх с учетом баффа $sverxIron")
}