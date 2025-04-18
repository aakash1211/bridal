package com.bridalEcom.api.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
import lombok.RequiredArgsConstructor;
import javax.mail.internet.InternetAddress;
import java.util.Date;

@Entity
@Data
@RequiredArgsConstructor
@Table(name ="user_master")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "userId")
    private Long userId;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
    @PrimaryKeyJoinColumn
    //@JoinColumn(name = "nameId", referencedColumnName = "userId")
    private Name userName;

    @OneToOne(cascade =  CascadeType.ALL, mappedBy = "user")
    @PrimaryKeyJoinColumn
//    @JoinColumn(name= "addressId", referencedColumnName = "userId")
    private Address homeAddress;

    @OneToOne(cascade = CascadeType.ALL,mappedBy =  "user")
    @PrimaryKeyJoinColumn
    //@JoinColumn(name = "addressId", referencedColumnName =  "userId")
    private Address officeAddress;

    private InternetAddress email;
    private Integer phoneNumber;
    private Date birthDate;
    private Date registeredDate;
    private String password;
    private String encryptedPassword;
    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] image;
    private UserRole role;
    private boolean isActive;
    private boolean isAdmin;

}
