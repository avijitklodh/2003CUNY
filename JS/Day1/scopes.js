// js has three scopes
// scopes in JS is defined using keyword as opposed to location

// creating function using the function keyword
function hello(){
    // let name = "Adam";
    name = "Adam";  
    // no keyword in front of a variable makes the variable global
    // global variables and methods are very easy to pollute your namespace
    // avoid global variables if you can
    // global variables are attached to a special object called window
    // window is a global object anyone can access
    console.log("Hello everyone!!!" + name);
}

// call the function
// hello;
// console.log(name);

// DONT USER VAR
function hola(){
    // var is function scope meaning that a var variable is accessible ANYWHERE
    // in the function
    // var variables are accessible ANYTIME
    // JS when it executes a function. BEFORE actually execting the code
    // It allocates memory for all variables
    // the default value of every variable is "undefined"

    // this behavior is called hoisting. Variable declarations are "hoisted" to the top
    // of the function. Please do not do this.
    console.log("hola " + nombre);    // prints undefined
    var nombre = "John";

}
hola();

function bonjur(){
    const greeting = "Bonjur "; // const has the same exact rules as let
    // However you cannot change a const value
    // let CAN NOT be hoisted
    // let is block scoped as opposed to function scope
    // {let nomme = "Jacque";} // this won't work

    let nomme = "Jacque";
    console.log(greeting + nomme);
}

bonjur();
// console.log(nomme); // nomme does not exist globally :)