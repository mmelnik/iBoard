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
<header class="navbar navbar-inverse navbar-fixed-top wet-asphalt" role="banner">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.html">IBoard</a>
        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="index.html">Home</a></li>
                <li><a href="about-us.html">About Us</a></li>
                <li><a href="services.html">Services</a></li>
                <li><a href="portfolio.html">Portfolio</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Pages <i class="icon-angle-down"></i></a>
                    <ul class="dropdown-menu">
                        <li><a href="career.html">Career</a></li>
                        <li><a href="blog-item.html">Blog Single</a></li>
                        <li><a href="pricing.html">Pricing</a></li>
                        <li><a href="404.html">404</a></li>
                        <li><a href="registration.html">Registration</a></li>
                        <li class="divider"></li>
                        <li><a href="privacy.html">Privacy Policy</a></li>
                        <li><a href="terms.html">Terms of Use</a></li>
                    </ul>
                </li>
                <li><a href="blog.html">Blog</a></li>
                <li><a href="contact-us.html">Contact</a></li>
            </ul>
        </div>
    </div>
</header>

<section>
    <div class="container">
        <div class="row">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <div class="row">
                        <div class="col-md-9">
                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="Введите текст для поиска">
                                <span class="input-group-btn">
                        <button class="btn btn-default" type="button">Найти!</button>
                    </span>
                            </div>
                        </div>
                        <div class="col-md-3 text-center">
                            <a class="btn btn-danger" href="/post/add-new">Добавить обьявление!</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

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

<section>
    <div class="container">
        <div class="row">
            <div class="panel panel-primary">
                <div class="panel-heading">Последние обьявления</div>
            </div>
        </div>
    <#list posts as item>
        <div class="row">
            <div class="panel panel-default panel-body">
                <div class="col-md-2">
                    <img src="/data/img/post_300.png" width="150">
                </div>
                <div class="col-md-8"><h3>${item.name}</h3> Description...</div>
                <div class="col-md-2"><h3 class="text-success">${item.price} грн.</h3></div>
            </div>
        </div>
    </#list>
    </div>
</section>

<footer id="footer" class="midnight-blue">
    <div class="container">
        IBoard - бесплатная доска обьявлений
    </div>
</footer>
</body>
</html>