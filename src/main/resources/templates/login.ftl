<#import "templ/templ.ftl" as p>
<@p.pages>

    <h1>Авторизація</h1>

    <form action="/login" method="post">

        <label for="username">Користувач</label><br>
        <input type="text" name="username"  id="username"><br><br>
        <label for="password">Пароль</label><br>
        <input type="text" name="password"  id="password"><br>

        <form action="/thank">
            <button  class="btn btn-primary mt-2" type="submit">
                Увійти
            </button>
        </form>

    </form>

</@p.pages>