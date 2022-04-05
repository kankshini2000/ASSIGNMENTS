var secret=65;
var guess = "";
while(guess != secret){
     guess = prompt("Please guess a number(0-100): ")
    if( guess == secret){
       document.write("You've guessed the secret number!")
        break;
    }
    else if (guess > secret){
        document.write("Go lower!")
    }
    else{
        document.write("Go Higher!")
    }
}