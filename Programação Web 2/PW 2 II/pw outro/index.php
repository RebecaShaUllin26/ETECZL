<?php 

define('MYSQL_HOST', 'localhost:3306');
define('MYSQL_USER', 'root');
define('MYSQL_PASSWORD', '');
define('MYSQL_DB_NAME', 'pww');


try
{
    $PDO = new PDO('mysql:host=' . MYSQL_HOST . ';dbname='. MYSQL_DB_NAME, MYSQL_USER, MYSQL_PASSWORD,);
}catch(PDOException $e)
{
    echo 'Erro ao conectar com MySQL: ' . $e->getMessage();
}

?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP - Sistema de Acesso ao Banco de Dados</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <?php
    $sql = "SELECT * FROM `clientes`";
    $result = $PDO->query($sql);
    $rows = $result->fetchAll();

    ?>

<table class="table tabela">
    <thead>
        <tr>
            <th scope="col">E-mail</th>
            <th scope="col">Senha</th>
    </thead>    

    <tbody>
        <?php
         $sql = "SELECT * FROM `clientes`";
         $result = $PDO->query($sql);
         $rows = $result->fetchAll();
     
        for ($i = 0; $i < count($rows); $i++) {
            echo "<tr>";
            echo "<td>" . $rows[$i]['E-mail'] . "</td>";
            echo "<td>" . $rows[$i]['Senha'] . "</td>";
            echo "</tr>";
        }
        ?>
    </tbody>

        

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>