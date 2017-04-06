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
                JSON.parse(greeting.body).namesOfAttackRegions,
                JSON.parse(greeting.body).idsForAdjacentRegions,
                JSON.parse(greeting.body).majorNationTurn,
                JSON.parse(greeting.body).cancelMove,
                JSON.parse(greeting.body).attackMove,
                JSON.parse(greeting.body).attackSuccess,
                JSON.parse(greeting.body).clickedLand,
                JSON.parse(greeting.body).troops,
                JSON.parse(greeting.body).networth
                //Lägg in värde med land man attackerar ifrån
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

//Skicka också in värde från det land man attackerar ifrån
function updateGame(namesOfAttackRegions, idsForAdjacentRegions, majorNationTurn, cancelMove, attackMove, attackSuccess, clickedLand, troops, networth) {
    if(namesOfAttackRegions != null) {
    var namesOfAttackRegions = namesOfAttackRegions.split("!2");
    }
    else {
        namesOfAttackRegions = "";
        
    }
    if(idsForAdjacentRegions != null) {
    var idsForAdjacentRegions = idsForAdjacentRegions.split("!3");
    }
    else {
        idsForAdjacentRegions = "";
    }
    var majorNationTurn = majorNationTurn;
    var chosenRegion = idsForAdjacentRegions[idsForAdjacentRegions.length-1];

    if(cancelMove) {
        $(".adjacent").removeClass("adjacent");
        $(".chosen").removeClass("chosen");
        $(".others").removeClass("others");
        return;
    }
    else if (attackMove) {
        $(".adjacent").removeClass("adjacent");
        $(".chosen").removeClass("chosen");
        $(".others").removeClass("others");


        if(attackSuccess) {
            switch (majorNationTurn) {
                case "Britain":
                    $("#" + clickedLand + " > g > a > path").removeClass();
                    $("#" + clickedLand + " > g > a > path").addClass("active purple");
                    break;
                case "Germany":
                    $("#" + clickedLand + " > g > a > path").removeClass();
                    $("#" + clickedLand + " > g > a > path").addClass("active blue");
                    break;
                case "France":
                    $("#" + clickedLand + " > g > a > path").removeClass();
                    $("#" + clickedLand + " > g > a > path").addClass("active green");
                    break;
                case "Usa":
                    $("#" + clickedLand + " > g > a > path").removeClass();
                    $("#" + clickedLand + " > g > a > path").addClass("active teal");
                    break;
                case "Japan":
                    $("#" + clickedLand + " > g > a > path").removeClass();
                    $("#" + clickedLand + " > g > a > path").addClass("active yellow");
                    break;
                case "Russia":
                    $("#" + clickedLand + " > g > a > path").removeClass();
                    $("#" + clickedLand + " > g > a > path").addClass("active red");
                    break;
            }
        }
        return;
    }


    $("#CountryName").html(clickedLand);
    $("#CountryValues").html("<p>Troops :"+troops+"</p><p>Networth : "+networth+"</p>");

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