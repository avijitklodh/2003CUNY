
// JS does not have classes but it does inheritence

let animal = {
    species:"Proto Animal",
    makeSound: function(){
        console.log("Make a generic sound");
    },
    describeSelf: function(){
        console.log("I am an animal of species" + this.species);
    }
}

animal.describeSelf()
animal.makeSound()

let dog = {
    species : "Dog",
    makeSound : function(){
        console.log("Bark Bark")
    }
}
// in languages that do not have access modifiers
// underscores stating a function or variable are understood to be pseudo private

// dog inherits from animal
// animal is the proto type object
dog.__proto__ = animal;

//all objects have a proto property that points to a prototype object to inherit
// properties from

console.log(animal);
console.log(dog)

dog.describeSelf();
dog.makeSound(); // overridden method


// your object -> Object object -> null 
// your function -> Function object -> Object object -> null
// your array -> Array object -> Object object -> null

(function(){
    let a = 100;
    console.log("iife")
})()

function a(){

}
function b(){
    
}
function c(){
    a();
    b();
}