<?php

    class Pessoa{
        private $nome;
        private $tel;
        private $ori;
        private $dat;
        private $obs;

        
        public function getNome(){
            return $this->nome;
        }

     
        public function setNome($nome){
            $this->nome = $nome;
        }

        
        public function getTelefone(){
            return $this->tel;
        }
       
        public function setTelefone($tel){
            $this->tel = $tel;
        }

        public function getOrigem(){
            return $this->ori;
        }

        public function setOrigem($ori){
            $this->ori = $ori;
        }

        public function getData(){
            return $this->dat;
        }

        public function setData($dat){
            $this->dat = $dat;
        }

        public function getObservacao(){
            return $this->obs;
        }

        public function setObservacao($obs){
            $this->obs = $obs;
        }

    }
?>