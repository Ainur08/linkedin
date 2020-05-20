<#import "base.ftlh" as base>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Мои компании</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <link href="/static/css/custom.css" rel="stylesheet">
</head>
<body>
<@base.page>
</@base.page>
<ul class="list-group" style="margin-top: 200px">
    <#list companies as company>
        <li class="list-group-item">
            <h1><a href="http://localhost/companies/${company.getId()}"><p>${company.getName()}</p></a></h1>
            <p> ${"Род деятельности: "+ company.getActivity()}</p>
        </li>
    </#list>
</ul>
</body>
</html>