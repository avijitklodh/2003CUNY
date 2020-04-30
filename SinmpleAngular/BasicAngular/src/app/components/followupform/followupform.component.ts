import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-followupform',
  templateUrl: './followupform.component.html',
  styleUrls: ['./followupform.component.css']
})
export class FollowupformComponent implements OnInit {

  constructor() { }
  name: string;
  email: string;
  phonenumber: string;
  ngOnInit(): void {
  }
    submitform(): void {
    alert("you submitted " + this.name + " "+this.name+" "+this.phonenumber);
  }
}
