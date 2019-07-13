window.onload = function(){
    
        console.log("fibonacci: " + fibonacci(0));
        console.log("fibonacci: " + fibonacci(1));
        console.log("fibonacci: " + fibonacci(55));


        console.log("bubbleSort: " + bubbleSort([2,4,5,1,3,1]));


        console.log("factorial: " + factorial(0));
        console.log("factorial: " + factorial(1));
        console.log("factorial: " + factorial(6));

        console.log("rotateLeft: " + rotateLeft([1,2,3,4,5],1));
        console.log("rotateLeft: " + rotateLeft([1,2,3,4,5],6));
        console.log("rotateLeft: " + rotateLeft([1,2,3,4,5],3));

        console.log("isBracket: () \t\t" + isBracket("()"));
        console.log("isBracket: ()()\t\t" + isBracket("()()"));
        console.log("isBracket: (())\t\t" + isBracket("(())"));
        console.log("isBracket: ({[]})\t" + isBracket("({[]})"));


}



function fibonacci(fibNumber){

    if(fibNumber == 0){
        return 0;
    }
    else if(fibNumber == 1){
        return 1;
    }
    else{
        return (fibNumber - 1) + (fibNumber - 2);
    }
}




function bubbleSort(Array){
   for(let i= 0; i< Array.length;i++){
        for(let j= 0; j< Array.length - 1;j++){
            if(Array[j]>Array[j+1]){
                let placeHolder = Array[j+1];
                Array[j+1] = Array[j];
                Array[j] = placeHolder;
            }
        }
   }
    
    return Array;
}




function factorial(fact){
    if(fact <= 1){
        return 1;
    }
    return fact * factorial(fact-1);
}




function rotateLeft(left, shift){
    for(let i = 0; i<shift;i++){
       let placeHolder = left[0];
       for(let j = 0; j<left.length-1;j++){
            left[j] = left[j+1];
            
       }
       left[left.length-1] = placeHolder;
    }
    return left;
}



function isBracket(str){


    bracket = false;
    x = 0;
    y = str.length-1;
    opposite = "f";


    while(x <= y){
        switch(str.charAt(x)) {
            case "{":
                opposite = "}";
              break;
            case "[":
                opposite = "]";
              break;
            case "(":
                opposite = ")";
              break;
            default:
              return false;
          }
          if(str.charAt(y) == opposite){
            bracket = true
          }
          else{
            bracket = false;
            break;
          }
          x++;
          y--;
    }
    return bracket;
}




    
