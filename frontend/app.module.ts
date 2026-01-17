import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { LoginComponent } from './login/login.component';
import { ClaimComponent } from './claim/claim.component';
import { AdminComponent } from './admin/admin.component';

@NgModule({
  declarations: [
    LoginComponent,
    ClaimComponent,
    AdminComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [LoginComponent]
})
export class AppModule { }
