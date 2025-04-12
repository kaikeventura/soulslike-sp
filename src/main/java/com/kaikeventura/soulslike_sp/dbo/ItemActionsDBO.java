package com.kaikeventura.soulslike_sp.dbo;

import jakarta.persistence.*;

@Entity
@Table(name = "item_actions")
public class ItemActionsDBO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Boolean isInfinite;

    @Column(nullable = false)
    private Boolean isUsable;

    @Column(nullable = false)
    private Boolean isDrop;

    @Column(nullable = false)
    private Boolean action;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_id", referencedColumnName = "id")
    private ItemsDBO itemsDBO;
}
