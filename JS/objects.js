// Objects are just collections of Key value pairs
// You can create them without a class
// you can edit them at any time

// this is an object literal
let adam = {
    name:"Adam Ranieri", // these variables are attached to the same object
    profession:"Trainer", // they are not global
    age:19,  // these are called properites of the object

    sayHello: function(){ // this function is now a method
            // a method is a function attached to an object
        console.log("Hello my name is " + this.name); // this refers to the object
    }
}

// console.log(adam)
// console.log(adam.name); // access property via dot operator
// console.log(adam["profession"]); // access property via name

// for(property in adam){ // for in loop in js for iterating over every property of an object
//     console.log(property)
// }

adam.sayHello()


window.alert("Hello 1") 
alert("Hello 2")
this.alert("Hello 3") // refers to window because I am not in a function or object