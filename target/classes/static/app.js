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
                JSON.parse(greeting.body).idsForAdjacentRegions
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
    stompClient.send("/app/makeMove", {}, JSON.stringify({'name': $("#name").val()}));
}
*/

function updateGame(currentLand, namesOfAttackRegions, idsForAdjacentRegions) {
    var currentLand = currentLand.split("!1");
    var namesOfAttackRegions = namesOfAttackRegions.split("!2");
    var idsForAdjacentRegions = idsForAdjacentRegions.split("!3");

<<<<<<< HEAD
    var info = message.split("!split")
    var regionInfoSplit = info[0].split("!1");
    var namesOfAttackRegionsSplit = info[1].split("!2");
    var adjacentRegionIdsSplit = info[2].split("!3");
    console.log(namesOfAttackRegionsSplit);

    $("#CountryName").html(regionInfoSplit[0]);
    $("#CountryValues").html(regionInfoSplit[1]);
=======
    $("#CountryName").html(currentLand[0]);
    $("#CountryValues").html(currentLand[1]);
>>>>>>> 8d7f43d064e9557398fb583bd1ef52d85327aecf

    $(".adjacent").removeClass("adjacent");
    $(".chosen").removeClass("chosen");
    $(".others").removeClass("others");
    for(var i=1; i<idsForAdjacentRegions.length-1; i++){
        $("#" + idsForAdjacentRegions[i] + " > g > a > path").addClass("adjacent");
    }
    $("#" + idsForAdjacentRegions[idsForAdjacentRegions.length-1] + " > g > a > path").addClass("chosen");
    $("path:not(.adjacent):not(.chosen)").addClass("others");

    var attackRegionOutput = "";
    for (var i=1; i<namesOfAttackRegions.length; i++) {
        attackRegionOutput +=  namesOfAttackRegions[i]+"<br>";
    }
    $("#ifAttackIsPossible").append().html("<h4>Du kan attackera från:</h4><p>" + attackRegionOutput + "</p>");
}

/*
$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $( "#connect" ).click(function() { connect(); });
    $( "#disconnect" ).click(function() { disconnect(); });
    $( "#endTurn" ).click(function() { sendGameTurnData(); });
});
*/