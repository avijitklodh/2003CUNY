import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-followupform',
  templateUrl: './followupform.component.html',
  styleUrls: ['./followupform.component.css']
})
export class FollowupformComponent implements OnInit {

  constructor() { }

  name:string;
  email:string;
  phonenumber:string;

  ngOnInit(): void {
  }

  submitForm():void{
    alert(`congrats ${this.name} you succesfully submitted your form`)
    this.name = "";
    this.email = "";
    this.phonenumber ="";
  }
  

}
