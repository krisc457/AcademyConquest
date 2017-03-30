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
<<<<<<< HEAD
    // Hit kommer resultatet av varje turn, så att vårt spel uppdateras.
    $("#greetings").append("<tr><td>" + message + "</td></tr>");
=======
    $("#CountryName").html(message);
>>>>>>> 1642676a5c7571e879cbf5be136cde8a613a0e96
}

$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $( "#connect" ).click(function() { connect(); });
    $( "#disconnect" ).click(function() { disconnect(); });
    $( "#endTurn" ).click(function() { sendGameTurnData(); });
});