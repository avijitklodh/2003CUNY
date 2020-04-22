import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BioComponent } from './components/bio/bio.component';
import { EmployeeComponent } from './components/employee/employee.component';
import { StaffComponent } from './components/staff/staff.component';

@NgModule({
  declarations: [
    AppComponent,
    BioComponent,
    EmployeeComponent,
    StaffComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
