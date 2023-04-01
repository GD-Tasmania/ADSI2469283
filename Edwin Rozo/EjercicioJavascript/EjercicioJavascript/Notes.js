const note1 = document.getElementById("number1")
const note2 = document.getElementById("number2")
const note3 = document.getElementById("number3")
const button = document.getElementById("button")
const result = document.getElementById("result")
const winner = document.getElementById("winner")
const recover = document.getElementById("recover")
const honors = document.getElementById("honors")

button.addEventListener("click",exercise)

function exercise(){
    let not1 = Number(note1.value)
    let not2 = Number(note2.value)
    let not3 = Number(note3.value)
    let definitive = (not1*0.3)+(not2*0.3)+(not3*0.4)
    result.textContent="Su nota es: "+definitive.toFixed(2)
}
note1.addEventListener("keyup", function (event) {
    let not1 = Number(note1.value)
    let not2 = Number(note2.value)
    let definitive = (not1*0.3)+(not2*0.3)
    if(not1>=0 && not1<=5 && not2>=0 && not2<=5){
        if((definitive+(5*0.4)) > 2){
            winner.textContent="Para ganar la materia necesita minimo: "+((3.5-definitive)/0.4).toFixed(2)
            honors.textContent="Para aprobar con honores necesita: "+((4.6-definitive)/0.4).toFixed(2)
            if(((2.1-definitive)/0.4).toFixed(2)>0){
                recover.textContent="Para ir a recuperacion necesita: "+((2.1-definitive)/0.4).toFixed(2)
            }
        }else{
            winner.textContent="Ya perdio la materia"
            recover.textContent=""
            honors.textContent=""
        }
    }else{
        winner.textContent="Ingrese notas validas"
        recover.textContent=""
        honors.textContent=""
    }
});
note2.addEventListener("keyup", function (event) {
    let not1 = Number(note1.value)
    let not2 = Number(note2.value)
    let definitive = (not1*0.3)+(not2*0.3)
    if(not1>=0 && not1<=5 && not2>=0 && not2<=5){
        if((definitive+(5*0.4)) > 2){
            winner.textContent="Para ganar la materia necesita minimo: "+((3.5-definitive)/0.4).toFixed(2)
            honors.textContent="Para aprobar con honores necesita: "+((4.6-definitive)/0.4).toFixed(2)
            if(((2.1-definitive)/0.4).toFixed(2)>0){
                recover.textContent="Para ir a recuperacion necesita: "+((2.1-definitive)/0.4).toFixed(2)
            }
        }else{
            winner.textContent="Ya perdio la materia"
            recover.textContent=""
            honors.textContent=""
        }
    }else{
        winner.textContent="Ingrese notas validas"
        recover.textContent=""
        honors.textContent=""
    }
});