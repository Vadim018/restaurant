<#import "templ/templ.ftl" as p>
<@p.pages>

    <h1>${product.name}</h1>

    <p>ID: ${product.id}</p>
    <p>Назва: ${product.name}</p>
    <p>Опис: ${product.description}</p>
    <p>Ціна: ${product.price}</p>
    <p>Фото: ${product.image}</p>
    <p>Назва категорії: ${product.categories.name}</p>

</@p.pages>