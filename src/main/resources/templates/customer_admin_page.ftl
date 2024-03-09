<#import "templ/templ.ftl" as p>
<@p.pages>
        <h1 style="text-align: center">Список зареєстрованих користувачів</h1>

    <hr>
    <#if customers??>

        <style>
            /*body {*/
            /*    font-family: Arial, sans-serif;*/
            /*    margin: 0;*/
            /*    padding: 20px;*/
            /*    background-color: #f5f5f5;*/
            /*}*/

            h1 {
                color: #333;
                margin-bottom: 20px;
            }

            ul {
                list-style-type: none;
                /*padding: 0;*/
                /*margin: 0;*/
                background-color: #fff;
                /*border: 1px solid #ccc;*/
                /*border-radius: 4px;*/
                padding: 10px;
                margin-bottom: 20px;
            }

            li {
                margin-bottom: 10px;
            }

            /*li:first-child {*/
            /*    font-weight: bold;*/
            /*}*/
        </style>

    <#list customers as customer>
        <ul>
            <li>ID: ${customer.id}</li>
            <li>Ім'я: ${customer.firstName}</li>
            <li>Прізвище: ${customer.lastName}</li>
            <li>Логін: ${customer.user.username}</li>
            <li>Пароль: ${customer.user.password}</li>
            <li>EMAIL: ${customer.email}</li>
            <li>Телефон: ${customer.phone}</li>
            <li>Адреса: ${customer.address}</li>
        </ul>

        <hr>

    </#list>
    </#if>
</@p.pages>