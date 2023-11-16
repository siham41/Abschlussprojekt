

open class Gegner(
    name: String,
    hp: Int,
    aktionen: List<Aktion>,
    grundschaden: Int = 50,
    schnelligkeit: Int = 10,
    ruestung: Int = 10
) : Charakter(name, hp, aktionen, grundschaden, schnelligkeit, ruestung)





