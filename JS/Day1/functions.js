// Functions are OBJECTS!! functions are first class citizens
function sayHello(){    // this say hello is an object with CODE properties
    console.log("Hello");
}

sayHello(); // invokes the hidden 'executable code' property

// can't prevent you from doing this
sayHello.j = 1000;  // because this is an object

console.log(sayHello.j)

let add = function(num1, num2){ // this is a lamba a code object stored in the variable add
    return num1 + num2;
}

let sum = add(haa, 25); // no SAFETY check
let sum2 = add(7, 11);
let sum3 = add(); // JS does not check if the parameters exist
                    // and it still does something
console.log(sum);

let subtract = function(num1, num2){    // JS does have default parameters
    return num1 - num2;
}
let diff = subtract(50, 40);  // order doesn't m

// overloading does not in JS