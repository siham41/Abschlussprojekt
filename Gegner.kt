open class Gegner(
    val name: String,
    var hp: Int,
    val aktionen: List<EndgegnerAktion>,
    val grundschaden: Int = 50,
    val schnelligkeit: Int = 10,
    val ruestung: Int = 10

    ) {


    open fun  waeleAktion(): EndgegnerAktion {
        return aktionen.random()
    }
    open  fun aktualisiereHp(schaden: Int) {

        hp -= schaden
    }
    fun getSchaden(): Int{
        return aktionen.map { it.schaden.toLong() }.sum().toInt() * grundschaden
    }

}





