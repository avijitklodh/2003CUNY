document.getElementById("greetbtn").addEventListener("click",welcome)


function welcome(){
    let nameinput = document.getElementById("nameinput") // return an element
    let name = nameinput.value

    let greetingelem = document.getElementById("greeting")
    // greetingelem.innerHTML = "Welcome " + name
    // string literals allows for variable interpolation
    greeting.innerHTML = `Welcome ${name}`
}