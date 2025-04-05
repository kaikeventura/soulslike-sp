package com.kaikeventura.soulslike_sp.jpa;

import jakarta.persistence.*;

@Entity
@Table(name = "attribute_points")
public class AttributePointsDBO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer level;

    @Column(nullable = false)
    private Integer vitality;

    @Column(nullable = false)
    private Integer endurance;

    @Column(nullable = false)
    private Integer strength;

    @Column(nullable = false)
    private Integer intelligence;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "character_id", referencedColumnName = "id")
    private CharactersDBO charactersDBO;
}
