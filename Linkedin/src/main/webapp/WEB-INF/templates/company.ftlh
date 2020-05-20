<#import "base.ftlh" as base>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Моя компания</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
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
<form style="padding-left: 170px; padding-right: 170px; padding-top: 10px" method="get" action="/search">
    <input type="search" name="text" required placeholder="Поиск людей по навыкам">
    <input type="image"
           src="http://3.bp.blogspot.com/-4w14hQHr5yQ/Tgm6u7KwUkI/AAAAAAAACAI/Hu2poBOPx3g/s1600/search.png"/>
</form>
<div class="col-md-4 col-md-offset-4" id="login">
    <section id="inner-wrapper" class="login">
        <h1><u><strong>${company.getName()}</strong></u></h1>
        <p>${"Род деятельности: "+ company.getActivity()}</p>
        <p>${"Страна: "+ company.getCountry()}</p>
        <a class="btn btn-outline-primary" href="http://localhost/vacancy/${company.getId()}">Разместить вакансию</a>
    </section>
</div>
</body>
</html>