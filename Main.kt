

import kotlin.math.roundToInt
import kotlin.time.times


fun main(){
    val held1= Helden("Held 1", 100, listOf(HeldMagier(2, "Magischer Angriff")))
    val held2= Helden("Held 2", 120, listOf(Heldkrieger(3, "Schwertangriff")))
    val held3= Helden("Held 3", 80, listOf(HeldMagier(2,"Magischer Angriff")))
    val gegner1= Gegner("Gegner 1", 150, listOf(EndgegnerAktion(4, "Feuerodem")))
    val gegner2 = Gegner("Gegner 2", 130, listOf(EndgegnerAktion(3, "Giftbiss")))
    val gegner3= Gegner("Gegner 3", 100, listOf(EndgegnerAktion(2, "Schlagen")))
    val runden = 5
    repeat(runden) { runde ->
        println("Runde ${runde + 1}")
        kampf(held1,gegner1)
        kampf(held2, gegner2)
        kampf(held3, gegner3)

    }

}

fun kampf(angreifer: Helden, verteidiger: Gegner){
    val angreiferAktion = angreifer.waehlAktion()
    val verteidigerAktion = verteidiger.waeleAktion()
    val angreiferschaden = (angreifer.grundschaden.toDouble() * angreiferAktion.schaden.toInt()).roundToInt()
    val verteidigerSchaden = (verteidiger.grundschaden.toDouble() * verteidigerAktion.schaden.toInt() ).roundToInt()
    if (angreiferschaden > verteidigerSchaden){
        verteidiger.aktualisiereHp(angreiferschaden)
    println("${angreifer.name} greift ${verteidiger.name} an und versucht $angreiferschaden Schaden")
    }else{
        angreifer.aktualisiereHp(verteidigerSchaden)
    println("${verteidiger.name} greift ${angreifer.name} an und versucht $verteidigerSchaden Sachden")
    }
}





