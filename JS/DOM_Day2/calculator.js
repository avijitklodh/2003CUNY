document.getElementById("addBtn").addEventListener("click", add)
document.getElementById("subBtn").addEventListener("click", subtract)
document.getElementById("mulBtn").addEventListener("click", multiply)
document.getElementById("divBtn").addEventListener("click", divide)

function add(){
    let val1 = +document.getElementById("val1").value
    let val2 = +document.getElementById("val2").value
    document.getElementById("val1").value = "";
    document.getElementById("val2").value = "";

    let resultelem = document.getElementById("result")
    let historyelem = document.getElementById("history")

    let result = val1 + val2

    resultelem.innerHTML = `Result: ${result}`
    historyelem.innerHTML = historyelem.innerHTML + `<li>${val1} + ${val2} = ${result}</li>`
}

function subtract(){
    let val1 = +document.getElementById("val1").value
    let val2 = +document.getElementById("val2").value
    document.getElementById("val1").value = "";
    document.getElementById("val2").value = "";

    let resultelem = document.getElementById("result")
    let historyelem = document.getElementById("history")

    let result = val1 - val2

    resultelem.innerHTML = `Result: ${result}`
    historyelem.innerHTML = historyelem.innerHTML + `<li>${val1} - ${val2} = ${result}</li>`
}

function multiply(){
    let val1 = +document.getElementById("val1").value
    let val2 = +document.getElementById("val2").value
    document.getElementById("val1").value = "";
    document.getElementById("val2").value = "";

    let resultelem = document.getElementById("result")
    let historyelem = document.getElementById("history")

    let result = val1 * val2

    resultelem.innerHTML = `Result: ${result}`
    historyelem.innerHTML = historyelem.innerHTML + `<li>${val1} * ${val2} = ${result}</li>`
}

function divide(){
    let val1 = +document.getElementById("val1").value
    let val2 = +document.getElementById("val2").value
    document.getElementById("val1").value = "";
    document.getElementById("val2").value = "";

    let resultelem = document.getElementById("result")
    let historyelem = document.getElementById("history")

    let result = val1 / val2

    resultelem.innerHTML = `Result: ${result}`
    historyelem.innerHTML = historyelem.innerHTML + `<li>${val1} / ${val2} = ${result}</li>`
}