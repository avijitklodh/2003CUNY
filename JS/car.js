// Make a Car "Class" in JS
// it should have a way to create a car 1 constructor
// each car should have a make, model and mileage
// the mileage variable is encapuslated such that you cannot set its value
// to less than 0
// the car has the method driver that takes in an amount of miles and adds it to mileage


function CarClass(){

    let amount = 0;

    return function(make = "DefaultMake",model = "DefaultModel", mileage = 0){
        ++amount;
        return{
            make:make,
            model:model,
            amount: amount,
            getMileage: function(){
                return mileage
            },
            setMileage: function(miles){
                if(miles >0)
                    mileage = miles 
            },
            drive: function(miles){
                console.log("Driving the car")
                this.setMileage(miles +this.getMileage())
            }
            
        }
    }
}

let makeCar = CarClass();
let crosstrek = makeCar("Subaru", "Crosstrek", 1200);
let forrestor = makeCar("Subaru", "Forrestor", 900);
console.log(forrestor.getMileage())
forrestor.drive(200);
console.log(forrestor.getMileage());
forrestor.drive(-2000)
console.log(forrestor.getMileage());
console.log(forrestor.mileage);
