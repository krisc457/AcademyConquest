$(document).ready(function() {
    $('g > a').click(function () {
        var myId = $(this).parent().parent().attr('id');
        stompClient.send("/app/endTurn", {}, JSON.stringify({'name': myId}));
    });
});