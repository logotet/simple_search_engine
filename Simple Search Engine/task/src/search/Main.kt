package search

fun main() {
    print("> ")
    val numberOfPeople = readLine()!!.toInt()
    println("Enter all people:")
    val people = mutableListOf<MutableList<String>>()
    for (i in 1..numberOfPeople) {
        print("> ")
        people.add(readLine()!!.split(" ").toMutableList())
    }

    println()
    println("Enter the number of search queries:")
    print("> ")
    val searchQueries = readLine()!!.toInt()
    println()

    var found = false
    for (i in 1..searchQueries) {
        println("Enter data to search people:")
        print("> ")
        val query = readLine()
        val foundResults = mutableListOf<String>()
        for (line in people) {
            for(entry in line){
                val index = entry.toLowerCase().indexOf(query!!.toLowerCase())
                if(entry.lowercase() == query.lowercase()
                    || index != -1
                )
                    foundResults.add(line.joinToString(" "))
            }
//            if (line.contains(query!!.toLowerCase())) {
//               foundResults.add(line.joinToString(" "))
//            }
        }
        found = !foundResults.isEmpty()
        if(!found){
            println("No matching people found.")
            println()
        }else {
            println("People found:")
            for (row in foundResults.distinct()) {
                println(row)
            }
            println()
        }
    }



}
