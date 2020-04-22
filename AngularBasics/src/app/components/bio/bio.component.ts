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

  name:string = "Adam";

  sayHello(): void {
    alert(`${this.name} says hello`)
  }

}
