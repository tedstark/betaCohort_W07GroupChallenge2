var cstDrink=2.0;
var qtyLemon=0;
var cstLemon=0;
var qtyPink=0;
var cstPink=0;
var qtyLime=0;
var cstLime=0;
var totalQty= [];

$(document).ready(function(){
    init();
});

//Start the application
function init(){
    shoppingInit();
}
function goToHome() {
    window.location.href = "/";
}
function goToCust() {
    window.location.href = "/customer";
}
function goToHistory() {
    window.location.href = "/history";
}


