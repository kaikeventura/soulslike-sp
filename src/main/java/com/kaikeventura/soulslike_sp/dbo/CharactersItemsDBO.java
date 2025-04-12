package com.kaikeventura.soulslike_sp.dbo;

import jakarta.persistence.*;

@Entity
@Table(name = "characters_items")
public class CharactersItemsDBO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "character_id", referencedColumnName = "id")
    private CharactersDBO charactersDBO;

    @ManyToOne
    @JoinColumn(name = "item_id", referencedColumnName = "id")
    private ItemsDBO itemsDBO;

    @Column(nullable = false)
    private Integer quantity;
}
