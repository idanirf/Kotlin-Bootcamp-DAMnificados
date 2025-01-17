// LAs colecciones en Kotlin pueden ser mutables (getter y setter) o inmutables (getter solo)
// Tambiñen podemos usar las de Java, pero no tendrán este control de acceso super interesante
// Tsambiñen pueden ser val o var y tener T o T?

fun main() {

    // Listas
    val lista = listOf<Int>(1, 2, 3, 4, 5)
    println(lista)
    println(lista.get(0)) // podemos usar getters o []
    println(lista[0])
    println(lista.size)

    val lista2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    println(lista2)
    lista2.add(6)
    println(lista2[1])
    println(lista2)

    // Sets
    val set = setOf<Int>(1, 2, 3, 4, 5)
    println(set)
    println(set.contains(3))
    println(set.contains(6))
    println(set.size)

    val set2 = mutableSetOf<Int>(1, 2, 3, 4, 5)
    println(set2)
    set2.add(6)
    println(set2)
    println(set2.contains(6))
    println(set2.size)

    // Mapas
    val map = mapOf<String, Int>("uno" to 1, "dos" to 2, "tres" to 3)
    println(map)
    println(map["uno"])
    println(map["tres"])
    println(map.size)

    val map2 = mutableMapOf<String, Int>("uno" to 1, "dos" to 2, "tres" to 3)
    println(map2)
    map2["cuatro"] = 4
    map2["dos"] = 5
    println(map2)

}