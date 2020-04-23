import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PokesearchService {
// dependency injection is when an onbject is created with the dependencies it needs to run
// a dependency is literrally any instance variable used in the class
// your Java services had dependencies for DAOs

// This angular service has a dependency of HttpClient becaue it needs httpclient to make
// requests
  constructor(private http:HttpClient) { }
 //  https://pokeapi.co/api/v2/pokemon/ditto/

 // currently of type so that this request could handle any JSON
  getPokemon(pokemon:string):Promise<any>{
    let pokepromise:Promise<any> = this.http.get(`https://pokeapi.co/api/v2/pokemon/${pokemon}/`).toPromise();
    return pokepromise;
  }

}
