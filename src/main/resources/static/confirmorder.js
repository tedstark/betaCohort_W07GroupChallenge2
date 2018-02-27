$(document).ready(function(){
    confirmInit();
});

function confirmInit() {
    updateTotals()
}

function updateTotals() {
    var num1 = (2 * parseInt($("#txtQtyLemon").text()));
    var num2 = (2 * parseInt($("#txtQtyLime").text()));
    var num3 = (2 * parseInt($("#txtQtyPink").text()));

    console.log("num1: " + num1 + "num2: " + num2 + "num3: " + num3);
    $("#txtCstLemon").text("Cost: $" + num1);
    $("#txtCstLime").text("Cost: $" + num2);
    $("#txtCstPink").text("Cost: $" + num3);
    $("#pageFeedback").text("Thank you for your order!");
}