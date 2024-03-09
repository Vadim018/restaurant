$(document).ready(() => {

// за назвою класа
// $('.container-fluid')
// за ідентифікатором
// $('#id_')
// за тегами
// $('input')
    // $('')

    $('.minus').click(function () {

        // text();
        var input =  $(this).parent().find('input');

        var count = parseInt(input.val()) - 1;

        // if(count < 1){
        //     count = 1;
        // } else {
        //     count = count;
        // }

        count = count < 1 ? 1 : count;

        input.val(count);
        input.change();

        // var text = $('.my_text').text();
        // $('.my_text').text('abc abc');
        // $(this).parent().find('.my_text').text('minus');

        return false;
    });

    $('.plus').click(
        function () {

            var input = $(this).parent().find('input');
            var count = parseInt(input.val()) + 1;

        // $(this).parent().find('input').val(count);

        input.val(count);
        input.change();

        $(this).parent().find('.my_text').text('');

        return false;
    });

});