$(document).ready(function() {
    console.log("doc ready history js");
});

function hgoHome() {
    window.location.href = "/";
}
function hgoConfirm() {
    // NEED LOGIC F ORDER IS EMPTY DONT
    // TRY TO ADD TO ORDER HISTORY-see AppController
    window.location.href = "/confirm";
}