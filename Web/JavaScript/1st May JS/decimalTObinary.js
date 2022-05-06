// WAP To find the binary of a decimal number

function decimalToBinary(dec) {
    let binaryNum = 0;
    let power = 1;
    while(dec != 0) {
        let rem = dec % 2;
        dec = Math.floor(dec / 2);           //IMPORTANT-> we used math.floor here because this is javaScript and here when we do 3/2 it'll give 1.5 it wont give 1 love java so to make it 1 like java we used math.floor or else agar math.floor nahi karte and point wala answer rhne dete tho hame kabhi answer hi nahi milta and infinite would be printed
        binaryNum = binaryNum + rem * power;
        
        power *= 10;
    }
    return binaryNum;
}


let binaryNumber = decimalToBinary(13);
console.log(binaryNumber);