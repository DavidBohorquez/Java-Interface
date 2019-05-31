var totalTrains = 12;
var trainsOperational = 8;

var trainNumber = 1;

/*while(trainNumber <= trainsOperational) {
    console.log("Train #" +  trainNumber + " is running.");
    trainNumber++;
}

for(var stoppedTrain = trainsOperational + 1; stoppedTrain <= totalTrains; stoppedTrain++) {
    console.log("Train #" + stoppedTrain + " is not operational.");
}*/

for(trainNumber; trainNumber <= totalTrains; trainNumber++) {
    if(trainNumber <= trainsOperational) {
        console.log("Train #" +  trainNumber + " is running.");
        //alert("Train #" +  trainNumber + " is running.");
    }else {
        console.log("Train #" + trainNumber + " is not operational.");
        //alert("Train #" + trainNumber + " is not operational.");
    }
}

//var a = confirm();

//var b = prompt();

/*var nombre;

nombre = prompt("Digite su nombre");

alert(nombre);*/

function myFunction(a, b) {
    return a + b;
}

//(alert(myFunction(7,8));

alert(myFunction(parseInt(prompt("Digite un número")), parseInt(prompt("Digite otro número"))));



