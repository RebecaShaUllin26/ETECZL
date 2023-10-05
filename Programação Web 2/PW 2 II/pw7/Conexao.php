<?php
define('SERVIDOR','localhost');
define('USUARIO', 'root');
define('SENHA','');
define('BANCO', 'projetoweb');


Class Conexao{
    $mysqli;
    public function _construct(){
        try{
            $this->conexaoMtsql();
        }catch(Exception e){
            echo "Bnaco não esta conectado!";
        }

    }
    public function conexaoMysql(){
        $this->mysqli(SERVIDOR, USUARIO, SENHA, BANCO);
    }

public function setAgendamentos($nome, $telefone, $origem, $data_contato, $observacao){
$stmt = $this->mysqli->prepare("INSERT INTO agendamentos('nome','telefone','origem','data_contato','observacao')VALUES(?,?,?,?,?)");
$stmt->bind_param("sssss", $nome,$telefone,$origem,$data_contato,$observacao);
$stmt->execute();
}

}

?>
