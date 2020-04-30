import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FollowupformComponent } from './components/followupform/followupform.component';
import { LocationComponent } from './components/location/location.component';
import { PokefinderComponent } from './components/pokefinder/pokefinder.component';
import {MypostapiComponent} from './components/mypostapi/mypostapi.component';


const routes: Routes = [
{path:"contact",component:FollowupformComponent},
{path:"location",component:LocationComponent},
{path:"pokemon",component:PokefinderComponent},
{path:"mypostapi",component:MypostapiComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
