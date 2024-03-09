<#import "templ/templ.ftl" as p>
<@p.pages>

  <h2>Категорії</h2>

    <div class="menu-container row row-cols-3 row-cols-md-3 g-4 mb-5">
  <#if categories??>
  <#list categories as category>
  <div class="col">
    <div class="card">
      <a href="/category/${category.id}">
        <img src="${category.image}" class="card-img-top" alt="${category.name}"></a>
      <div class="card-body">
        <h5 class="card-title">${category.name}</h5>
        <p class="card-text">${category.description}</p>
      </div>
    </div>
  </div>
  </#list>
  </#if>
</div>
</@p.pages>