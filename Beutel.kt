class Beutel {
    val heiltrankAnzahl: Int = 3
    val vitamineAnzahl: Int = 1
    fun nutzeheiltrank(held: Helden){
        val heilung = held.hp / 2
        held.hp += heilung
        println("${held.name} verwendet einen Heiltrank und heilt sich um $heilung HP.")
    }
    fun nutzeVitamine(held: Aktion) {

        held.grundschaden += 10
        println("${held.name} verwendet Vitamine und erhöht seinen Schaden dauerhaft um 10.")
    }
}



