package Exercise.ExcerciseOther

import java.time.LocalDate
import java.util.Date

/**
 * Song catalog
 * Imagine that you need to create a music-player app.
 *
 * Create a class that can represent the structure of a song. The Song class must include these code elements:
 *
 * Properties for the title, artist, year published, and play count
 * A property that indicates whether the song is popular. If the play count is less than 1,000, consider it unpopular.
 * A method that prints a song description in this format:
 * "[Title], performed by [artist], was released in [year published]."
 **/
class Song(private val title: String, private val artist: String, private val yearReleased: LocalDate, private val playCount: Int) {

    val isPopular: Boolean
        get() = playCount >= 1000
    fun printSong() {
            println("$title, performed by $artist, was released in $yearReleased.")
    }
}

fun main(){
    var myFavoriteSong = Song("We are the champions", "Queen", LocalDate.of(1990, 5, 25), 100000000)
    myFavoriteSong.printSong()
    println(myFavoriteSong.isPopular)


}