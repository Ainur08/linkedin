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
        <h1><u><strong>${user.getName()}</strong></u></h1>
        <p>${"Образование: "+ education.getUniversity()}</p>
        <p>Навыки:</p>
        <#list skills as skill>
            <p>${skill.getName()}</p>
        </#list>
        <a class="btn btn-outline-primary" href="http://localhost/chat/${user.getName()}">Написать</a>
    </section>
</div>
</body>
</html>