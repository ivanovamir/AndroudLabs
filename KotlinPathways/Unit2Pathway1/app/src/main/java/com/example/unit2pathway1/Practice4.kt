package com.example.unit2pathway1

fun main() {
    val testSong= MySong("Lalala", "Utkin Amir", 2024, 200)
    testSong.printDescription()
    println(testSong.isPopular)
}


class MySong(
    private val title: String,
    private val artist: String,
    private val yearPublished: Int,
    private val playCount: Int
){
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}