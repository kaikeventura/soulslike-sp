package com.kaikeventura.soulslike_sp.dbo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "characters")
@NoArgsConstructor
@Setter
public class CharactersDBO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
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

    public CharactersDBO(String name, String bodyType, String clazz) {
        this.name = name;
        this.bodyType = bodyType;
        this.clazz = clazz;
    }
}
