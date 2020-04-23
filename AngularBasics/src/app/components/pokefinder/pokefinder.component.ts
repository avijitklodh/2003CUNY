import { Component, OnInit } from '@angular/core';
import { PokesearchService } from 'src/app/services/pokesearch.service';

@Component({
  selector: 'app-pokefinder',
  templateUrl: './pokefinder.component.html',
  styleUrls: ['./pokefinder.component.css']
})
export class PokefinderComponent implements OnInit {

  constructor(private pokesearch:PokesearchService) { }

  pokeName:string;

  // the pokemon object we get back
  // from the http request
  pokemon:any;


  ngOnInit(): void {
  }

  // async functions alway return a promise even 
  // if you do not return
  async findPokemon():Promise<any>{
    this.pokemon = await this.pokesearch.getPokemon(this.pokeName)  
  }

}
