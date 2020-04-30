import { Component, OnInit } from '@angular/core';
import { MyapiService } from 'src/app/services/myapi.service';
import { promise } from 'protractor';

@Component({
  selector: 'app-mypostapi',
  templateUrl: './mypostapi.component.html',
  styleUrls: ['./mypostapi.component.css']
})
export class MypostapiComponent implements OnInit {

  constructor(private postfinder: MyapiService) { }

  ngOnInit(): void {
  }
  id: string;
  posts: [];
  async getallposts(): Promise<any> {
    let rsult = await this.postfinder.getPosts();
    this.posts = rsult ;

    console.log(this.posts)
  }
}
