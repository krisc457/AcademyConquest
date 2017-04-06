var stompClient = null;

function setConnected(connected) {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
    if (connected) {
        $("#conversation").show();
    }
    else {
        $("#conversation").hide();
    }
    $("#greetings").html("");
}

$(document).ready(function(){
    var socket = new SockJS('/gs-guide-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/gameRoom', function (greeting) {
            updateGame(
                JSON.parse(greeting.body).content,
                JSON.parse(greeting.body).namesOfAttackRegions,
                JSON.parse(greeting.body).idsForAdjacentRegions,
                JSON.parse(greeting.body).majorNationTurn
            );
        });
    });
});

/*
 function disconnect() {
 if (stompClient != null) {
 stompClient.disconnect();
 }
 setConnected(false);
 console.log("Disconnected");
 }
 */

/*
 function sendGameTurnData() {
 stompClient.send("/app/endTurn", {}, JSON.stringify({'name': $("#name").val()}));
 }
 */

function updateGame(currentLand, namesOfAttackRegions, idsForAdjacentRegions, majorNationTurn) {
    var currentLand = currentLand.split("!1");
    var namesOfAttackRegions = namesOfAttackRegions.split("!2");
    var idsForAdjacentRegions = idsForAdjacentRegions.split("!3");
    var majorNationTurn = majorNationTurn;
    var chosenRegion = idsForAdjacentRegions[idsForAdjacentRegions.length-1];

    $("#CountryName").html(currentLand[0]);
    $("#CountryValues").html(currentLand[1]);

    $(".adjacent").removeClass("adjacent");
    $(".chosen").removeClass("chosen");
    $(".others").removeClass("others");
    for(var i=1; i<idsForAdjacentRegions.length-1; i++){
        $("#" + idsForAdjacentRegions[i] + " > g > a > path").addClass("adjacent");
    }


    $("#" + chosenRegion + " > g > a > path").addClass("chosen");
    $("path:not(.adjacent):not(.chosen)").addClass("others");

    var attackRegionOutput = "";
    for (var i=1; i<namesOfAttackRegions.length; i++) {
        attackRegionOutput += "<button type='button' class='btn btn-default attackFrom' data-dismiss='modal' value='" + namesOfAttackRegions[i] + "'>" + namesOfAttackRegions[i] + "</button><br>";
    }
    $("#ifAttackIsPossible").append().html("<h4>Du kan attackera från:</h4>" + attackRegionOutput);
    $(".attackFrom").click(function () {
        stompClient.send("/app/attack", {}, JSON.stringify({'name': chosenRegion, "majorNationTurn": majorNationTurn}));

        switch (majorNationTurn) {
            case "Britain":
                $("#" + chosenRegion + " > g > a > path").removeClass();
                $("#" + chosenRegion + " > g > a > path").addClass("active purple");
                break;
            case "Germany":
                $("#" + chosenRegion + " > g > a > path").removeClass();
                $("#" + chosenRegion + " > g > a > path").addClass("active blue");
                break;
            case "France":
                $("#" + chosenRegion + " > g > a > path").removeClass();
                $("#" + chosenRegion + " > g > a > path").addClass("active green");
                break;
            case "Usa":
                $("#" + chosenRegion + " > g > a > path").removeClass();
                $("#" + chosenRegion + " > g > a > path").addClass("active teal");
                break;
            case "Japan":
                $("#" + chosenRegion + " > g > a > path").removeClass();
                $("#" + chosenRegion + " > g > a > path").addClass("active yellow");
                break;
            case "Russia":
                $("#" + chosenRegion + " > g > a > path").removeClass();
                $("#" + chosenRegion + " > g > a > path").addClass("active red");
                break;
        }
        $(".adjacent").removeClass("adjacent");
        $(".others").removeClass("others");
        $(".chosen").removeClass("chosen");
    });
}

























/*
<<<<<<< HEAD
 $(function () {
 $("form").on('submit', function (e) {
 e.preventDefault();
 });
 $( "#connect" ).click(function() { connect(); });
 $( "#disconnect" ).click(function() { disconnect(); });
 $( "#endTurn" ).click(function() { sendGameTurnData(); });
 });
=======
$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $( "#connect" ).click(function() { connect(); });
    $( "#disconnect" ).click(function() { disconnect(); });
    $( "#endTurn" ).click(function() { sendGameTurnData(); });
});
*/

/*
 function disconnect() {
 if (stompClient != null) {
 stompClient.disconnect();
 }
 setConnected(false);
 console.log("Disconnected");
 }
 */

/*
 function sendGameTurnData() {
 stompClient.send("/app/endTurn", {}, JSON.stringify({'name': $("#name").val()}));
 }
>>>>>>> 230f714ee0b39b6038e69b780d6b0a449db6f50a
 */