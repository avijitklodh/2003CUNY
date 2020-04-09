// a closure is a function that has a variabl within it
// this variable is specific for that function
// FUNCTIONS are OBJECTS
// your function can return functions


// function factory

function customGreeting(name = "mcDefaultFace"){    // returns a function

    const greeting = "Hello"
    let counter = 0;    // enclosed variable in the innerfunction
    // the return functions always has access to variable that it used

    return function(){
        console.log(greeting + name);
        console.log(++counter);
    }
}

let adamGreeting = customGreeting("Adam")
let steveGreeting = customGreeting("Steve")
// console.log(adamGreeting)

// there are 2 counter variables in memory
steveGreeting()
adamGreeting()
steveGreeting()
console.log(steveGreeting.counter)  // CANNOT access the variable outside

function encapsulate(value){

    return {
        
        getter: function(){
            return value;
        },

        setter: function(something){
            if(something < 0){
                return 
            }else{
                value = something
            }
        }

    }
}

// let getter = encapsulate("Michael")
// let name = getter();
let obj = encapsulate(100)
console.log(obj.getter())
obj.setter(50)
console.log(obj.getter())
obj.setter(-10)
console.log(obj.getter())
console.log(obj.value)