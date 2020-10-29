(function($) {
    "use strict";


    /*==================================================================
    [ Focus Contact2 ]*/
    $('.input100').each(function() {
        $(this).on('blur', function() {
            if ($(this).val().trim() != "") {
                $(this).addClass('has-val');
            } else {
                $(this).removeClass('has-val');
            }
        })
    })


    /*==================================================================
    [ Validate ]*/
    var name = $('.validate-input input[name="name"]');
    var email = $('.validate-input input[name="email"]');
    var message = $('.validate-input textarea[name="message"]');


    $('.validate-form').on('submit', function() {
        var check = true;

        if ($(name).val().trim() == '') {
            showValidate(name);
            check = false;
        }


        if ($(email).val().trim().match(/^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{1,5}|[0-9]{1,3})(\]?)$/) == null) {
            showValidate(email);
            check = false;
        }

        if ($(message).val().trim() == '') {
            showValidate(message);
            check = false;
        }

        return check;
    });


    $('.validate-form .input100').each(function() {
        $(this).focus(function() {
            hideValidate(this);
        });
    });

    function showValidate(input) {
        var thisAlert = $(input).parent();

        $(thisAlert).addClass('alert-validate');
    }

    function hideValidate(input) {
        var thisAlert = $(input).parent();

        $(thisAlert).removeClass('alert-validate');
    }



})(jQuery);



function getInfo() {

    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    var pnumber = document.getElementById("pnumber").value;

    console.log(name + " " + email + " " + pnumber);
    return false;
}

function checkModal() {

    if (lock === true) {

    }

}



$("#addEmp").submit(function(event) {

    var lock;

    event.preventDefault();

    email = $("#email").val();
    phoneNumber = $("#pnumber").val();
    name = $("#name").val();

    var employee = {

        name: name,
        email: email,
        phoneNumber: phoneNumber,
    };

    console.log(email);
    $.ajax({
        url: 'http://localhost:8000/api/v1/employee/addEmployee',
        dataType: 'json',
        type: 'POST',
        contentType: 'application/json',
        data: JSON.stringify(employee),
        success: function(data, textStatus, jQxhr) {
            lock = true
            email = $("#email").val('');
            phoneNumber = $("#pnumber").val('');
            name = $("#name").val('');
            console.log(data);
        },
        error: function(jqXhr, textStatus, errorThrown) {
            console.log(errorThrown);
        }
    });
    return false;
});