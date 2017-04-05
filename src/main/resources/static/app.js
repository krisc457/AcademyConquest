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
            updateGame(JSON.parse(greeting.body).content);
        });
    });
});

function disconnect() {
    if (stompClient != null) {
        stompClient.disconnect();
    }
    setConnected(false);
    console.log("Disconnected");
}

function sendGameTurnData() {
    stompClient.send("/app/endTurn", {}, JSON.stringify({'name': $("#name").val()}));
}

function updateGame(message) {
    // Vi splittar upp informationen för att kunna skriva värden på olika ställen.
    // Strängen message splittas med "!split" och "!1" och "!2" och "!3".

    var info = message.split("!split")
    var regionInfoSplit = info[0].split("!1");
    var namesOfAttackRegionsSplit = info[1].split("!2");
    var adjacentRegionIdsSplit = info[2].split("!3");


    $("#CountryName").html(regionInfoSplit[0]);
    $("#CountryValues").html(regionInfoSplit[1]);

    $(".adjacent").removeClass("adjacent");
    $(".chosen").removeClass("chosen");
    $(".others").removeClass("others");
    for(var i=1; i<adjacentRegionIdsSplit.length-1; i++){
        $("#" + adjacentRegionIdsSplit[i] + " > g > a > path").addClass("adjacent");
    }
    $("#" + adjacentRegionIdsSplit[adjacentRegionIdsSplit.length-1] + " > g > a > path").addClass("chosen");
    $("path:not(.adjacent):not(.chosen)").addClass("others");

    var abc = "";
    for (var i=1; i<namesOfAttackRegionsSplit.length; i++) {
        abc +=  namesOfAttackRegionsSplit[i]+"<br>";
    }
    $("#ifAttackIsPossible").append().html("<h4>Du kan attackera från:</h4><p>" + abc + "</p>");
}

$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $( "#connect" ).click(function() { connect(); });
    $( "#disconnect" ).click(function() { disconnect(); });
    $( "#endTurn" ).click(function() { sendGameTurnData(); });
});