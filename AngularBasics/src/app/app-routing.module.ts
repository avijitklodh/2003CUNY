import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FollowupformComponent } from './components/followupform/followupform.component';
import { LocationComponent } from './components/location/location.component';
import { PokefinderComponent } from './components/pokefinder/pokefinder.component';


const routes: Routes = [
{path :"contact", component : FollowupformComponent},
{path :"location/wv", component: LocationComponent},
{path :"pokemon", component: PokefinderComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
