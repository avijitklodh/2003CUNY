import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MyapiService {

  constructor(private http: HttpClient) { }
 
 //http://localhost:8080/ExpenseReimbursement/ReimbursementServ/login?username=admin&password=123
  getPosts(): Promise<any> {
    let pokepromise: Promise<any> = this.http.get("https://jsonplaceholder.typicode.com/posts").toPromise();

    return pokepromise;
  }
}

