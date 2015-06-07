$(document).ready(function() { 

$("p").hide();

$("hi").click(function(){
    $(this).next().slideToggle(300);
});
});