<#import "templ/templ.ftl" as c>
<@c.pages>

    <h1> ${category} </h1>
    <a href="/" class="title btn btn-primary mb-5 mt-5">Назад</a>

    <div class="row row-cols-2 row-cols-md-4 g-4">

        <#if products_by_category??>
            <#list products_by_category as product>
                <div class="col">
                    <div class="card">

                        <form action="/cart" method="post">

                        <input type="hidden" name="id" id="id_" value="${product.id}">
                        <img src="${product.image}" class="card-img-top" alt="${product.name}">
                        <div class="card-body">
                            <h5 class="card-title">${product.name}</h5>
                            <p class="card-text">${product.description}</p>
                            <p class="card-text">${product.categories.name}</p>
                            <h5 class="card-title">Ціна: <a>${product.price}</a></h5>

                            <div>
                                <button class="minus"> - </button>
                                <label>
                                    <input type="text" name="quantity" value="1" size="3">
                                </label>
                                <button class="plus"> + </button>
                                <p class="my_text"> </p>
                            </div>

                            <button type="submit" class="btn btn-success">У кошик</button>

                        </div>
                        </form>
                    </div>
                </div>
            </#list>
        </#if>
    </div>

</@c.pages>