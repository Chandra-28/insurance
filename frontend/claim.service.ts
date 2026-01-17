import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({ providedIn: 'root' })
export class ClaimService {
  constructor(private http: HttpClient) { }

  createClaim(claim: any) {
    return this.http.post('/api/claims', claim);
  }

  getUserClaims(userId: number) {
    return this.http.get<any[]>(`/api/claims/${userId}`);
  }

  getAllClaims() {
    return this.http.get<any[]>('/api/admin/claims');
  }

  approveClaim(id: number) {
    return this.http.put(`/api/admin/claims/${id}/approve`, {});
  }

  rejectClaim(id: number) {
    return this.http.put(`/api/admin/claims/${id}/reject`, {});
  }
}
