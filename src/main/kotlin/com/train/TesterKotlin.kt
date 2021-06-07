package com.train

import java.util.*

fun main() {

    val scanner= Scanner(System.`in`)
    print("Please enter number of tickets:")
    val tickets = scanner.nextInt()
    print("How many round-trip tickets:")
    val rountrips = scanner.nextInt()
    val testerKotlin = TesterKotlin (tickets, rountrips,1000)
    testerKotlin.print()
}

class TesterKotlin(var tickets: Int, var rountrips: Int,val price: Int){
    fun print(){
        println("Total tickets:\t $tickets" + "\tRound-trip:\t $rountrips" + "\tTotal:\t ${getPrice2()}")
    }
    fun getPrice2():Double{
        return (tickets-rountrips)*price+rountrips*price*2*0.9
    }
}