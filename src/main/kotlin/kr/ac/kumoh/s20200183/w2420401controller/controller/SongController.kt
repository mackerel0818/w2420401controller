package kr.ac.kumoh.s20200183.w2420401controller.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController {
    val title = listOf("사랑에 연습이 있었다면", "테스형", "소주 한 잔")

    @GetMapping("/song/list")
    fun getSongList() = title
}