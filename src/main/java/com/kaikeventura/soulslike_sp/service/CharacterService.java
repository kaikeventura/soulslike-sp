package com.kaikeventura.soulslike_sp.service;

import com.kaikeventura.soulslike_sp.dbo.CharactersDBO;
import com.kaikeventura.soulslike_sp.dto.CharacterRequestDTO;
import com.kaikeventura.soulslike_sp.dto.CharacterResponseDTO;
import com.kaikeventura.soulslike_sp.repository.CharactersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharacterService {

    private final CharactersRepository charactersRepository;

    public CharacterResponseDTO createNewCharacter(CharacterRequestDTO characterRequestDTO) {
        var characterSaved = charactersRepository.save(
                new CharactersDBO(
                        characterRequestDTO.name(),
                        characterRequestDTO.bodyType(),
                        characterRequestDTO.clazz()
                )
        );
        return new CharacterResponseDTO(characterSaved.getId());
    }
}
