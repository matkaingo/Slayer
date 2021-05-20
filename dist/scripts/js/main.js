document.addEventListener('DOMContentLoaded', ()=>{

    const squares = document.querySelectorAll(".container div");
    const playerDisplay = document.querySelector("#player");
    let currentPlayer = 'playerX';

    squares.forEach(square =>{
        square.addEventListener('click',clickOutcome);
    })

    function clickOutcome(e){
        
        const squareArray = Array.from(squares);
        const event = e.target;
        const index = squareArray.indexOf(event);
        playerDisplay.innerHTML = currentPlayer;

        
        console.log(index)

        if(currentPlayer === "playerX"){
            squares[index].classList.replace('playerX');
            currentPlayer = 'playerO';
        }else{
            squares[index].classList.replace('playerO');
            currentPlayer = "playerX";
        }
    }
})




