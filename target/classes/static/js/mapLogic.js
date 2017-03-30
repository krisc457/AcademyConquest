$(document).ready(function() {
<<<<<<< HEAD
    $('g > a').click(function () {
        var myId = $(this).parent().parent().attr('id');
        $("#CountryName").html(myId);
    });
=======

    $('g > a').click(function () {
        var myId = $(this).parent().parent().attr('id');
        stompClient.send("/app/endTurn", {}, JSON.stringify({'name': myId}));
    });

    // Bortkommenterat zoomscript nedan


    var width = $("#gameMap").width();
    var height = $("#gameMap").height();

    $("#zoomIn").click(function(e){
        var newWidth = width * 1.25;
        var newHeight = height * 1.25;
        $("#gameMap").css("animation", "zoomIn 0.5s");
        $("#gameMap").css("animation", "zoomIn 0.5s");
        setTimeout(function(){
            $("#gameMap").css("width", newWidth + "px");
            $("#gameMap").css("height", newHeight + "px");
        }, 500);
    });

    $("#zoomOut").click(function(e){
        var newWidth = width * 0.8;
        var newHeight = height * 0.8;
        $("#gameMap").css("animation", "zoomOut 0.5s");
        $("#gameMap").css("animation", "zoomOut 0.5s");
        setTimeout(function(){
            $("#gameMap").css("width", newWidth + "px");
            $("#gameMap").css("height", newHeight + "px");
        }, 500);
    });

>>>>>>> 1642676a5c7571e879cbf5be136cde8a613a0e96
});