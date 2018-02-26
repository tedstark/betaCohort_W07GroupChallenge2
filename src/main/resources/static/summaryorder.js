$(document).ready(function(){

});

function sumConfirm(){
    var cnam = ($("#txtCustName").text());
    console.log("inside sumConfirm button cnam=" + cnam);
    window.location.href = "/orderconfirm/" + cnam;
}


