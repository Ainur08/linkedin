<#import "base.ftlh" as base>
<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <link href="/static/css/custom.css" rel="stylesheet">
    <title>Document</title>
</head>
<body>
<@base.page>
</@base.page>
<form style="padding-left: 170px; padding-right: 170px; padding-top: 150px" method="get" action="/search">
    <input type="search" name="text" required placeholder="Поиск людей по навыкам">
    <input type="image"
           src="http://3.bp.blogspot.com/-4w14hQHr5yQ/Tgm6u7KwUkI/AAAAAAAACAI/Hu2poBOPx3g/s1600/search.png"/>
</form>
<ul class="list-group" style="margin-top: 10px">
    <#list skills as skill>
        <li class="list-group-item">
            <h1><a href="http://localhost/user/1"><p>${skill.getName()}</p></a></h1>
            <p> ${skill.getExperience()}</p>
        </li>
    </#list>
</ul>
<a class="btn btn-outline-primary" href="http://localhost/companies">Вернуться назад</a>
</body>
</html>