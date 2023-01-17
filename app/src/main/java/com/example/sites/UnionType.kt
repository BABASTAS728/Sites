package com.example.sites

import androidx.annotation.DrawableRes

sealed class UnionType {
    data class Site(val name: String, @DrawableRes val image: Int, val link: String) : UnionType()
    data class Category(val category: String) : UnionType()
}

