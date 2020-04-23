import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule} from '@angular/common/http'

import { AppComponent } from './app.component';
import { BioComponent } from './components/bio/bio.component';
import { EmployeeComponent } from './components/employee/employee.component';
import { StaffComponent } from './components/staff/staff.component';
import { PhonenumberPipe } from './pipes/phonenumber.pipe';
import { FollowupformComponent } from './components/followupform/followupform.component';
import { LocationComponent } from './components/location/location.component';
import { PokefinderComponent } from './components/pokefinder/pokefinder.component';

@NgModule({
  declarations: [
    AppComponent,
    BioComponent,
    EmployeeComponent,
    StaffComponent,
    PhonenumberPipe,
    FollowupformComponent,
    LocationComponent,
    PokefinderComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
