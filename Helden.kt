open class Helden(
    val name: String,
    var hp: Int,
    val aktionen: List<Aktion>,
    var grundschaden: Int = 50,
    val schnelligkeit: Int =10,
    val ruestung: Int =10 ) {


    open fun waehlAktion(): Aktion {
        return aktionen.random()
    }
    open fun aktualisiereHp(schaden: Int){
        hp -= schaden
    }
    open fun getSchaden(): Int{
        return aktionen.map { it.schaden.toLong() }.sum().toInt() * grundschaden
    }
}



