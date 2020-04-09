document.getElementById("greetbtn").addEventListener("click",welcome);

function welcome(){

    let nameinput = document.getElementById("nameinput"); // returns an element
    let name = nameinput.value;

    let greetingelem = document.getElementById("greeting");
    // string literals allows for variable interpolation
    greetingelem.innerHTML = `Welcome ${name}`;
}