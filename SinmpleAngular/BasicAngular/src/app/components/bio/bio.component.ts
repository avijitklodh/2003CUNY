import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-bio',
  templateUrl: './bio.component.html',
  styleUrls: ['./bio.component.css']
})
export class BioComponent implements OnInit {

  constructor() { }
  
  ngOnInit(): void {
  }
  username:string="admin";
public login(): void{
  alert(`${this.username} Logged in `)
}
}
