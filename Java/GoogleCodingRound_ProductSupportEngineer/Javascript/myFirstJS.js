alert("Am here!!!! jai ganesh!!!");
console.log("Am here!!!! jai ganesh!!!");

let _name = 'Kartik';
let age = 28;
let _age = '27';
//age = age + _age;
console.log(age == _age);
//age = "No age provided";

let myDetails = { // here myDetails is known as object. 

    myname: _name,
    myage: age,
};

//alert('Mydetails : ${myDetails.myname} and age is '+myDetails.myage);

let strTest = ["test", '123'];

//strTest.forEach(element => {
//  alert(element);
//});

document.body.style.background = 'red';

document.getElementById("p").innerText = document.getElementById("p").innerText + " Kartik";

let imageContainer = document.getElementById('AddimageHere');

let getImage = document.createElement("img");

 getImage.src = "image8-2.webp";
getImage.height = 200;
getImage.width = 200;

imageContainer.append(getImage);