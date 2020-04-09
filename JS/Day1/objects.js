// Objects are just collection of KEY VALUE pairs
// You can create them without a class
// You can edit them at anytime

// this is an object literal
let adam = {
    name: "Adam Ranieri",   // these variables are attached to the same obejct
    prefession: "Trainer",  // they are not global
    age: 19, // these are called properties of the object

    sayHello: function(){   // this function is now a method
        // a method is a function attached to an object
        console.log("Hello, my name is " + this.name);  // THIS refers to the object
    }
}
// console.log(adam);
// console.log(adam.name);    // access property via dot operator
// console.log(adam["prefession"]) // access property via name

// for(property in adam){  // loop through properties
//     console.log(property)
// }

// adam.name = "Marcus"
// adam.location = "New York"
// console.log(adam)
adam.sayHello()

// window.alert    equals      alert       equals      this.alert
