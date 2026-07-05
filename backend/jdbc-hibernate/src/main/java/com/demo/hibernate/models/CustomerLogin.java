package com.demo.hibernate.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loginId;
    private String username;
    private String password;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerID")
    private Customer customer;
}
