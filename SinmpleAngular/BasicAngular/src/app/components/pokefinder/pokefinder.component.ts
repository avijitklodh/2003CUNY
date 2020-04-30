import { Component, OnInit } from '@angular/core';
import { PokesearchService } from 'src/app/services/pokesearch.service';

@Component({
  selector: 'app-pokefinder',
  templateUrl: './pokefinder.component.html',
  styleUrls: ['./pokefinder.component.css']
})
export class PokefinderComponent implements OnInit {

  constructor(private pokesearch: PokesearchService) { }
  pokename: string;
  pokemon: any;
  ngOnInit(): void {
  }
  async findpokemon(): Promise<any> {
    let result = await this.pokesearch.getPokemon(this.pokename);
    this.pokemon = result;
    console.log(  this.pokemon);
  }
}
