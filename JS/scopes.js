// js has three scopes
// scopes in JS is defined using keywords as opposed to location
// creating a function using the function keyword
function hello(){
    name = "Adam"; 
    // no keyword in front of a variable makes the variable global
    // global variables and methods are very easy to pollute your namespace
    // avoid global variables if you can
    // global variables are attached to a special object called window
    // window is a global object anyone can access
    console.log("Hello " +name);
}

// var is function scope meaning that a var variable is accesible ANYWHERE in the function
// var variables are accessible ANYTIME
// JS when it executes a function. BEFORE actually executing the code
// It allocates memory for all variables
// the default value of every vaiable is undefined

// this behavior is called hoisting. Variable declarations are "hoisted" to the top
// of the function. Please do not do this
function hola(){
    {
        var nombre = "John";
    }
    
    console.log("hola " +nombre) // prints undefined

}
hola()

// let cannot be hoisted
// let is block scoped as opposed to function scope
function bonjur(){
    const greeting = "Bonjur " // const has the same exact rules as let
    // However you cannot change a const value
    {
        let nomme = "Jacque";
        
    }
      
    console.log(greeting+nomme)
}
bonjur()

// console.log(nomme) // nomme does not exist globally =)
