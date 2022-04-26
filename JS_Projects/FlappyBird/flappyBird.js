var hole = document.getElementById('hole');
var block = document.getElementById('block');
var game = document.getElementById('game');
var bird = document.getElementById('bird');
var result = document.getElementById('result');
var text = document.getElementById('text');
var start = document.getElementById('startGame');



start.addEventListener('click',startGame);
// startGame();

function startGame(){
    var jumping = 0;
    var score = 0;
    var animationSettings = 'block linear infinite 2s';
    block.style.animation = animationSettings;
    hole.style.animation = animationSettings;
    start.style.visibility = 'hidden';

    hole.addEventListener('animationiteration' , RanHole);// Need reference  

    function RanHole(){
        var random =  -((Math.random()*350)+150);
        hole.style.top = random+'px';
        score++;
    }

    var interval = setInterval(function(){
        var birdPosition = parseInt(window.getComputedStyle(bird).getPropertyValue('top'));
        console.log('In fall');
        if(jumping == 0){
            bird.style.top = (birdPosition+4) +'px';
        }
        var holeTop = parseInt(window.getComputedStyle(hole).getPropertyValue('top'));
        var holeLeft = parseInt(window.getComputedStyle(hole).getPropertyValue('left'));
        console.log(`BirdPos: ${birdPosition +150} HoleTop: ${holeTop}`);
        if( birdPosition > -200 || (holeLeft < 50 && (birdPosition +150 < holeTop || birdPosition+150 > holeTop+100))){
            result.style.display = 'block';
            text.innerText = `Your final score is ${score}`;
            game.style.display = 'none';
            clearInterval(interval);
        }

    },15);

    window.addEventListener('keydown', hop);

    function hop(){
        jumping = 1 ;
        var birdPosition = parseInt(window.getComputedStyle(bird).getPropertyValue('top'));
        if(birdPosition > -590){
            bird.style.top = (birdPosition - 60)+'px';
        }
        setTimeout( ()=>{
            jumping = 0;
        }, 100);
    }
}
