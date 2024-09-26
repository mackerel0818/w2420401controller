package kr.ac.kumoh.s20200183.w2420401controller.Repository

import kr.ac.kumoh.s20200183.w2420401controller.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository {
    val songs = listOf(
        Song(1, "사랑에 연습이 있었다면", "임재현"),
        Song(2, "테스형","나훈아"),
        Song(3, "소주 한 잔", "임창정"),
    )
    fun fetchSong() = songs
}