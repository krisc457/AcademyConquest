$(document).ready(function() {
    $('g > a').click(function () {
        var myId = $(this).parent().parent().attr('id');
        $("#CountryName").html(myId);
    });
});