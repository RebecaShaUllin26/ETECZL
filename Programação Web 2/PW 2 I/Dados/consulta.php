<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulário</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/style.css">
</head>
<body style="background-color:SandyBrown;">
    <div class="container" style="background-color:NavajoWhite; padding: 0;">
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
                                    <a class="nav-link ativo" aria-current="page" href="index.php">Home</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link cabecalho__menu" href="consulta.php">Editar</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>
            </div>
        </div>
        <div class="row">
            <div class="col descricao">
                <h2 class="descricao__titulo">Consulta</h2>
            </div>
        </div>

        <div class="row">
            <div class="col">
                <table class="table">
                    <thead>
                        <tr>
                            <th scope="col">Nome:</th>
                            <th scope="col">Telefone:</th>
                            <th scope="col">CPF:</th>
                            <th scope="col">Sexo:</th>
                            <th scope="col">Data de Nascimento:</th>
                        </tr>
                    </thead>
                    <tbody>
                        <?php
                        define('MYSQL_HOST', 'localhost:3306');
                        define('MYSQL_USER', 'root');
                        define('MYSQL_PASSWORD', '');
                        define('MYSQL_DB_NAME', 'cadastro');
 
                        try {
                            $pdo = new PDO('mysql:host=' . MYSQL_HOST . ';dbname=' . MYSQL_DB_NAME, MYSQL_USER, MYSQL_PASSWORD); //Para criar um PDO é mysql:host'(NOME_HOST no caso localhost)';dbname='(NOME_BANCO_DADOS)' , $username, $senha

                        } catch (PDOException $ex) {
                            echo "Erro ao tentar fazer a conexão com MYSQL: " . $ex->getMessage();
                        }

                        $sql = "SELECT * FROM dados";
                        $result = $pdo->query($sql);
                        $registros = $result->fetchAll();
                        

                        for ($i = 0; $i < count($registros); $i++) {
                            $data = date_create($registros[$i]['Data de Nascimento']);
                            $data = date_format($data , 'd/m/Y');

                            echo "<tr>";
                                echo "<td>" . $registros[$i]['Nome'] . "</td>";
                                echo "<td>" . $registros[$i]['Telefone'] . "</td>";
                                echo "<td>" . $registros[$i]['CPF'] . "</td>";
                                echo "<td>" . $registros[$i]['Sexo'] . "</td>";
                                echo "<td>" . $data . "</td>";
                                echo "<td>
                                    <a href='editarPag.php?id=" . $registros[$i]['id'] . "'>Editar</a>
                                    <a href='deletar.php?id=" . $registros[$i]['id']. "'>Deletar</a> 
                                </td>";
                            echo "</tr>";
                        }
                        ?>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>