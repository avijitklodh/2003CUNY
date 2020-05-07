import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Associate } from '../models/assoicate';

@Injectable({
  providedIn: 'root'
})
export class AssociatesearchService {

  constructor(private http:HttpClient) { }


  getAssociate():Promise<Associate>{
    let result:Promise<Associate> = this.http.get<Associate>("https://virtserver.swaggerhub.com/adamranieri/RPAS_API/1/associates/101").toPromise();
    return result;
  }
}
