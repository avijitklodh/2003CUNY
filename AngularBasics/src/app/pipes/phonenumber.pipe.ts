import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'phonenumber'
})
export class PhonenumberPipe implements PipeTransform {

  //pipes always take in at least one input always gives out an output
  transform(phonenumber:number): string {

    //a method to take in a phone number and return it with the dashes
    // 5555555555 555-555-5555
    const base:string = phonenumber.toString()
    return `${base.slice(0,3)}-${base.slice(3,6)}-${base.slice(6)}`

  }

}
