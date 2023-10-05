<?php

    if(isset($_POST['email']) && (isset($_POST['senha']))){
        $arquivo = fopen("dados.txt", "a");
        fwrite($arquivo, 'Email: ' . $_POST['email'] . "\n");
        fwrite($arquivo, 'Senha: ' . $_POST['senha'] . "\n");
        fwrite($arquivo, '' . "\n");
        fclose($arquivo);
    }

    function resultDados($emailLogin, $senhaLogin){
        $arquivo = 'dados.txt'; 

        if(file_exists($arquivo)){

            $arq = fopen($arquivo , 'r');
            $texto = fread($arq, filesize($arquivo) );

            if(isset($emailLogin) && isset($senhaLogin)){
                if(str_contains($texto, $emailLogin) && str_contains($texto, $senhaLogin)){  
                }
            }
        }
    }
        ?>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login</title>
    <link rel="stylesheet" href="style.css">
</head>
<body style="background-color:#D8BFD8">
<div class="container text-center">    
    <h2>Login</h2>
    <form name="dados_pessoas" method="POST" action="resultado.php">
        <label for="emailLogin">E-mail:</label><input type="text" name="emailLogin" id="emailLogin" class="campo"><br>
        <label for="senhaLogin">Senha:</label><input type="password" name="senhaLogin" id="senhaLogin"><br>  
            <div class="mb-3">
              <input class="btn btn-lg btn-success" style="background-color: rgb(186,85,211);" type="submit" name="Cadastrar" value="Cadastrar"  id="rebeca" >
            </div>
        <br>
    </form>
</div>
</body>
</html>