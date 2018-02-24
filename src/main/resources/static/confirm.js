$(document).ready(function() {
    console.log("doc ready confirm js");
});

function cconfirmOrder() {
    var cnam = ($("#custName").val());

    // get values from the screen and total them up
    var iTotQty = 0;
    var iTotCst = 0.0;

    var cost1 = (parseInt($("#Qty1").val()) * parseFloat($("#Cst1").data("p1")));
    var cost2 = (parseInt($("#Qty2").val()) * parseFloat($("#Cst2").data("p2")));
    var cost3 = (parseInt($("#Qty3").val()) * parseFloat($("#Cst3").data("p3")));

    iTotQty = (parseInt($("#Qty1").val()) + parseInt($("#Qty2").val()) + parseInt($("#Qty3").val()));
    iTotCst = (cost1 + cost2 + cost3);

    tqty = iTotQty;
    tcst = iTotCst;

    // add an order date
    var cd = new Date();
    odte = (cd.getFullYear() + '-' + (cd.getMonth()+1) + '-' + cd.getDate());
    // add a unique order number using date,hours,minutes,seconds
    onum = (cd.getFullYear()+(cd.getMonth()+1)+cd.getDate()+cd.getHours()+cd.getMinutes()+cd.getSeconds());

    // send fields to add order to order history
    sendToServer(odte,onum,cnam,tqty,tcst);
}
function sendToServer(odte,onum,cnam,tqty,tcst) {
    window.location.href = "/order/"+odte+"/"+onum+"/"+cnam+"/"+tqty+"/"+tcst;
}