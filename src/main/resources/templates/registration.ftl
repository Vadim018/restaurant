<#import "/spring.ftl" as spring>
<#import "templ/templ.ftl" as p>

<@p.pages>
    <h1 style="text-align: center"> Реєстрація </h1>


    <hr>

    <style>
        form {
            text-align: center;
        }

        table {
            margin: 0 auto;
        }

        td {
            text-align: center;
            padding: 10px;
        }

        label {
            display: block;
            margin-top: 5px;
            padding-bottom: 2px;
        }

        input[type="text"],
        input[type="number"],
        select {
            width: 200px;
            padding: 5px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            width: 150px;
            border: none;
            border-radius: 4px;
            background-color: #007bff;
            color: #fff;
            cursor: pointer;

            margin-bottom: 50px;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>

    <form action="/registration" method="post">

    <@spring.bind "users"/>

    <label>Логін</label><br>
    <@spring.formInput "users.username"/>
    <@spring.showErrors "<br>"/><br>

    <label>Пароль</label><br>
    <@spring.formInput "users.password"/>
    <@spring.showErrors "<br>"/><br>

    <@spring.bind "customer"/>

    <label>Ім'я</label><br>
    <@spring.formInput "customer.firstName"/>
    <@spring.showErrors "<br>"/><br>

    <label>Прізвище</label><br>
    <@spring.formInput "customer.lastName"/>
    <@spring.showErrors "<br>"/><br>

    <label>Телефон</label><br>
    <@spring.formInput "customer.phone"/>
    <@spring.showErrors "<br>"/><br>

    <label>EMAIL</label><br>
    <@spring.formInput "customer.email"/>
    <@spring.showErrors "<br>"/><br>

    <label>Вік</label><br>
    <@spring.formInput "customer.age"/>
    <@spring.showErrors "<br>"/><br>

    <label>Домашня адреса</label><br>
    <@spring.formInput "customer.address"/>
    <@spring.showErrors "<br>"/><br>

    <input class="btn btn-primary mt-2" type="submit" value="Зберегти">

    </form>


</@p.pages>