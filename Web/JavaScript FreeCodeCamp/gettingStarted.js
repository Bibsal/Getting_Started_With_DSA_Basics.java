// console.log("JavaScript prints from top to bottom & from left to right");
console.log("Tu Hi Nirankar,\nMai Teri Saranha,\nMai Nu Bakshlo.");

// JavaScript is a dynamically typed language, while Java is a static typed language.
// It means ki JavaScript bolta hai ki ak variable declared hai, now you can input or assign any type of value to it, like let a = bishal, a = 10, so dono bishal and 10 same variable ko de skte hai, whereas 
// Java ye bolta hai ki ak variable, eiis type ka declared hai, due to which you need to create separate variables for separate data type, you can't write int a = "bishal", because bishal is not an integer data type
// JavaScript me by default, variables k andar 'undefined' store rhta hai


let a;
a = 10;       // integer

a = 10.1;     // float

a = true;     // boolean

a = "hello, I am a string with double quotes and I can also be written inside single quotes like below";    // String
a = 'this is also string, character data type nahi hota javascript me';

a = null;

console.log(a);                        // now since last updated/assigned value of a was null, so here null will be printed.

// ----------------------------------------------------------------------------------------------
let endNum = 20;
// You are given an endNum
// check from 1 to that endNum(20)
// if num is multiple of 3 -> Print : Fizz 
// if num is multiple of 5 -> Print : Fizz 
// if num is multiple of both 3 & 5 -> Print : FizzBuzz
// if non of these -> number itself

for(let i = 1; i <= 20; i++) {
    if(i % 3 == 0 && i % 5 == 0) {
        console.log("FizzBuzz");
    } else if(i % 3 == 0) {
        console.log("Fizz");
    } else if(i % 5 == 0){
        console.log("Buzz");
    } else {
        console.log(i);
    }
}

console.log("------------------------------------------------------------------------------------");
// ----------------------------------------------------------------------------------------------
let arr = ["Bishal", "Bibek"]
console.log(arr);
console.log("------------------------------------------------------------------------------------");
arr.push("Keshri");              // push is used to add element to the last in the array
console.log(arr);
console.log("------------------------------------------------------------------------------------");
arr.pop();                       // pop is used to remove element from the last in the array
console.log(arr);





console.log("------------------------------------------------------------------------------------");
console.log(arr);
console.log("------------------------------------------------------------------------------------");
arr.unshift("Keshri");              // unshift is used to add element to the starting of the array
console.log(arr);
console.log("------------------------------------------------------------------------------------");
arr.shift();                       // shift is used to remove element from the starting of the array
console.log(arr);


console.log("----------------------------------------------------");
// Write a javascript program to compute the union of two arrays. 
// Input array will only have unique elements
// Sample Input :- arr1 = [1, 2, 3];
// arr 2 = [100, 2, 1, 10];
// Output :- [1, 2, 3, 100, 10];

let arr1 = [1, 2, 3];
let arr2 = [100, 2, 1, 10];
for(let i = 0; i < arr1.length; i++) {
    let elementToPut = arr1[i];
    let isPresent = false;
    for(let j = 0; j < arr2.length; j++) {
        if(elementToPut == arr2[j]) {
            isPresent = true;
        }
    }
    if(isPresent == false) {
        arr2.push(elementToPut);
    }
console.log(arr2);
console.log("------------------------------------------");
