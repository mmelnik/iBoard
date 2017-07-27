<header class="navbar navbar-inverse navbar-fixed-top wet-asphalt" role="banner">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">iBoard.com.ua ;)</a>
        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="/">Главная</a></li>
            <#if user??>
                <li><a href="/user/logout">Выход</a></li>
            <#else>
                <li><a href="/user/register">Регистрация</a></li>
                <li><a href="/user/login">Вход</a></li>
            </#if>
            </ul>
        </div>
    </div>
</header>