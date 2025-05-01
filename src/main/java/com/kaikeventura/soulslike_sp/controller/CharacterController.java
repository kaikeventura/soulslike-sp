package com.kaikeventura.soulslike_sp.controller;

import com.kaikeventura.soulslike_sp.dto.CharacterRequestDTO;
import com.kaikeventura.soulslike_sp.dto.CharacterResponseDTO;
import com.kaikeventura.soulslike_sp.service.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characters")
@RequiredArgsConstructor
public class CharacterController {

    private final CharacterService characterService;

    @PostMapping
    public CharacterResponseDTO createCharacter(@RequestBody CharacterRequestDTO characterRequestDTO) {
        return characterService.createNewCharacter(characterRequestDTO);
    }
}
