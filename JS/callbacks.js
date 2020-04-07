// A callback is a function passed as a parameter to another function


let add = function(num1, num2){
    return num1 +num2;
}

// arrow notation
// the same as using function except you cannot us the this keyword in an arrow function
let subtract = (num1, num2)=>{
    return num1 - num2
}
                                // operation is the callback function
    function calculate(num1,num2, operation){ // calculate is the higher order function
        return operation(num1,num2)
}
                            // I am not invoking add!!!
                            // I am passing in the function object for it to be invoked
                            // later in the higher order function
//let result = calculate(40,25,subtract);

let print = (thing) =>{console.log(thing)};

let ray = ["Zelda", "King K Rool", "Samus", "Dark Pit"];

// imperatiave/ procedural programming approache
for(character of ray){
    print(character)
}

function applyToAll(array, callback){
    for(thing of array){
        callback(thing)
    }
}

let coolGreeting = (thing) =>{console.log("The character "+ thing + " has joined the fight!")}
applyToAll(ray,coolGreeting);

// functional approach print is the call back
ray.forEach(print);

let numray = [10,20,30,40,50,60,70,80];
// let isUnder50 = (number) =>{   
//     if(number < 50)
//         return true;
//     else
//         return false;
// }

// function factory
let numFilter = (filterNum)=>{

    return (element) =>{   
            if(element < filterNum )
                return true;
            else
                return false;
        }
}

// console.log(isUnder50(60))

// let under25 = numFilter(25);
// console.log(under25(190))

let filtered = numray.filter(numFilter(44));

console.log(filtered)

let messyray = ["James", "Steven", 8, "michelle", null, 2]; 

let isString = (element) =>{

    if( typeof element === "string")
        return true;
    else
        return false;
}

// let isNumber = (element) =>{
//     return typeof element === "number";
// }

let numbers = messyray.filter((element) =>  typeof element === "number");

console.log(numbers)

// let hello = function(){
//     let name = "adam";
//     console.log("Hello " + name)
    
// }
// hello()
