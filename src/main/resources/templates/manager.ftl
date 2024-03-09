<#import "templ/templ.ftl" as p>
<@p.pages>



    <style>
        /*body {*/
        /*    font-family: Arial, sans-serif;*/
        /*}*/

        h1, h2 {
            color: #333;
        }

        ul {
            list-style-type: none;
            padding: 0;
        }

        li {
            margin-bottom: 10px;
        }

        /* Стилі для рівнів менеджменту */
        /*h2 {*/
        /*    margin-top: 30px;*/
        /*}*/

        /* Стилі для керівників ресторану */
        h1 {

            margin-top: 40px;
            margin-bottom: 20px;
        }

        /* Стилі для списку */
        /*li:current {*/
        /*    content: "✔";*/
        /*    color: green;*/
        /*    margin-right: 10px;*/
        /*}*/
    </style>


    <h1 style="text-align: center"> Інформація для менеджерів </h1>


    <hr>

    <h2 style="text-align: center;
color: #ff6600">Керівники ресторану</h2>

    <hr>

    <h3 style="text-align: center">Топ-менеджмент</h3>
    <ul style="text-align: center">
        <li>Генеральний директор: Іванова Ольга Петрівна</li>
        <li>Заступник генерального директора з фінансів: Сидоров Микола Іванович</li>
        <li>Заступник генерального директора з продажів: Ковальчук Наталія Олексіївна</li>
    </ul>


    <hr>

    <h3 style="text-align: center">Середній рівень менеджменту</h3>
    <ul style="text-align: center">
        <li>Керівник кухні: Петрова Ольга Миколаївна</li>
        <li>Керівник відділу обслуговування: Жуков Олександр Володимирович</li>
        <li>Керівник відділу маркетингу: Кравченко Андрій Вікторович</li>
    </ul>


    <hr>

    <h3 style="text-align: center">Керівники кухні</h3>
    <ul style="text-align: center">
        <li>Шеф-кухар: Петров Микола Іванович</li>
        <li>Другий шеф-кухар: Іванов Сергій Володимирович</li>
        <li>Директор з розвитку меню: Гончаренко Лілія Володимирівна</li>
    </ul>


    <hr>

    <h3 style="text-align: center">Кухарі</h3>
    <ul style="text-align: center">
        <li>Виконавчий кухар: Ковальчук Марія Олександрівна</li>
        <li>Асистент шеф-кухаря: Іваненко Ірина Михайлівна</li>
        <li>Кухар-універсал: Степаненко Олександр Сергійович</li>
        <li>Кондитер: Макаренко Юлія Вікторівна</li>
    </ul>

    <hr>
    <h3 style="text-align: center">Бармени</h3>
    <ul style="text-align: center">
        <li>Головний бар-мен: Петров Ростислав Михайлович</li>
    </ul>


    <hr>
</@p.pages>