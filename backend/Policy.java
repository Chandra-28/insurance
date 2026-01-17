package com.example.insurance.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String policyNumber;
    private String policyType;
    private Double premium;
    private Double coverageAmount;

    @ManyToOne
    private User user;
}
