<!DOCTYPE html>
<html lang="pt-BR">
    <head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>cadastro</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body style="background-color:#E0FFFF">
    <div class="container text-center">
        <h2>Cadastro</h2>
        <form name="cadastro" method="POST" action="login.php">
            <label for="email">E-mail:</label><input type="email" name="email" id="email" required class="campo"> <br>
            <label for="senha">Senha:</label><input type="password" name="senha" id="senha" required> <br>
            <div class="mb-3">
              <input class="btn btn-lg btn-success" style="background-color: rgb(0,191,255);" type="submit" name="Cadastrar" value="Cadastrar" id="rebeca">
            </div>
        </form>
        </div>
    </body>
</html>