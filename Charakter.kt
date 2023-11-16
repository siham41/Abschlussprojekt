open class Charakter(
    val name: String,
    var hp: Int,
    val aktionen: List<Aktion>,
    var grundschaden: Int = 50,
    val schnelligkeit: Int = 10,
    val ruestung: Int = 10
) {
    constructor(name: Int, grundschaden: Int) : this(name.toString(), 0, emptyList(), grundschaden)

    open fun waehlAktion(): Aktion {
        return aktionen.random()
    }

    open fun aktualisiereHp(schaden: Int) {
        hp -= schaden
    }

    fun getSchaden(): Int {
        return aktionen.map { it.schaden.toLong() }.sum().toInt() * grundschaden
    }
}

