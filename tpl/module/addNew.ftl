<section class="container">

    <div class="text-center">
        <h3>Добавление нового обьявления</h3>
    </div>

    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <#if alert??>
                <div class="alert alert-danger">${alert}</div>
            </#if>
            <div class="panel panel-default">
                <div class="panel-body">
                    <form method="post" class="form-default">
                        <div class="form-group">
                            <label>Заголовок</label>
                            <input class="form-control" type="text" name="title">
                        </div>
                        <div class="form-group">
                            <label>Категория</label>
                            <input class="form-control" type="text" name="category">
                        </div>
                        <div class="form-group">
                            <hr>
                            <label>Описание</label>
                            <input class="form-control" type="text" name="description">
                        </div>
                        <div class="form-group">
                            <label>Цена</label>
                            <input class="form-control" type="number" name="price">
                        </div>
                        <div class="form-group">
                            <label>Номер Телефона</label>
                            <input class="form-control" type="tel" name="phone">
                        </div>
                        <div class="form-group">
                            <label>Фото</label>
                            <input type="file" name="file">
                        </div>
                        <div class="form-group">
                            <hr>
                            <input class="btn btn-block btn-success" type="submit" value="Добавить">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</section>