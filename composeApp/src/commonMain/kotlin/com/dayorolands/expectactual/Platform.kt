package com.dayorolands.expectactual

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform