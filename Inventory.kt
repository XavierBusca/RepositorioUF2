import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File

@Serializable
data class Item(val id: Int, val nom: String, val tipus: String, val valor: Int, val pes: Double)

@Serializable
data class Inventory(val items: MutableList<Item> = mutableListOf()) {
    fun addItem(item: Item) {
        items.add(item)
    }

    fun removeItemById(id: Int) {
        items.removeIf { it.id == id }
    }

    fun searchItemsByName(name: String): List<Item> {
        return items.filter { it.nom == name }
    }

    fun searchItemsByType(type: String): List<Item> {
        return items.filter { it.tipus == type }
    }

    fun listAllItems() {
        for (item in items) {
            println("ID: ${item.id}, Nom: ${item.nom}, Tipus: ${item.tipus}, Valor: ${item.valor}, Pes: ${item.pes}")
        }
    }

    fun calculateTotalValue(): Int {
        return items.sumOf { it.valor }
    }

    fun calculateTotalWeight(): Double {
        return items.sumOf { it.pes }
    }

    fun findMostValuableItem(): Item? {
        return items.maxByOrNull { it.valor }
    }

    fun findHeaviestItem(): Item? {
        return items.maxByOrNull { it.pes }
    }

    fun saveInventoryToFile(filename: String) {
        val json = Json.encodeToString(this)
        File(filename).writeText(json)
    }

    companion object {
        fun loadInventoryFromFile(filename: String): Inventory {
            val json = File(filename).readText()
            return Json.decodeFromString(json)
        }
    }
}

fun main() {
    val inventory = Inventory()

    // Afegir un nou element a l'inventari
    val item1 = Item(1, "Espasa", "arma", 100, 2.5)
    inventory.addItem(item1)

    // Eliminar un ítem de l'inventari per id
    inventory.removeItemById(1)

    // Buscar ítems per nom o tipus
    val itemsByName = inventory.searchItemsByName("Espasa")
    val itemsByType = inventory.searchItemsByType("arma")

    // Llistar tots els ítems a l'inventari
    inventory.listAllItems()

    // Calculeu el valor total de l'inventari
    val totalValue = inventory.calculateTotalValue()

    // Calculeu el pes total de l'inventari
    val totalWeight = inventory.calculateTotalWeight()

    // Trobar lítem més valuós
    val mostValuableItem = inventory.findMostValuableItem()

    // Trobar lítem més pesat
    val heaviestItem = inventory.findHeaviestItem()

    // Desar l'inventari en un fitxer
    inventory.saveInventoryToFile("inventory.json")

    // Carregar l'inventari des d'un fitxer
    val loadedInventory = Inventory.loadInventoryFromFile("inventory.json")
}