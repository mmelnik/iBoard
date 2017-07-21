<section>
    <div class="container">
        <div class="row">
            <div class="panel panel-primary">
                <div class="panel-heading">Последние обьявления</div>
            </div>
        </div>
    <#list posts as item>
        <div class="row">
            <div class="panel panel-default">
                <div class="panel-body">
                    <div class="col-md-2">
                        <img src="/data/img/post_300.png" width="150">
                    </div>
                    <div class="col-md-8">
                        <h3>${item.name}</h3>
                        Lorem Ipsum - это текст-"рыба", часто используемый в печати и вэб-дизайне. Lorem Ipsum является
                        стандартной "рыбой" для текстов на латинице с начала XVI века. В то время некий безымянный
                        печатник создал большую коллекцию размеров и форм шрифтов, используя Lorem Ipsum для распечатки
                        образцов. Lorem Ipsum не только успешно пережил без заметных изменений пять веков, но и
                        перешагнул в электронный дизайн. Его популяризации в новое время послужили публикация листов
                        Letraset с образцами Lorem Ipsum в 60-х годах и, в более недавнее время, программы электронной
                        вёрстки типа Aldus PageMaker, в шаблонах которых используется Lorem Ipsum.
                    </div>
                    <div class="col-md-2"><h3 class="text-success">${item.price} грн.</h3></div>
                </div>
                <div class="panel-footer">
                    <span class="text-muted">
                        Добавлено 21.07.2017 19:07, 123 просмотров
                    </span>
                </div>
            </div>
        </div>
    </#list>
        <div class="row">
            <div class="text-center">
                <ul class="pagination">
                    <li>
                        <a href="#" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </li>
                    <li><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li>
                        <a href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</section>