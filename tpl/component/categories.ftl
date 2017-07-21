<div class="container">
    <div class="row">
        <div class="text-center">
            <h1>Добро пожаловать на IBoard</h1>
            <h3>IBoard - это беслатная доска обьявлений</h3>
        </div>
        <br>
    </div>
    <div class="row">
        <div class="panel panel-primary">
            <div class="panel-heading">Выберите Категорию</div>
            <div class="panel-body">
                <ul class="nav nav-pills nav-justified">
                    <li role="presentation" class="active"><a href="/category/">Все</a></li>

                <#list categories as item>
                    <li role="presentation"><a href="/category/${item.alias}/">${item.name}</a></li>
                </#list>
                </ul>
            </div>
        </div>
    </div>
</div>