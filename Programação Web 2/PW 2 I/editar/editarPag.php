<?php

define('MYSQL_HOST', 'localhost:3306');
define('MYSQL_USER', 'root');
define('MYSQL_PASSWORD', '');
define('MYSQL_DB_NAME', 'cadastro');

try {
    $pdo = new PDO('mysql:host=' . MYSQL_HOST . ';dbname=' . MYSQL_DB_NAME, MYSQL_USER, MYSQL_PASSWORD); 

} catch (PDOException $ex) {
    echo "Erro ao tentar fazer a conexão com MYSQL: " . $ex->getMessage();
}

$id = (int) $_GET['id'];

$sql = "SELECT * FROM `dados` WHERE id= $id ";
$result = $pdo->query($sql);
$registros = $result->fetchAll();

if(isset($_POST['Editar'])){
    $Nome= $_POST['Nome'] ?? "";
    $Telefone = $_POST['Telefone'] ?? "";
    $CPF = $_POST['CPF'] ?? "";
    $Sexo = $_POST['Sexo'] ?? "";
    $DatadeNascimento = $_POST['data'] ?? "";
    $dataAt = date("Y-m-d");
    $sqlUpdate = $pdo->prepare("UPDATE `dados` SET Nome ='$Nome' , Telefone ='$Telefone' , CPF ='$CPF' , Sexo ='$Sexo', 'Data de Nascimento' ='$DatadeNascimento' WHERE id=$id");


}
?>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Editar Dados</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/style.css">
</head>
<body style="background-color: SandyBrown;">
    <div class="container" style="background-color: NavajoWhite; padding: 0;">
    <header>
    <div class="container">
        <div class="row">
        <nav class="navbar navbar-expand-lg  bg-lg  border-bottom shadow-sm mb-3" style="background-color: rgb(210,105,30);">
            <div class="col cabecalho">
                <nav class="navbar navbar-expand-lg">
                    <div class="container-fluid">
                        <a class="navbar-brand cabecalho__titulo" href="index.php">CADASTRO</a>
                        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarNav">
                            <ul class="navbar-nav">
                                <li class="nav-item">
                                    <a class="nav-link ativo" aria-current="page" href="index.php">Cadastrar</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link cabecalho__menu" href="consulta.php">Consultar</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>
            </div>
        </div>
        <div class="row">
            <div class="col descricao">
                <h2 class="descricao__titulo">Editar os Dados</h2>
            </div>
        </div>
        <div class="row">
            <div class="col formulario">
                <form action="editar.php?id=<?=$_GET['id']?>" method="POST">
                    <div class="mb-3">
                        <label for="nome" class="form-label">Nome:</label>
                        <input type="text" class="form-control" id="Nome"  name="Nome" required value="<?= $registros[0]['Nome']?>" >
                    </div>

                    <div class="mb-3">
                        <label for="telefone" class="form-label">Telefone: </label>
                        <input type="tel" class="form-control" id="Telefone" name="Telefone" placeholder="(XX)XXXXX-XXXX" required  value="<?= $registros[0]['Telefone']?>">
                    </div>

                    <div class="mb-3">
                        <label for="CPF" class="form-label">CPF:</label>
                        <input type="CPF" class="form-control" id="CPF" name="CPF" required value="<?= $registros[0]['CPF']?>">
                    </div>

                    <div class="mb-3">
                        <label for="origem" class="form-label">Sexo: </label>
                        <select class="form-select" name="Sexo" id="Sexo" value="<?= $registros[0]['Sexo']?>">
                            <option value="Feminino">Feminino</option>
                            <option value="Masculino">Masculino</option>
                            <option value="Outro">Outro</option>
                        </select>
                    </div>

                    <div class="mb-3">
                        <label for="data" class="form-label">Data de Nascimento: </label>
                        <input type="date" class="form-control" id="data" name="data" required max="<?= $dataAt ?>"value="<?= $registros[0]['Data de Nascimento']?>">
                    </div>

                  
                     <input style="background-color: rgb(210,105,30);" type="submit" value="Editar" name="Editar" class=" btn btn-lg btn-success ">
                        </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>