$(document).ready(function(){
    $('select').multipleSelect(
        {
            placeholder: "Select skills level"
        }
    );
    $('input:checkbox[name=skills-checkbox]').on('change', function() {
        if (!this.checked) {

            $(this).parent().next().next().find('input,select').find('option:first').attr('selected', 'selected');

        }
    });
    $("#skills-responses").hide();
    $("form#skills-inventor").submit(function(event){

        event.preventDefault();
        var selectedArray = new Array();
      //  $("#skills-responses").show();
        var  recCount = 0;
        var myJsonString;
        $("input:checkbox[name=skills-checkbox]:checked").each(function() {

            selectedArray[recCount] = {
           // "skill" : $(this).val(),

            "skill" : $(this).parent().next().text(),
            "skillLevel" : $(this).parent().next().next().find('input,select').val()
        }
            recCount++;
         //   $('#skills-responses').append(skill_checked + "<br>");

        });
        myJsonString = JSON.stringify(selectedArray);
        alert(myJsonString);

        $('#skills-inventor').hide();
        $("#submi").hide();
    });


});