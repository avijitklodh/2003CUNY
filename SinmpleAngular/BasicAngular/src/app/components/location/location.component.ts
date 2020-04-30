import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-location',
  templateUrl: './location.component.html',
  styleUrls: ['./location.component.css']
})
export class LocationComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

 public  function   (n, interval):Number[] {
    var people = [],
        deaths = [];
    for (var i = 0; i < n; i += 1) {
        people[i] = i;
    }

    var idx = 0,
        len = people.length;
    while (len = people.length) {
        idx = (idx + interval) % len;
        deaths.push(people[idx]);
        people.splice(idx, 1);
    }

    return deaths;
}

}

