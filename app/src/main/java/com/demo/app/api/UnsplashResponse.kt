package com.demo.app.api

import com.demo.app.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)