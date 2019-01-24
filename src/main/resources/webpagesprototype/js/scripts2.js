$(document).ready(function(){

    $('input:checkbox[name=skills-checkbox]').on('change', function() {
        if (!this.checked) {
            $(this).parent().next().next().find('input.text-box[type=text]').val('');
            $(this).parent().next().next().next().find('input.text-box2[type=text]').val('');
            $(this).parent().next().next().next().next().find('input,select').find('option:first').attr('selected', 'selected');
          //  $(this).parent().next().next().next().next().find('input[type=radio]').prop('checked',  false);
            $(this).parent().next().next().next().next().next().find('input[type=radio]').filter("[value='Add']").prop("checked",true);

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
            "howManyYears" : $(this).parent().next().next().find('input.text-box[type=text]').val(),
            "lastTimeUsed" : $(this).parent().next().next().next().find('input.text-box2[type=text]').val(),
            "skillLevel" : $(this).parent().next().next().next().next().find('input,select').val(),
            "actionToPerform" : $(this).parent().next().next().next().next().next().find('input[type=radio]:checked').val()
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