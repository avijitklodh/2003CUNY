import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-staff',
  templateUrl: './staff.component.html',
  styleUrls: ['./staff.component.css']
})
export class StaffComponent implements OnInit {

  constructor() { }

  employeesVisible:boolean = false;
  btnLabel:string = "Show Employees";
  associates:Array<string> = ["Jaxon","Peter","Jackie","Art","Ian"];

  ngOnInit(): void {
  }

  showEmployees():void{
    this.employeesVisible = !this.employeesVisible;
    
    if(this.employeesVisible === true){
      this.btnLabel = "hide employees";
    }else{
      this.btnLabel = "Show employees";
    }
  }

}
