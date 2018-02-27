var cstDrink=2.0;
var qtyLemon=0;
var cstLemon=0;
var qtyPink=0;
var cstPink=0;
var qtyLime=0;
var cstLime=0;
var cd = new Date();

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
function btnOrderNum () {
    var randNum = getOrderNum(9000,9999);
    // var onum = (cd.getFullYear()+(cd.getMonth()+1)+cd.getDate()+cd.getHours()+cd.getMinutes()+cd.getSeconds());
    // var onumMth = (cd.getMonth()).toLocaleString(undefined,{minimumIntegerDigits: 2});
    var onumHrs = (cd.getHours()).toLocaleString(undefined,{minimumIntegerDigits: 2});
    var onumMin = (cd.getMinutes()).toLocaleString(undefined,{minimumIntegerDigits: 2});
    var onumSec = (cd.getSeconds()).toLocaleString(undefined,{minimumIntegerDigits: 2});
    // $("#textArea").val($("#textArea").val()+$(this).data("num"));
    // $("#textArea").val($("#textArea").val() + onum);
    $("#pageFeedback").text(onumHrs+onumMin+onumSec+"-"+randNum)
}
function getOrderNum(min, max) {
    return Math.floor(Math.random() * (max - min + 1) ) + min;
}

