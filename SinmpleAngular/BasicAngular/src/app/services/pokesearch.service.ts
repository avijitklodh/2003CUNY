import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
@Injectable({
  providedIn: 'root'
})
export class PokesearchService {

  constructor(private http: HttpClient) { }
  //https://pokeapi.co/api/v2/pokemon/ditto/
  getPokemon(pok:string): Promise<any> {
    let pokepromise: Promise<any> = this.http.get("https://pokeapi.co/api/v2/pokemon/"+pok).toPromise();

    return pokepromise;
  }
}
