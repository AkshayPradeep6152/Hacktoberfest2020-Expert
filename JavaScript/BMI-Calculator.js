var weight= prompt("Enter your weight in kilograms");
var height= prompt("Enter your height in metres");
function bmiCalculator(weight,height){
  var bmi=weight/(height*height);
  return Math.round(bmi);
}
alert(bmi);
