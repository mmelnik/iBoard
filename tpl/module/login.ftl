<section id="registration" class="container">
    <div class="text-center">
        <h3>Авторизация</h3>
    </div>

<#if alert??>
    <div class="text-center">
        <div class="alert alert-danger" role="alert">${alert}</div>
    </div>
</#if>

    <div class="container">
        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                <form method="post" class="form-default">
                    <div class="form-group">
                        <label>Введите E-Mail:</label>
                        <input type="text" id="email" name="email" placeholder="E-mail" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Введите Пароль:</label>
                        <input type="password" id="password" name="password" placeholder="Password"
                               class="form-control">
                    </div>
                    <div class="form-group">
                        <label class="text-muted">Нажмите кнопку Войти что бы авторизироваться</label>
                        <button class="btn btn-success btn-block">Войти</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>