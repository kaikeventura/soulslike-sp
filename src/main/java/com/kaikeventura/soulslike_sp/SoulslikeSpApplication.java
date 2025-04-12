package com.kaikeventura.soulslike_sp;

import com.kaikeventura.soulslike_sp.dbo.CharactersDBO;
import com.kaikeventura.soulslike_sp.repository.CharactersRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoulslikeSpApplication {

	@Autowired
	private CharactersRepository charactersRepository;

	public static void main(String[] args) {
		SpringApplication.run(SoulslikeSpApplication.class, args);
	}

	@PostConstruct
	public void test() {
		var character = new CharactersDBO("Juliete", "FEMALE", "WARRIOR");
		var savedCharacter = charactersRepository.save(character);

//		var allCharacters = charactersRepository.findAll();
//		System.out.println(allCharacters);
//
//
//		var countCharacters = charactersRepository.count();
//		System.out.println(countCharacters);
//
//		var characterExists = charactersRepository.existsById(2L);
//		System.out.println(characterExists);

//		var characters = charactersRepository.findAllByBodyTypeAndName2("FEMALE", "Juliete");
//		System.out.println(characters);

		var secondCharacter = charactersRepository.findById(2L).get();
		System.out.println(secondCharacter);

		secondCharacter.setName("Jailson Mendes");
		var updatedCharacter = charactersRepository.save(secondCharacter);
		System.out.println(updatedCharacter);
	}
}
