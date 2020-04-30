import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'phonenumber'
})
export class PhonenumberPipe implements PipeTransform {
  transform(phonenumber: number): string {
    const base:string = phonenumber.toString()
    return `${base.slice(0,3)}-${base.slice(3,6)}-${base.slice(6)}`
  }
/*
  transform(phonenum: number): string {

    let val = phonenum.toString();
    let snum = "";  let x = 0;
    for (let i = 0; i < val.length; i++) {
    
      if (x == 2) {
        snum = snum + val[i] + "-";
        x = 0;
      }
      else {
     
        snum = snum + val[i];   x++;
      }
    }
    return snum
  }
*/
}
