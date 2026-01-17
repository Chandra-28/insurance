package com.example.insurance.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String claimNumber;
    private String status; // PENDING, APPROVED, REJECTED
    private String description;
    private Double amount;
    private LocalDateTime createdDate = LocalDateTime.now();

    @ManyToOne
    private Policy policy;
}
