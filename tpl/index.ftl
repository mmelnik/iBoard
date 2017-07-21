<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>IBoard</title>

    <link href="/data/css/bootstrap.min.css" rel="stylesheet">
    <link href="/data/css/prettyPhoto.css" rel="stylesheet">
    <link href="/data/css/animate.css" rel="stylesheet">
    <link href="/data/css/main.css" rel="stylesheet">

    <script src="/data/js/jquery-1.12.4.min.js"></script>
    <script src="/data/js/bootstrap.min.js"></script>
</head>
<body>
<#include "component/header.ftl"/>

<section>
<#include "component/search.ftl"/>

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
                        <li role="presentation"><a href="/category/${item.id}">${item.name}</a></li>
                    </#list>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</section>
<#include "module/lastPost.ftl"/>
<#include "component/footer.ftl"/>
</body>
</html>