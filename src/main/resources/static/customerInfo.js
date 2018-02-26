$(document).ready(function(){

});

function goToSummary() {
    console.log("Click!")
    if (($("#inputName").val()) == "") {
        $("#pageFeedback").text("Enter a Customer Name!");
    } else {
        var cnam = $("#inputName").val();
        window.location.href = "/custname/" + cnam;
    }
}

