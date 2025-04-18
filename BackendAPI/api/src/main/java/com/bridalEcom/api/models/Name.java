package com.bridalEcom.api.models;

import jakarta.persistence.*;

@Table(name = "name")
@Entity
public class Name {

    @Id
    private Long userId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "userId")
    private User user;
    private String firstName;
    private String lastName;
    private String prefix;
}
