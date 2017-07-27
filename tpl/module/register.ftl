<section id="registration" class="container">
    <div class="text-center">
        <h3>Регистрация</h3>
    </div>

<#if registration_success??>
    <div class="text-center">
        <div class="alert alert-success" role="alert"><b>Поздаврляем!</b> Вы успешно зарегистрировались!</div>
        <a class="btn btn-lg btn-success" href="/user/login">Авторизация</a>
    </div>
<#else>

    <div class="container">
        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                <form method="post" class="center" role="form">
                    <fieldset class="form-default">
                        <div class="form-group">
                            <input type="text" id="username" name="name" placeholder="Username" class="form-control">
                        </div>
                        <div class="form-group">
                            <input type="text" id="email" name="email" placeholder="E-mail" class="form-control">
                        </div>
                        <div class="form-group">
                            <input type="password" id="password" name="password" placeholder="Password"
                                   class="form-control">
                        </div>
                        <div class="form-group">
                            <input type="password" id="password_confirm" name="password_confirm"
                                   placeholder="Password (Confirm)"
                                   class="form-control">
                        </div>
                        <div class="form-group">
                            <button class="btn btn-success btn-md btn-block" type="submit">Register</button>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
</#if>

</section>