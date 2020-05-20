<#import "base.ftlh" as base>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Создание</title>
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
                <h1><u><strong>Создание компании:</strong></u></h1>
                <p><input style="margin-top: 10px" type="text" name="name" placeholder="Название">
                </p>
                <p><select style="margin-top: 10px" name="country" size="1">
                        <option selected="selected" value="Россия">Россия</option>
                        <option value="Китай">Китай</option>
                        <option value="США">США</option>
                        <option value="Европа">Европа</option>
                    </select>
                <p>

                <p><textarea style="margin-top: 10px" name="activity" rows="10" cols="20"
                             maxlength="5000" placeholder="Род деятельности"></textarea></p>
                <p><input style="margin-top: 8px" class="btn btn-success btn-block" type="submit" value="Создать"></p>
            </form>
        </article>
    </section>
</div>
</body>
</html>