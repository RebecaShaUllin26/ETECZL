<?php


if(isset($_POST['Bolsonaro'])){
    $votacao = fopen("voto.txt", "a");
    fwrite($votacao, $_POST['Bolsonaro'] . "\n");
    fclose($votacao); 
}else if(isset($_POST['Lula'])){
    $votacao = fopen("voto.txt", "a");
    fwrite($votacao, $_POST['Lula'] . "\n");
    fclose($votacao); 
}

    function Resultado(){
        $votacao = "voto.txt";
        $voto = fopen($votacao , "r");
        $totalDeVotos = fread($voto , filesize($votacao));

		$votacaoLula = 0;
        $votacaoBolsonaro = 0;

        $votacaoLula = substr_count($totalDeVotos , "Lula");
        $votacaoBolsonaro = substr_count($totalDeVotos , "Bolsonaro");


		if($votacaoBolsonaro > $votacaoLula){
			echo "<p>Bolsonaro tem: " . $votacaoBolsonaro . " votos.</p>";
			echo "<p>Lula tem: " . $votacaoLula . " votos.</p>";
			echo "<p>Bolsonaro venceu a votação!</p>";
		}else if($votacaoLula > $votacaoBolsonaro){
			echo "<p>Lula tem:" . $votacaoLula . " votos.</p>";
			echo "<p>Bolsonaro tem: " . $votacaoBolsonaro . " votos.</p>";
			echo "<p>Lula venceu a votação!</p>";
		}else if($votacaoLula == $votacaoBolsonaro){
			if($votacaoLula == 1){
				echo "<p>Bolsonaro tem: " . $votacaoBolsonaro . " voto.</p>";
				echo "<p>Lula tem: " . $votacaoLula . " voto.</p>";
				echo "<p>Empate entre Bolsonaro e Lula.</p>";
 			}else if($votacaoLula > 1){
				echo "<p>Bolsonaro está com: " . $votacaoBolsonaro . " votos.</p>";
				echo "<p>Lula está com: " . $votacaoLula . " votos.</p>";
				echo "<p>Empate entre Bolsonaro e Lula.</p>";
			}
		}
	}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container text-center">
        <form method="POST" action="">
            <div class="row">
                <div class="col">
                    <h1> Votação <h1><br>
                </div>
            </div>
            <div class="row">     
                <div class="col">
                    <img src="img/Lula.jpg" alt=""><br>
                    <input type="submit" name="Lula" id="Lula" value="Lula"><br>
                </div> 
                <div class="col">
                    <img src="img/bozo.jpg" alt=""><br>
                    <input type="submit" name="Bolsonaro" id="Bolsonaro" value="Bolsonaro"><br>
                </div>   
            </div>  
        </form>    
        <form action="resultado.php">
            <div class="row">
                <div class="col">
                    <input type="submit" name="Registrar" id="Registrar" value="resultado">
                </div>
            </div>    
        </form>
    </div>        
</body>
</html>


