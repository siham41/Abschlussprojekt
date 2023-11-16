
import kotlin.math.roundToInt

fun main() {
    val helden = listOf(
        HeldMagier("Magier 1", 100, 50, listOf(Aktion("Magischer Angriff", 2))),
        HeldKrieger("Krieger 1", 120, 60, listOf(Aktion("Schwertangriff", 3))),
        HeldMagier("Magier 2", 90, 45, listOf(Aktion("Magischer Angriff", 2)))
    )

    val krieger = listOf(
        HeldKrieger("Krieger 2", 110, 55, listOf(Aktion("Schwertangriff", 3))),
        HeldMagier("Magier 3", 80, 40, listOf(Aktion("Magischer Angriff", 2))),
        HeldKrieger("Krieger 3", 130, 65, listOf(Aktion("Schwertangriff", 3)))
    )

    val maxRunden = 10 // Setze hier die maximale Anzahl von Runden

    var runde = 1

    while (runde <= maxRunden && !istKampfVorbei(helden, krieger)) {
        println("Runde $runde")

        for (i in helden.indices) {
            try {
                kampf(helden[i], krieger[i])
            } catch (e: Exception) {
                println("Ein Fehler ist aufgetreten: ${e.message}")
            }
        }

        runde++
    }

    val gewinner = ermitteleGewinner(helden, krieger)
    if (gewinner != null) {
        println("Die $gewinner haben gewonnen!")
    } else {
        println("Unentschieden! Der Kampf endet nach $maxRunden Runden.")
    }
}

fun kampf(angreifer: Charakter, verteidiger: Charakter) {
    val angreiferAktion = angreifer.waehlAktion()
    val verteidigerAktion = verteidiger.waehlAktion()

    val angreiferSchaden = berechneSchaden(angreifer, angreiferAktion)
    val verteidigerSchaden = berechneSchaden(verteidiger, verteidigerAktion)

    println("${angreifer.name} greift ${verteidiger.name} an!")

    try {
        handleSchaden(angreifer, verteidiger, angreiferSchaden, verteidigerSchaden)
    } catch (e: Exception) {
        println("Ein Fehler ist aufgetreten: ${e.message}")
    }
}

fun berechneSchaden(charakter: Charakter, aktion: Aktion): Int {
    return (charakter.grundschaden.toDouble() * aktion.schaden).roundToInt()
}

fun handleSchaden(angreifer: Charakter, verteidiger: Charakter, angreiferSchaden: Int, verteidigerSchaden: Int) {
    if (angreiferSchaden > verteidigerSchaden) {
        verteidiger.aktualisiereHp(angreiferSchaden)
        println("${angreifer.name} verursacht $angreiferSchaden Schaden bei ${verteidiger.name}")
    } else {
        angreifer.aktualisiereHp(verteidigerSchaden)
        println("${verteidiger.name} verursacht $verteidigerSchaden Schaden bei ${angreifer.name}")
    }
}

fun istKampfVorbei(helden: List<Charakter>, krieger: List<Charakter>): Boolean {
    return sindAlleTot(helden) || sindAlleTot(krieger)
}

fun sindAlleTot(gruppe: List<Charakter>): Boolean {
    return gruppe.all { it.hp <= 0 }
}

fun ermitteleGewinner(helden: List<Charakter>, krieger: List<Charakter>): String? {
    if (sindAlleTot(helden)) {
        return "Krieger"
    } else if (sindAlleTot(krieger)) {
        return "Helden"
    }
    return null
}


