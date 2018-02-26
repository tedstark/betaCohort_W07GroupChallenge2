$(document).ready(function(){
    shoppingInit();
});

function shoppingInit() {
    updateTotals()
}

function updateTotals() {
    $("#txtQtyLemon").text("Quantity in Cart: " + qtyLemon);
    $("#txtCstLemon").text("Cost in Cart: $" + cstLemon);
    $("#txtQtyLime").text("Quantity in Cart: " + qtyLime);
    $("#txtCstLime").text("Cost in Cart: $" + cstLime);
    $("#txtQtyPink").text("Quantity in Cart: " + qtyPink);
    $("#txtCstPink").text("Cost in Cart: $" + cstPink);
    $("#pageFeedback").text("");
}

function addLemon() {
    if (($("#inputLemon").val()) == "") {
        $("#pageFeedback").text("Enter a Quantity!");
    } else {
        numInput = parseInt($("#inputLemon").val());
        qtyLemon += numInput;
        // document.getElementById("inputFilled").val().clear()
        cstLemon = (qtyLemon*cstDrink).toFixed(2);
        updateTotals()
    }
}
function remLemon() {
    if (($("#inputLemon").val()) == "") {
        $("#pageFeedback").text("Enter a Quantity!");
    } else {
        var numFilled = parseFloat($("#inputLemon").val());
        if ((qtyLemon-numFilled) < 0) {
            $("#pageFeedback").text("Not that many in your cart!")
        } else {
            qtyLemon -= numFilled;
            // document.getElementById("txtQtyFilled").innerText = "Quantity in Cart: " + qtyFilled;
            cstLemon=(qtyLemon*cstDrink).toFixed(2);
            // document.getElementById("txtCstFilled").innerText = "Cost in Cart: $" + cstFilled;
            updateTotals()
        }
    }
}
function addLime() {
    if (($("#inputLime").val()) == "") {
        $("#pageFeedback").text("Enter a Quantity!");
    } else {
        numInput = parseInt($("#inputLime").val());
        qtyLime += numInput;
        cstLime = (qtyLime*cstDrink).toFixed(2);
        updateTotals()
    }
}
function remLime() {
    if (($("#inputLime").val()) == "") {
        $("#pageFeedback").text("Enter a Quantity!");
    } else {
        var numFilled = parseFloat($("#inputLime").val());
        if ((qtyLime-numFilled) < 0) {
            $("#pageFeedback").text("Not that many in your cart!")
        } else {
            qtyLime -= numFilled;
            cstLime=(qtyLime*cstDrink).toFixed(2);
            updateTotals()
        }
    }
}
function addPink() {
    if (($("#inputPink").val()) == "") {
        $("#pageFeedback").text("Enter a Quantity!");
    } else {
        numInput = parseInt($("#inputPink").val());
        qtyPink += numInput;
        cstPink = (qtyPink*cstDrink).toFixed(2);
        updateTotals()
    }
}
function remPink() {
    if (($("#inputPink").val()) == "") {
        $("#pageFeedback").text("Enter a Quantity!");
    } else {
        var numFilled = parseFloat($("#inputPink").val());
        if ((qtyPink-numFilled) < 0) {
            $("#pageFeedback").text("Not that many in your cart!")
        } else {
            qtyPink -= numFilled;
            cstPink=(qtyPink*cstDrink).toFixed(2);
            updateTotals()
        }
    }
}

function shoppingCust() {
    // send customer order to server
    var cd = new Date();
    var odte = (cd.getFullYear() + '-' + (cd.getMonth()+1) + '-' + cd.getDate());
    // add a unique order number using date,hours,minutes,seconds; Why is onum only four digits when passed to server?
    var onum = (cd.getFullYear()+(cd.getMonth()+1)+cd.getDate()+cd.getHours()+cd.getMinutes()+cd.getSeconds());
    var cnam = "CUSTOMER_NAME";
    var leqty = qtyLemon.toString();
    var liqty = qtyLime.toString();
    var piqty = qtyPink.toString();
    console.log("right before call to server");
    console.log("qtyLemon",qtyLemon,"qtyLime",qtyLime,"qtyPink",qtyPink);
    console.log("/order/"+odte+"/"+onum+"/"+cnam+"/"+leqty+"/"+liqty+"/"+piqty);
    window.location.href = "/order/"+odte+"/"+onum+"/"+cnam+"/"+leqty+"/"+liqty+"/"+piqty;
}