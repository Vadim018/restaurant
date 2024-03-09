<#import "templ/templ.ftl" as c>
<@c.pages>
    <h2>Кошик <a href="/" class="title btn btn-primary mb-5 mt-5">Назад</a></h2>

    <table class="table">
    <thead>
        <tr>
            <th>Фото</th>
            <th>Назва</th>
            <th>Опис</th>
            <th>Кількість</th>
            <th>Ціна (1 шт.)</th>
            <th>Вартість</th>
        </tr>
    </thead>

    <tbody>
    <#if item_cart??>
    <#list item_cart as item>

        <form action="/updateItemCart" method="post">
            <input type="hidden" name="id" value="${item.product.id}">
        <tr>
            <td><img src="${item.product.image}" alt="${item.product.name}" height="60px"></td>
            <td>${item.product.name}</td>
            <td>${item.product.description}</td>
            <td>
                <div style="display: flex; flex-direction: column;">
                <button class="minus"> - </button>
                    <label for="quantity"></label><input type="text" id="quantity" name="quantity" value="${item.quantity}" size="3">
                <button class="plus"> + </button>
                </div>
            </td>
            <td>${item.product.price}</td>
            <td>${item.product.price*item.quantity}</td>
            <td>
                <button type="submit" class="btn btn-primary mt-2">Оновити</button>
            </td>
        </form>
        <form action="/deleteItemCart" method="post">
            <td>
                <input type="hidden" name="id" value="${item.product.id}">
                <input type="submit" class="btn btn-primary mt-2" value="Видалити">

            </td>
        </form>
        </tr>

    </#list>
    </#if>
    </tbody>
    </table>

    <p>Загальна вартість: <a> ${value} </a></p>
    <p>Кількість: <a> ${total_element} </a></p>

    <form action="/deleteItemsCart" method="post">
        <button type="submit" class="btn btn-primary mt-2">Видалити всі товари з кошика</button>
      <a href="/order" class="btn btn-primary mt-2">Оформити замовлення</a>
    </form>
</@c.pages>