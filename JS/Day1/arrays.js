// Arrays in JS can hold anything!!
// They are dynamically sized

let sayHello = function(){console.log("Say hello")}
let ray = [2, "q", sayHello, {fname:"Adam",lname:"Ranieri"},35]
//console.log(ray)
ray[2]();   // () means invokes it
ray.push(30);
ray.pop();

