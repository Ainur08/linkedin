<#import "base.ftlh" as base>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Главная</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <link href="/static/css/custom.css" rel="stylesheet">
</head>
<body>
<@base.page>
</@base.page>
<ul class="list-group" style="margin-top: 200px">
    <#list vacancies as vacancy>
        <li class="list-group-item">
            <h1><a href="http://localhost/main/${vacancy.getId()}"><p>${vacancy.getName()}</p></a></h1>
            <p> ${"Описание: "+ vacancy.getDescription()}</p>
            <p> ${"Зарплата: "+ vacancy.getSale()}</p>
            <p> ${"Компания: "+ vacancy.getSale()}</p>
        </li>
    </#list>
</ul>
</body>
</html>