import { Component, OnInit, Input } from '@angular/core';
 
 
@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  constructor() { }

@Input() name:string= "Wael Dawoud" ;
@Input() phone:number = 9292897484;
  ngOnInit(): void {
 
  }

}
