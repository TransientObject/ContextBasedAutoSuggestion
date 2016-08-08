$.get("http://localhost:3000/dictionary.txt", function(data){
  // alert(data);
  var availableTags = data.split(" ");
  $( "#message_content" ).autocomplete({
    source: availableTags
  });
});