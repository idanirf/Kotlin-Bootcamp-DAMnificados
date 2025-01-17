// https://kotlinlang.org/docs/collection-operations.html
val alumnado = listOf(
    Alumno("Juan", 7.5, "DAM"),
    Alumno("Pedro", 8.5, "DAM"),
    Alumno("Ana", 9.5, "DAW"),
    Alumno("María", 8.5, "DAM"),
    Alumno("José", 9.5, "DAW"),
    Alumno("Alicia", 7.5, "DAW")
)

fun main() {
    // Todos los alumnos
    println("Todos los alumnos:")
    alumnado.forEach { println(it) }

    // Alumnos de DAM
    println("Alumnos de DAM:")
    println(alumnado.filter { it.curso == "DAM" })

    // Alumnos con nota >= 8.5
    println("Alumnos con nota >= 8.5:")
    println(alumnado.filter { it.nota >= 8.5 })

    // Alumnos con nota máxima
    println("Alumnos con nota máxima:")
    val notaMaxima = alumnado.maxBy { it.nota }
    println("Alumno ${notaMaxima.nombre} con nota: ${notaMaxima.nota}")

    // Nota media de los alumnos de DAM
    println("Nota media de los alumnos de DAM:")
    val notaMediaDAM = alumnado.filter { it.curso == "DAM" }
        .map { it.nota }
        .average()
        .roundTo(2)
    println(notaMediaDAM)

    // Alumnado agrupado por grupo
    println("Alumnado agrupado por grupo:")
    val agrupadoPorGrupo = alumnado.groupBy { it.curso }
    println(agrupadoPorGrupo)

    // Alumnado agrupado por nota mayor que 8.5
    println("Alumnado agrupado por nota mayor que 8.5:")
    val agrupadoPorNota = alumnado.groupBy { if (it.nota >= 8.5) "Sobrsalientes" else "Otros" }
    println(agrupadoPorNota)

    // Alumnado ordenado por nota descendente
    println("Alumnado ordenado por nota descendente:")
    val ordenadoPorNota = alumnado.sortedByDescending { it.nota }
    println(ordenadoPorNota)

    // Buscar alumnos con nota >= 8.5
    println("Buscar alumnos con nota >= 8.5:")
    val buscarNota = alumnado.find { it.nota >= 8.5 }
    println(buscarNota)

    // Buscar alumnos con nota >= 8.5 y curso DAW
    println("Buscar alumnos con nota >= 8.5 y curso DAW:")
    val buscarNotaYCurso = alumnado.find { it.nota >= 8.5 && it.curso == "DAW" }
    println(buscarNotaYCurso)

    // Numero de alumnos agrupados por nota mayor que 8.5
    println("Numero de alumnos agrupados por nota mayor que 8.5:")
    val numeroAlumnos = alumnado.groupBy { if (it.nota >= 8.5) "Sobrsalientes" else "Otros" }.
        map { it.key to it.value.size }
    println(numeroAlumnos)
}