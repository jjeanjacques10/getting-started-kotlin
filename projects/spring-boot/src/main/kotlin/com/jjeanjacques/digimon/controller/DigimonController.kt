package com.jjeanjacques.digimon.controller

import com.jjeanjacques.digimon.controller.dto.DigimonPowerDTO
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.http.ResponseEntity

@RestController
@RequestMapping("/digimon")
class DigimonController {

    @GetMapping
    fun listAll(): ResponseEntity<Any> {
        val response = ArrayList<DigimonPowerDTO>()

        var digimons = listOf("Agumon", "Tailmon", "Angemon")
        val digimonPower: MutableMap<Int, Int> = mutableMapOf(0 to 50, 1 to 50, 2 to 100)

        var i: Int = 0
        digimons.forEach {
            val digimonPowerDTO = DigimonPowerDTO(it, digimonPower[i]!!)
            response.add(digimonPowerDTO)
            i++
        }
        return ResponseEntity.ok(response)
    }
}