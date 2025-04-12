package com.kaikeventura.soulslike_sp.dbo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "items")
public class ItemsDBO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, unique = true, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String type;

    @OneToOne(mappedBy = "itemsDBO")
    private ItemActionsDBO itemActionsDBO;

    @OneToMany(mappedBy = "itemsDBO", cascade = CascadeType.ALL)
    private List<CharactersItemsDBO> charactersItemsDBOS = new ArrayList<>();
}
