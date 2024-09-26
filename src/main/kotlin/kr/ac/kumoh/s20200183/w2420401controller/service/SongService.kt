package kr.ac.kumoh.s20200183.w2420401controller.service

import kr.ac.kumoh.s20200183.w2420401controller.Repository.SongRepository
import kr.ac.kumoh.s20200183.w2420401controller.model.Song
import org.springframework.stereotype.Service

@Service
class SongService(val repository: SongRepository) {
    fun getAllSongs(): List<Song> {
        return repository.fetchSong()
    }
}