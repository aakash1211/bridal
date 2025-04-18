package com.bridalEcom.api.models;

import jakarta.persistence.*;

@Entity
@Table(name = "address_master")
public class Address {
    @Id
    @Column(name = "userId")
    private Long userId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "userId")

    private User user;

    private String houseNumber;
    private String streetName;
    private String city;
    private String State;
    private Integer pinCode;

}
