package com.example.insurance.service;

import com.example.insurance.entity.Claim;
import com.example.insurance.repository.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    public Claim createClaim(Claim claim){
        claim.setStatus("PENDING");
        return claimRepository.save(claim);
    }

    public List<Claim> getClaimsByUser(Long userId){
        return claimRepository.findByPolicyUserId(userId);
    }

    public List<Claim> getAllClaims(){
        return claimRepository.findAll();
    }

    public Claim approveClaim(Long claimId){
        Claim claim = claimRepository.findById(claimId).orElseThrow();
        claim.setStatus("APPROVED");
        return claimRepository.save(claim);
    }

    public Claim rejectClaim(Long claimId){
        Claim claim = claimRepository.findById(claimId).orElseThrow();
        claim.setStatus("REJECTED");
        return claimRepository.save(claim);
    }
}
