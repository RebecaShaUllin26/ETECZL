<?php
$Nome= $_POST['Nome'] ?? "";
$Telefone = $_POST['Telefone'] ?? "";
$CPF = $_POST['CPF'] ?? "";
$Sexo = $_POST['Sexo'] ?? "";
$DatadeNascimento = $_POST['Data de Nascimento'] ?? "";
$dataAt = date("Y-m-d");

define('MYSQL_HOST', 'localhost:3306');
define('MYSQL_USER', 'root');
define('MYSQL_PASSWORD', '');
define('MYSQL_DB_NAME', 'cadastro');

try {
    $pdo = new PDO('mysql:host=' . MYSQL_HOST . ';dbname=' . MYSQL_DB_NAME, MYSQL_USER, MYSQL_PASSWORD);
    $id =(int) $_GET["id"];
    $sqlUpdate = $pdo->prepare("UPDATE `dados` SET `Nome`='$Nome',`Telefone`='$Telefone',`CPF`='$CPF',`Sexo`='$Sexo',`Data de Nascimento`='$DatadeNascimento' WHERE id=$id");
    $sqlUpdate->execute();
} catch (PDOException $ex) {
    echo "Erro ao tentar fazer a conexão com MYSQL: " . $ex->getMessage();
}


?>