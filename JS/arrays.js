// Arrays in JS can hold anything!!!
// They are dynamically sized

let sayHello = function(){
    console.log("Hello!!")
}
let ray = [2,"q",sayHello, {fname:"Adam",lname:"Ranieri"}, 35];
//console.log(ray[1])
ray[2]();
ray.push(30); // adds 30 to the end
ray.pop(); // removes last element
console.log(ray[3]['fname']);



