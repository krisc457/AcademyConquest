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
    //     Patrik splittas med "!patrik" och "!1". Schmidt splittas med "!schmidt" och "!2". Cox med "!cox" och "!3".

    var info = message.split("!split")
    console.log(info);
    var rikuInfo = info[0];
    var rikuInfoRätt = info[0].split("!1");
    console.log(rikuInfo);
    console.log(rikuInfoRätt);
    var schmidtInfo = info[1];
    var schmidtInfoRätt = info[1].split("!2");
    console.log(schmidtInfo);
    console.log(schmidtInfoRätt);
    var coxInfo = info[2];
    var coxInfoRätt = info[2].split("!3");
    console.log(coxInfo);
    console.log(coxInfoRätt);

    $("#CountryName").html(rikuInfoRätt[0]);
    $("#CountryValues").html(rikuInfoRätt[1]);

    $(".adjacent").removeClass("adjacent");
    $(".chosen").removeClass("chosen");
    $(".others").removeClass("others");
    for(var i=1; i<coxInfoRätt.length-1; i++){
        $("#" + coxInfoRätt[i] + " > g > a > path").addClass("adjacent");
    }
    $("#" + coxInfoRätt[coxInfoRätt.length-1] + " > g > a > path").addClass("chosen");
    $("path:not(.adjacent):not(.chosen)").addClass("others");

    var abc = "";
    for (var i=1; i<schmidtInfoRätt.length; i++) {
        abc +=  schmidtInfoRätt[i]+"<br>";
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