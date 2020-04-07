
// js types
// There are 6 primitives

// boolean
// string
// number 
// null  explicit value that means empty that the programer must assign to a variable
// undefined default value of everything in JS. You as the programmer
// should never use undefined

// symbol (I will not be covering)

// let x;
// let y = null; // explicity given in code

// function hi(){
//     console.log("Hi")
//     // even with no return all functions return undefined by default
// }
// let result = hi();
// console.log(result);

// JS has VERY AGGRESSIVE TYPE COERCION
// if two variables are of differnt types JS will find a way to make it work

console.log( "20"+true + "Hello")

// truthy vs falsy values
// falsy values are values that when turned into booleans by type coercion are false

// the falsy values

// Values that imply empty or non-existence
// "" empty string
// 0 the number 0
// null
// undefined
// NaN not a number
// false boolean false

// == performs type coercion
console.log("20" == 20)// true
// === does strict equality. Where both the type and the value must be the same
console.log("20" === 20)// false

let name = "adam";
