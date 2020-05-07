import { Component, OnInit } from '@angular/core';
import { AssociatesearchService } from 'src/app/services/associatesearch.service';

@Component({
  selector: 'app-associateviewer',
  templateUrl: './associateviewer.component.html',
  styleUrls: ['./associateviewer.component.css']
})
export class AssociateviewerComponent implements OnInit {

  constructor(private searchservice:AssociatesearchService) { }

  ngOnInit(): void {
  }

  async getAssociate():Promise<any>{

    let associate = await this.searchservice.getAssociate();
    
    console.log(associate);
  }

}
