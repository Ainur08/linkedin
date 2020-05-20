<#import "base.ftlh" as base>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Профиль</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <link href="/static/css/custom.css" rel="stylesheet">
</head>
<body>
<@base.page>
</@base.page>
<div class="col-md-4 col-md-offset-4" id="login">
    <section id="inner-wrapper" class="login">
        <h1><u><strong>Профиль</strong></u></h1>
        <p>${"Имя: "+ user.getName()}</p>
        <p>${"Почта: "+ user.getEmail()}</p>
        <p>${"Образование: "+ education.getUniversity()}</p>
        <p>Навыки:</p>
        <#list skills as skill>
            <p>${skill.getName()}</p>
        </#list>

        <h1><u><strong>CV:</strong></u></h1>
        <#if count == 1>
            <div id="progress" class="progress">
                <div class="progress-bar" role="progressbar" style="width: 25%;"
                     aria-valuenow="25" aria-valuemin="0" aria-valuemax="100">25%
                </div>
            </div>
        <#elseif count == 2>
            <div id="progress" class="progress">
                <div class="progress-bar" role="progressbar" style="width: 50%;"
                     aria-valuenow="50" aria-valuemin="0" aria-valuemax="100">50%
                </div>
            </div>
        <#elseif count == 3>
            <div id="progress" class="progress">
                <div class="progress-bar" role="progressbar" style="width: 75%;"
                     aria-valuenow="75" aria-valuemin="0" aria-valuemax="100">75%
                </div>
            </div>
        <#else>
            <div id="progress" class="progress">
                <div class="progress-bar" role="progressbar" style="width: 100%;"
                     aria-valuenow="100" aria-valuemin="0" aria-valuemax="100">100%
                </div>
            </div>
        </#if>
        <br>
        <a class="btn btn-outline-primary" href="http://localhost/company">Создать компанию</a>
        <a class="btn btn-outline-primary" href="http://localhost/companies">Мои компании</a>
    </section>
</div>
</body>
</html>