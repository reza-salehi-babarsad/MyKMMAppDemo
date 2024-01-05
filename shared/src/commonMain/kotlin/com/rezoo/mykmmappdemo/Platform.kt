package com.rezoo.mykmmappdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform