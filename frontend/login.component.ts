import { Component } from '@angular/core';
import { AuthService } from '../services/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html'
})
export class LoginComponent {
  email: string = '';
  password: string = '';

  constructor(private authService: AuthService) { }

  login() {
    this.authService.login({ email: this.email, password: this.password })
      .subscribe(token => {
        console.log('JWT Token:', token);
        // save token to localStorage
      });
  }
}
