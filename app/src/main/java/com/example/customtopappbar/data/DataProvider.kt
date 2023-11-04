package com.example.customtopappbar.data

import com.example.customtopappbar.R

object DataProvider {

    val InvestList =
        InvestList(
            id = 1,
            title = "Monty",
            sex = "Male",
            age = 14,
            description = "Monty enjoys chicken treats and cuddling while watching Seinfeld.",
            imageList = R.drawable.p1
        )

    val InvestListList = listOf(
        InvestList,
        InvestList(
            id = 2,
            title = "Jubilee",
            sex = "Female",
            age = 6,
            description = "Jubilee enjoys thoughtful discussions by the campfire.",
            imageList = R.drawable.p2
        ),
        InvestList(
            id = 3,
            title = "Beezy",
            sex = "Male",
            age = 8,
            description = "Beezy's favorite past-time is helping you choose your brand color.",
            imageList = R.drawable.p3
        ),
        InvestList(
            id = 4,
            title = "Mochi",
            sex = "Male",
            age = 10,
            description = "Mochi is the perfect \"rubbery ducky\" debugging pup, always listening.",
            imageList = R.drawable.p4
        ),
        InvestList(
            id = 5,
            title = "Brewery",
            sex = "Female",
            age = 12,
            description = "Brewery loves fetching you your favorite homebrew.",
            imageList = R.drawable.p5
        ),
        InvestList(
            id = 6,
            title = "Lucy",
            sex = "Female",
            age = 8,
            description = "Picture yourself in a boat on a river, Lucy is a pup with kaleidoscope eyes.",
            imageList = R.drawable.p6
        ),
        InvestList(
            id = 7,
            title = "Astro",
            sex = "Male",
            age = 10,
            description = "Is it a bird? A plane? No, it's Astro blasting off into your heart!",
            imageList = R.drawable.p7
        ),
        InvestList(
            id = 8,
            title = "Boo",
            sex = "Female",
            age = 9,
            description = "Boo is just a teddy bear in disguise. What he lacks in grace, he makes up in charm.",
            imageList = R.drawable.p8
        ),
        InvestList(
            id = 9,
            title = "Pippa",
            sex = "Male",
            age = 7,
            description = "Pippa likes to look out the window and write pup-poetry.",
            imageList = R.drawable.p9
        ),
        InvestList(
            id = 10,
            title = "Coco",
            sex = "Female",
            age = 10,
            description = "Coco enjoys getting pampered at the local InvestList spa.",
            imageList = R.drawable.p10
        ),
        InvestList(
            id = 11,
            title = "Brody",
            sex = "Male",
            age = 13,
            description = "Brody is a good boy, waiting for your next command.",
            imageList = R.drawable.p11
        ),
        InvestList(
            id = 12,
            title = "Stella",
            sex = "Female",
            age = 14,
            description = "Stella! Calm and always up for a challenge, she's the perfect companion.",
            imageList = R.drawable.p12
        ),
    )
}
