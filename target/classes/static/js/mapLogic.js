$(document).ready(function() {

    var majorNationTurn = "Britain";

    $("#majorNationsDropdown > li > a").click(function(){
        majorNationTurn = $(this).attr("id");
    });

    $('g > a').click(function () {
        if($(this).children().hasClass("chosen")) {
            $(".adjacent").removeClass("adjacent");
            $(".chosen").removeClass("chosen");
            $(".others").removeClass("others");
        } else {
            var myId = $(this).parent().parent().attr('id');
            stompClient.send("/app/makeMove", {}, JSON.stringify({'name': myId, "majorNationTurn": majorNationTurn}));
            setTimeout(function(){
                $(".adjacent").removeClass("adjacent");
                $(".chosen").removeClass("chosen");
                $(".others").removeClass("others");
                console.log("clickedRegionAdjacents är detta: " + clickedRegionAdjacents);
                for(var i=0; i<clickedRegionAdjacents.length; i++){
                    $("#" + clickedRegionAdjacents[i] + " > g > a > path").addClass("adjacent");
                }
                $("#" + clickedRegionToHaveAdjacents + " > g > a > path").addClass("chosen");
                $("path:not(.adjacent):not(.chosen)").addClass("others");
                //clickedRegionAdjacents.length=0;
                clickedRegionToHaveAdjacents = "";
            }, 500);
        }
    });

    $("#btnClose").click(function(){
        stompClient.send("/app/cancelMove", {});
    });

    var width = $("#gameMap").width();
    var height = $("#gameMap").height();

    $("#zoomIn").click(function(e){
        var newWidth = width * 1.25;
        var newHeight = height * 1.25;
        var scrolledX = window.pageXOffset;
        var scrolledY = window.pageYOffset;
        $("#gameMap").css("transform-origin", 0 + "px" + scrolledY + "px");
        $("#gameMap").css("animation", "zoomIn 0.5s");
        /*
         setTimeout(function(){
         $("#gameMap").css("width", newWidth + "px");
         $("#gameMap").css("height", newHeight + "px");
         window.scrollTo(scrolledX * 1.25, scrolledY * 1.26);
         }, 500);
         */
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


});

$(function () {
    $('.dropdown-toggle').dropdown();
    $('#majorNationsDropdown li > a').click(function () {
        $('#droptext').text($(this).html());
    });
});