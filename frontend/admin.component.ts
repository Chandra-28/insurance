import { Component, OnInit } from '@angular/core';
import { ClaimService } from '../services/claim.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html'
})
export class AdminComponent implements OnInit {
  claims: any[] = [];

  constructor(private claimService: ClaimService) { }

  ngOnInit() {
    this.claimService.getAllClaims().subscribe(data => this.claims = data);
  }

  approve(id: number) {
    this.claimService.approveClaim(id).subscribe(() => this.ngOnInit());
  }

  reject(id: number) {
    this.claimService.rejectClaim(id).subscribe(() => this.ngOnInit());
  }
}
