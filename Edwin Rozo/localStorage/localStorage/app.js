const body = document.getElementById("body")
const inputText = document.createElement("textarea")
const buttonSave = document.createElement("button")
const searchTweet = document.createElement("button")
const amount = document.createElement("p")
const totalTweets = document.createElement("p")

inputText.setAttribute("placeholder","Ingrese el tweet")
inputText.setAttribute("maxlength","255")
totalTweets.classList.add("totalTweets")
inputText.classList.add("inputText")
buttonSave.textContent="Save tweet"
searchTweet.textContent="Search tweet"
amount.textContent=255
totalTweets.textContent="Twetts: "

let arrayTweet = []

inputText.addEventListener("keyup",()=>{
    let x = inputText.value
    amount.textContent=255-x.length
})

window.addEventListener("DOMContentLoaded",()=>{
    body.appendChild(inputText)
    body.appendChild(buttonSave)
    body.appendChild(searchTweet)
    body.appendChild(amount)
    body.appendChild(totalTweets)
    // localStorage.removeItem("tweets")

    let arrayRecojido = JSON.parse(localStorage.getItem("tweets"));
    arrayRecojido.map((i)=>{
        arrayTweet.push(i)
    })
})

buttonSave.addEventListener("click",()=>{
    let x = inputText.value
    arrayTweet.push(x)
    localStorage.setItem("tweets",JSON.stringify(arrayTweet))
    console.log(x);
})

searchTweet.addEventListener("click",()=>{
    let arrayRecojido = JSON.parse(localStorage.getItem("tweets"));
    console.log(arrayRecojido);
    let cont = 0
    totalTweets.textContent=""
    arrayRecojido.map((i)=>{
        console.log(i);
        totalTweets.textContent+="Tweet "+(cont+=1)+". "+i+"\n"
    })
})