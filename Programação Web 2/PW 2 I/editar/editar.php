<?php
$nome= $_POST['nome'] ?? "";
$telefone = $_POST['telefone'] ?? "";
$origem = $_POST['origem'] ?? "";
$data = $_POST['data'] ?? "";
$observacao = $_POST['observacao'] ?? "";
$dataAt = date("Y-m-d");

define('MYSQL_HOST', 'localhost:3306');
define('MYSQL_USER', 'root');
define('MYSQL_PASSWORD', '');
define('MYSQL_DB_NAME', 'cadastro');

try {
    $pdo = new PDO('mysql:host=' . MYSQL_HOST . ';dbname=' . MYSQL_DB_NAME, MYSQL_USER, MYSQL_PASSWORD);
    $id =(int) $_GET["id"];
    $sqlUpdate = $pdo->prepare("UPDATE dadoscliente SET nome='$nome' , telefone='$telefone' , origem='$origem' , dataContato='$data' , observacao='$observacao' WHERE id=$id");
    $sqlUpdate->execute();
} catch (PDOException $ex) {
    echo "Erro ao tentar fazer a conexão com MYSQL: " . $ex->getMessage();
}

header('Location:consulta.php');
exit();


