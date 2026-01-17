import { Component } from '@angular/core';
import { ClaimService } from '../services/claim.service';

@Component({
  selector: 'app-claim',
  templateUrl: './claim.component.html'
})
export class ClaimComponent {
  description: string = '';
  amount: number = 0;

  constructor(private claimService: ClaimService) { }

  createClaim() {
    const claim = { description: this.description, amount: this.amount };
    this.claimService.createClaim(claim).subscribe(res => console.log(res));
  }
}
