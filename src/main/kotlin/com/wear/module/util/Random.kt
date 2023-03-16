package com.wear.module.util

import kotlin.random.Random

class Random {
    private val charPool : List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9') + listOf('-', '_')
    fun getRandomId(
        lang: Long = 20,
    ) = (1..lang)
        .map { Random.nextInt(0, charPool.size).let { charPool[it] } }
        .joinToString("")
}