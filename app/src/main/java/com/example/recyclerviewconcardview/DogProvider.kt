package com.example.recyclerviewconcardview

class DogProvider {
    companion object{
        val DogList = listOf<Dogs>(
            Dogs(
                "Pastor Aleman",
                5,
                "Rex",
                "https://loremflickr.com/200/200/dog",
                true,
                true,
                true,

            ),
            Dogs(
                "Gran Danes",
                1,
                "Dan",
                "https://loremflickr.com/200/200/dog",
                true,
                true,
                true,

                ),
            Dogs(
                "Dalmata",
                3,
                "Pongo",
                "https://loremflickr.com/200/200/dog",
                true,
                true,
                true,

                )
        )
    }
}