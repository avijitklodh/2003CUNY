// Make a car "class" in JS
// it should have a way to creat a car constructor
// each car should have a make, model and mileage
// the mileage variable is encapuslated such that you cannot set its value
// to less than 0
// the car has the method driver that takes in an amount of
// miles and adds it to mieage
 


function carClass(){

    return function(make, model, mileage){

        return {
            // val1:make,
            // val2:model,
            // val3:mileage,

            getMileage: function(){return mileage},

            addMileage: function(mile){
                if(mile < 0){
                    console.log("Can't add negative miles")
                    return
                }
                else{
                    mileage = mileage + mile
                }
            }
        }

    }

}

let makeCar = carClass()

let crosstrek = makeCar("Subaru", "Crosstrek", 1200)
let forrestor = makeCar("subaru", "Forrestor", 900)
console.log(crosstrek)
console.log(forrestor)

console.log("Access mileage directly using DOT: " + crosstrek.val3)
crosstrek.addMileage(-999)
crosstrek.addMileage(999)
console.log("Access mileage directly after using method addMileage: " + crosstrek.val3)

console.log("Access mileage using getter: " + crosstrek.getMileage)


function CarClass(){
    let amount = 0

    return function(make="", model = "", mileage = 0){
        ++amount
        make: make,
        model: model,
        mileage: mileage,

        getMileage: function(){
            return mileage
        },
        setMileage: function(miles){
            if(miles > 0)
            mileage = miles
        },
        drive: function(miles){

        }

    }
}