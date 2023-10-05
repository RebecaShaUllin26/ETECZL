<?php

require_once("pessoa.php");

class Teste{
    private $pessoa;

    public function __construct(){
        $pessoa = new Pessoa();

        $pessoa->setNome($_POST['nome']);
        echo $pessoa->getNome();
        echo "<br>";

        $pessoa->setTelefone($_POST['telefone']);
        echo $pessoa->getTelefone();
        echo "<br>";

        $pessoa->setOrigem($_POST['origem']);
        echo $pessoa->getOrigem();
        echo "<br>";

        $pessoa->setData($_POST['data']);
        echo $pessoa->getData();
        echo "<br>";

        $pessoa->setObservacao($_POST['observacao']);
        echo $pessoa->getObservacao();
    }
}new Teste();

?>