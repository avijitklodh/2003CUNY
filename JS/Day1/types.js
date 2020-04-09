// JS typs
// There are 6 primitives:

// boolean
// string
// number
// null         - explicit value that means empty that the programmer must assign to a variable
// undefined    - default value of everything in JS. You as the programmer
// SHOULD NEVER use undefined

// symbol(I will not be covering)

let x;  // undefined
let y = null;   // explicitly given in code

function hi(){
    console.log("hi");
    // even with no return all functions return undefined by default
}
let result = hi()
console.log(result)


// JS has VERY AGGRESSIVE TYPE COERCION
// if two variables are of different type JS will find a way to mae it work
console.log(true*false + "20" - (9-5))

// truthy vs falsy values
// falsy values are values that when turned into booleans by type coercion are false

console.log(Boolean(-10))   // true
let xx = "g"/true
console.log(xx)
console.log(Boolean(xx))
console.log(Boolean(""))

console.log(2 == [1, 1])

// the falsy values

// Values that imply empty or non-existence
// "" empty string
// 0 the number 0
// null
// undefined
// [] empty array
// Nan not a number
// false boolean false

// == performs type coercion

console.log("20" == 20) // true
// === does strict equality. Where both the type and then value must be the same
console.log("20" === 20)    // false

// --------- Triple alwasy unless you have good reasons

// "k". 
// 10.5. 
// function object -> object object -> null
