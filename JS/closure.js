// a closure is a function that has a variable within it
// this variable is specific for that function
// FUNCTIONS ARE OBJECT
// your functions can return functions

// function factory

function customGreeting(name = "McDefaultFace"){ // returns a function

    const greeting = "Hello"
    let counter = 0; // enclosed variable in the innerfunction
    // the returned function always has access to variables that it used
    return function(){
        console.log(greeting + name)
        console.log(++counter)
    }

}

let adamGreeting = customGreeting("Adam"); // returns a NEW function object
let steveGreet = customGreeting("Steve");

// there are 2 counter variables in memory
steveGreet()
adamGreeting()
steveGreet()


function encapsulate(value){

    let value2 = value;
    return {
        getter: function(){
            return value2;
        },
        setter: function(num){
            if(num <0){
                return
            }else{
                value2 = num;
            }            
        }       
    };

}

let obj = encapsulate(100)
console.log(obj.getter());
obj.setter(50)
console.log(obj.getter())
obj.setter(-20)
console.log(obj.getter())