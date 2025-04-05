package com.kaikeventura.soulslike_sp.jpa;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "characters")
public class CharactersDBO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(name = "body_type", length = 10, nullable = false)
    private String bodyType;

    @Column(length = 10, nullable = false)
    private String clazz;

    @OneToOne(mappedBy = "charactersDBO")
    private AttributePointsDBO attributePointsDBO;

    @OneToMany(mappedBy = "charactersDBO", cascade = CascadeType.ALL)
    private List<CharactersItemsDBO> charactersItemsDBOS = new ArrayList<>();
}
