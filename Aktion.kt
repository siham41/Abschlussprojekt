open class Aktion(val name: String, val schaden: Int, val beschreibung: String, var grundschaden: Int) {
    constructor(name: String, schaden: Int) : this(name, schaden, "", 0)
    constructor(schaden: Int, grundschaden: Int) : this("", schaden, "", grundschaden)
    constructor(schaden: Int, beschreibung: String) : this("", schaden,"", 0)
     fun getAktionInfo(): String{
        return "$name: Schaden $schaden, Beschreibung: $beschreibung, Grundschaden: $grundschaden"
    }
}