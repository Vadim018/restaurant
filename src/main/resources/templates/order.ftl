<#import "templ/templ.ftl" as c>
<@c.pages>
    <h1>Форма замовлення</h1>

    <table class="table">
        <thead>
        <tr>
            <th>Фото</th>
            <th>Назва</th>
            <th>Кількість</th>
            <th>Ціна (1 шт.)</th>
            <th>Вартість</th>
        </tr>
        </thead>

        <tbody>
        <#if itemCart??>
            <#list itemCart as item>
                <tr>
                    <td><img src="${item.product.image}" alt="${item.product.name}" height="40px"></td>
                    <td>${item.product.name}</td>
                    <td>${item.quantity}</td>
                    <td>${item.product.price}</td>
                    <td>${item.product.price*item.quantity}</td>
                </tr>
            </#list>
        </#if>
        </tbody>
    </table>

<#--    <p> Total value: <a> ${itemCart} </a></p>-->
<#--    <p> Sul el: <a> ${itemCart} </a></p>-->

    <h2>Форма клієнта</h2>

    <table class="table">
        <thead>
        <tr>
            <th>Ім'я</th>
            <th>Прізвище</th>
            <th>Вік</th>
            <th>Телефон</th>
            <th>EMAIL</th>
            <th>Оплата</th>
            <th>Доставка</th>
        </tr>
        </thead>
        <tbody>

        <tr>
            <td>Ім'я: ${client.firstName}</td>
            <td>Прізвище: ${client.lastName}</td>
            <td>Вік: ${client.age}</td>
            <td>Телефон: ${client.phone}</td>
            <td>EMAIL: ${client.email}</td>

            <form action="/order" method="post">
                <td>
                    <select name="payment">
                        <option value="cash">Готівка</option>
                        <option value="card">Карта</option>
                    </select>
                </td>

                <td>
                    <select name="delivery">
                        <option value="post">Glovo</option>
                        <option value="post">Bolt Food</option>
                        <option value="post">Rocket UA</option>
                    </select>
                </td>
        </tr>
        </tbody>

    </table>

<#--    <h2>Address</h2>-->
<#--    <select name="address">-->

<#--        <#list address as address>-->
<#--            <option value="${address.id}">${address.city +", "+ address.country + ", " + address.building} </option>-->
<#--        </#list>-->
<#--    </select>-->

    <button type="submit" class="btn btn-primary mt-2">Замовити</button>
    <a href="/" class="btn btn-primary mt-2">Назад</a>

    </form>

    <style>
        .col {
            display: flex;
            align-items: center;
            justify-content: center;
            margin-top: 150px;

        }
    </style>

    <div class="menu-container row row-cols-3 row-cols-md-3 g-4 mb-5 br-20">

        <div class="col">
        <img src="/static/images/category/glovo.png" alt="...">
        </div>

        <div class="col">
        <img src="/static/images/category/bolt.png" alt="...">
        </div>

        <div class="col">
        <img src="/static/images/category/rocket.png" alt="...">
        </div>
    </div>

</@c.pages>