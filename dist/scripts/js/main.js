document.addEventListener('DOMContentLoaded', ()=>{

    const squares = document.querySelectorAll(".container div");
    const playerDisplay = document.querySelector("#player");
    let currentPlayer = 'playerX';
    var GAME_STATE = new Array("i","i","i","i","i","i","i","i","i");
    var WINNINGS = [
        [0, 1, 2],
        [3, 4, 5],
        [6, 7, 8],
        [0, 3, 6],
        [1, 4, 7],
        [2, 5, 8],
        [0, 4, 8],
        [2, 4, 6]
      ];
    var message; 

    squares.forEach(square =>{
        square.addEventListener('click',clickOutcome);
        
    })

    function clickOutcome(e){
        const squareArray = Array.from(squares);
        const event = e.target;
        const index = squareArray.indexOf(event);
        playerDisplay.innerHTML = currentPlayer;
       

        if(GAME_STATE[index]=="i"){
            console.log(index);
            if(currentPlayer === "playerX"){
                squares[index].classList.add('playerX');
                GAME_STATE[index]="x"
                currentPlayer = 'playerO';
            }else{
                squares[index].classList.add('playerO');
                GAME_STATE[index]="o"
                currentPlayer = "playerX";
            }
            Verificar();
        }
    }
    function Verificar(){
        for(var i=0;i<WINNINGS.length;i++){
            const winCondition = WINNINGS[i] // Guarda la combinación por ejemplo: [0, 1, 2]
            let position1 = GAME_STATE[winCondition[0]],
                position2 = GAME_STATE[winCondition[1]],
                position3 = GAME_STATE[winCondition[2]] // Almacena el valor del estado actual del juego según las posiciones de winCondition

            if (position1 === '' || position2 === '' || position3 === '' || position1 == "i") {
                continue; // Si hay algún valor vacio nadie ha ganado aún
            }
            if (position1 === position2 && position2 === position3)   {
                document.getElementById("win").textContent="true"; // Si todas las posiciones coinciden entonces, dicho jugador ha ganado la partida
                break
            }
        }

    }
})




