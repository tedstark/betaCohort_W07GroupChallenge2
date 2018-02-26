var cstDrink=2.0;
var qtyLemon=0;
var cstLemon=0;
var qtyPink=0;
var cstPink=0;
var qtyLime=0;
var cstLime=0;
var custName = "";
var custAdd1 = "";
var custAdd2 = "";
var custPayType = "";
var custCCNum = 0;
var shoppingCart= [0][0];

$(document).ready(function(){

});

function goToHome() {
    window.location.href = "/";
}
function goToShopping(){
    updateTotals();
    window.location.href = "/shopping";
}
function goToCust() {
    updateTotals();
    window.location.href = "/cust";
}
function goToSummary() {
    window.location.href = "/summary";
}
function goToHistory() {
    window.location.href = "/history";
}


