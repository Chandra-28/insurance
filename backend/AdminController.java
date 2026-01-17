package com.example.insurance.controller;

import com.example.insurance.entity.Claim;
import com.example.insurance.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private ClaimService claimService;

    @GetMapping("/claims")
    public List<Claim> getAllClaims(){
        return claimService.getAllClaims();
    }

    @PutMapping("/claims/{id}/approve")
    public Claim approveClaim(@PathVariable Long id){
        return claimService.approveClaim(id);
    }

    @PutMapping("/claims/{id}/reject")
    public Claim rejectClaim(@PathVariable Long id){
        return claimService.rejectClaim(id);
    }
}
