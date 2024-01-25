package com.gannett.android.candidate_assessment.feature.books

import kotlinx.coroutines.delay

class BookLocalDataSource {

    suspend fun loadBooks(): List<BookEntity> {
        delay(2000)
        return listOf(
            BookEntity(
                title = "after the hurricane",
                genre = "fiction"
            ),
            BookEntity(
                title = "begin the world over",
                genre = "fantasy"
            ),
            BookEntity(
                title = "Delphi",
                genre = "fiction"
            ),
            BookEntity(
                title = "slaying the dragon",
                genre = "business"
            ),
            BookEntity(
                title = "cant hurt me",
                genre = "business"
            ),
            BookEntity(
                title = "make your bed",
                genre = "business"
            ),
            BookEntity(
                title = "freezing order",
                genre = "business"
            ),
            BookEntity(
                title = "the viral underclass",
                genre = "science"
            ),
            BookEntity(
                title = "inventor of the future",
                genre = "science"
            ),
            BookEntity(
                title = "existential physics",
                genre = "science"
            )
        )
    }

}
