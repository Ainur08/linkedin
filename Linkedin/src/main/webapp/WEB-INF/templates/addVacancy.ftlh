<#import "base.ftlh" as base>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Разместить</title>
    <link href="/static/css/custom.css" rel="stylesheet">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
</head>
<body>
<@base.page>
</@base.page>
<div class="col-md-4 col-md-offset-4" id="login">
    <section id="inner-wrapper" class="login">
        <article>
            <form method="post">
                <h1><u><strong>Разместить вакансию:</strong></u></h1>
                <p><input style="margin-top: 10px" type="text" name="name" placeholder="Название">
                </p>
                <p><input style="margin-top: 10px" type="text" name="sale" placeholder="Зарплата">
                </p>

                <p><textarea style="margin-top: 10px" name="description" rows="10" cols="20"
                             maxlength="5000" placeholder="Описание"></textarea></p>
                <#--    <p style="margin-left: 200px; margin-top: 5px"><input type="file" name="file"></p>-->
                <p><input style="margin-top: 8px" class="btn btn-success btn-block" type="submit" value="Разместить">
                </p>
            </form>
        </article>
    </section>
</div>
</body>
</html>