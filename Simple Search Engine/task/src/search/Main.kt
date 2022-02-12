package search

fun main() {
    print("> ")
    val words = readLine()!!.split(" ")
    print("> ")
    val word = readLine()

    if(words.contains(word)){
        print("> ")
        println(words.indexOf(word) + 1)
    }else{
        println("Not found")
    }
}
