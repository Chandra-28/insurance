package com.example.insurance.controller;

import com.example.insurance.entity.Claim;
import com.example.insurance.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/claims")
public class ClaimController {

    @Autowired
    private ClaimService claimService;

    @PostMapping
    public Claim createClaim(@RequestBody Claim claim){
        return claimService.createClaim(claim);
    }

    @GetMapping("/{userId}")
    public List<Claim> getUserClaims(@PathVariable Long userId){
        return claimService.getClaimsByUser(userId);
    }
}
