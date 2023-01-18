package com.example.sites

object Server {
    fun getItems(): List<UnionType> = listOf(
        UnionType.Category("Новости"),
        UnionType.Site("Onliner.by", R.drawable.onliner, "https://www.onliner.by/"),
        UnionType.Site("Relax.by", R.drawable.relax, "https://www.relax.by/"),
        UnionType.Site("103.by", R.drawable.logo103, "https://www.103.by/"),
        UnionType.Category("Соцсети"),
        UnionType.Site("Vk.com", R.drawable.vk, "https://vk.com/"),
        UnionType.Site("Instagram.com", R.drawable.inst, "https://www.instagram.com/"),
        UnionType.Site("Twitter.com", R.drawable.twitter, "https://twitter.com/?lang=ru"),
        UnionType.Category("Фильмы"),
        UnionType.Site("KinoGo.biz", R.drawable.kinogo, "https://kinogo.biz/"),
        UnionType.Site("Okko.tv", R.drawable.okko, "https://okko.tv/"),
        UnionType.Site("IVI.ru", R.drawable.ivi, "https://www.ivi.ru/"),
    )
}