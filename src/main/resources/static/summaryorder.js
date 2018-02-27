$(document).ready(function(){

});

function sumConfirm(){
    var randNum = getOrderNum(9000,9999);
    var onumHrs = (cd.getHours()).toLocaleString(undefined,{minimumIntegerDigits: 2});
    var onumMin = (cd.getMinutes()).toLocaleString(undefined,{minimumIntegerDigits: 2});
    var onumSec = (cd.getSeconds()).toLocaleString(undefined,{minimumIntegerDigits: 2});
    var cnam = ($("#txtCustName").text());
    var ordNum = (onumHrs+onumMin+onumSec+"-"+randNum);
    // console.log("inside sumConfirm button cnam=" + cnam);
    window.location.href = "/orderconfirm/" + cnam + "/" + ordNum;
}
function getOrderNum(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}