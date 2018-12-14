function displayMessage() {
    alert("Hello World!"); 
}

function fullname() {
    alert("Liam Muth") 
}


//#1 Create another function and button that will display your full name

//#2 What happens if you don’t put the semicolon at the end of a statement?

function counter() {
    for (let i = 0; i <= 10; i++) {
        document.write("the number is " + i + "</br>");
        document.write(i + "x" + i + "=" + i * i + "</br>");//do some math too! i+i..modify it to i*3
    }
}
function threetimes() {
    for (let i = -100; i <= 100; i++) {
        document.write( i + " * 3 = " + (i *3) + "</br>");
    }
}

//#3 Create another function and button that will do the 3 times table from -100 to 100

//#4 What does i++ do?

function helloName() {
    let y = window.prompt("please enter your name");
    let end = window.prompt("how many times?");

    for (let i = 0; i < end; i++) {
        document.write(i + " Hello " + y + "</br>");
    }
}

//#5 What does the "</br>" tag do?

function mathAdder() {

    let num1 = 1;

    while (num1 != 0) {
        num1 = parseInt(window.prompt("Please enter you first number (0 to exit)", "0"));
        //don't ask them for another number if they want to quit

        if (num1 != 0) {
            num2 = parseInt(window.prompt("Please enter your second number:", "0"));
            answer = num1 + num2;
            document.write(num1 + "+" + num2 + "=" + answer + "</br>");
        }
    }
}

function mathfunctions() {

    let num1 = 1;

    while (num1 != 0) {
        num1 = parseInt(window.prompt("Please enter you first number (0 to exit)", "0"));
        //don't ask them for another number if they want to quit

        if (num1 != 0) {
            num2 = parseInt(window.prompt("Please enter your second number:", "0"));
            add = num1 + num2;
            document.write(num1 + "+" + num2 + "=" + add + "</br>");
            subtract = num1 - num2;
            document.write(num1 + "-" + num2 + "=" + subtract + "</br>");
            multiply = num1 * num2;
            document.write(num1 + "*" + num2 + "=" + multiply + "</br>");
            divide = num1 / num2;
            document.write(num1 + "/" + num2 + "=" + divide + "</br>");
        }
    }
}

//#6 Add a new function that will show the numbers added, subtracted, multiplied, and divided

//#7 What does != mean?

//#8 Why are there 3 closing curly braces in a row at the end of the MathAdder function?

function rollTheDice() {

    let money = 100;

    let bet = 1000;
    // #10 Does it matter what value we give to bet here and why or why not?

    alert("Play til you lose it all");

    while (money >= 1) {
        //no betting more money than you have!
        //the line below will go forever...the if...break will
        //get you out of this infinite betting loop if you bet legally

        while (true) {
            pick = window.prompt("Please pit over 7(o) or under 7(u)", "u");

            bet = parseInt(window.prompt("Please bet", money));
            //#11 What does parseInt do?

            if (bet <= money && bet > 0) {
                break;
            }
            //#12 How would you say this in English?

            alert("Illegal Betting detected!");
        }

        let die1 = Math.floor(Math.random() * 6 + 1);
        //#13 What does Math.floor do?

        let die2 = Math.floor(Math.random() * 6 + 1);

        let total = die1 + die2;

        document.write("</br>You rolled " + die1 + " and " + die2 + " total = " + total);
        document.write("</br>You picked " + pick + " and rolled " + total);

        if ((pick == "u" && total < 7) || (pick == "o" && total > 7)) {
            money = money + bet;
            document.write(" You won! You now have $" + money);
        } else if (total == 7) {
            document.write(" 7 is a tie...no winner..keep your bet");
        } else {
            money = money - bet;
            //#16 Why are we subtracting their bet from their money here?

            document.write(" You Lost! You now have $" + money);
        }
    }
    alert("Thanks for giving me all of your money!");
    //#17 How do we know they lost all there money to our game here?

}
function rollFour() {

    let money = 100;

    let bet = 1000;
    // #10 Does it matter what value we give to bet here and why or why not?

    alert("Play til you lose it all");

    while (money >= 1) {
        //no betting more money than you have!
        //the line below will go forever...the if...break will
        //get you out of this infinite betting loop if you bet legally

        while (true) {
            pick = window.prompt("Please pit over 14(o) or under 14(u)", "u");

            bet = parseInt(window.prompt("Please bet", money));
            //#11 What does parseInt do?

            if (bet <= money && bet > 0) {
                break;
            }
            //#12 How would you say this in English?

            alert("Illegal Betting detected!");
        }

        let die1 = Math.floor(Math.random() * 6 + 1);
        

        let die2 = Math.floor(Math.random() * 6 + 1);

        let die3 = Math.floor(Math.random() * 6 + 1);

        let die4 = Math.floor(Math.random() * 6 + 1);

        let total = die1 + die2 + die3 + die4;

        document.write("</br>You rolled " + die1 + ", " + die2 + ", " + die3 + " and " + die4 + " total = " + total);
        document.write("</br>You picked " + pick + " and rolled " + total);

        if ((pick == "u" && total < 14) || (pick == "o" && total > 14)) {
            money = money + bet;
            document.write(" You won! You now have $" + money);
        } else if (total == 14) {
            document.write(" 7 is a tie...no winner..keep your bet");
        } else {
            money = money - bet;
            

            document.write(" You Lost! You now have $" + money);
        }
    }
    alert("Thanks for giving me all of your money!");
    

}

//#14 What does || mean? 

//#15 What does && mean?


//#9 Make a game with 4 dice and below 14 or over 14 for the betting