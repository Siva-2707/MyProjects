var blueCar = document.getElementById('blueCar');
var redCar = document.getElementById('redCar');
var result = document.getElementById("result");
var gameArea = document.getElementById('gameArea');
let score = 0;
blueCar.addEventListener('animationiteration',randomCar);


function randomCar(){
    let random = Math.round((Math.random()*2))*130;
    console.log(random);
    blueCar.style.left = random+ 'px';
    score++;
}

window.addEventListener('keydown', function(e){
    var redCarLeft = parseInt(this.window.getComputedStyle(redCar).getPropertyValue('left'));
    console.log(redCarLeft);
    // Condition to Move Right
    if(e.keyCode == '39' && redCarLeft < 260){ 
    redCar.style.left = (redCarLeft+ 130) +'px';
    }
    if(e.keyCode == '37' && redCarLeft > 0 ){ 
        redCar.style.left = (redCarLeft - 130) +'px';
    }
});

var validate = setInterval(()=>{
    var blueCarBottom = parseInt(this.window.getComputedStyle(blueCar).getPropertyValue('bottom'));
    var blueCarLeft = parseInt(this.window.getComputedStyle(blueCar).getPropertyValue('left'));
    var redCarLeft = parseInt(this.window.getComputedStyle(redCar).getPropertyValue('left'));
    if(blueCarBottom <=100 && blueCarLeft == redCarLeft){
        gameArea.style.visibility = 'hidden';
        var displayscore = document.getElementById('score');
        result.style.visibility = 'visible';
        displayscore.innerText = `Your score is : ${score}.` 
        clearInterval(validate);
    }
},10);
