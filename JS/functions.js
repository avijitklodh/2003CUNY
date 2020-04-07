// Functions are objects!!! functions are first class citizens
function sayHello(){ // this say hello is an object
    console.log("Hello")
}

sayHello.j = 1000; // you can attach properties to an object including functions becuase
// THEY ARE OBJECTS
sayHello() // invokes the hidden 'executable code' property
console.log(sayHello.j)

let add = function(num1,num2){ // this is a lambda a code object stored in the variable add
    return num1  +num2;
}

let sum = add(10,20);
console.log(sum);

let subtract = function(num1 = 0, num2 = 0){ // js does have default paramters
    return num1-num2;
} 
let diff = subtract(50);

console.log(diff)
// overloading does not in JS