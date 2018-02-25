$(document).ready(function(){

});

function goToShopping(){
    window.location.href = "/shopping";
}
function goToSummary() {

    if (($("#inputName").val()) == "") {
        $("#pageFeedback").text("Enter a Customer Name!");
    } else {
        var cnam = $("#inputName").val();
        // window.location.href = "/summary";
        // send customer name to server, then go to summary page
        window.location.href = "/custname/" + cnam;
    }
}

