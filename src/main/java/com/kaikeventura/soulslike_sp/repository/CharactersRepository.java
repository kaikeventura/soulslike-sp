package com.kaikeventura.soulslike_sp.repository;

import com.kaikeventura.soulslike_sp.dbo.CharactersDBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharactersRepository extends JpaRepository<CharactersDBO, Long> {
    List<CharactersDBO> findAllByClazz(String clazz);
    List<CharactersDBO> findAllByBodyType(String bodyType);
    List<CharactersDBO> findAllByBodyTypeAndName(String bodyType, String name);

    @Query(
            value = "select * from characters where body_type = :bodyType and name = :name",
            nativeQuery = true
    )
    List<CharactersDBO> findAllByBodyTypeAndName2(String bodyType, String name);
}
