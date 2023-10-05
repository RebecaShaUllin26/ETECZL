<!doctype html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>pw0603</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <script src=" https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js "
        integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3 " crossorigin="anonymous ">
        </script>
</head>

<body>

    <div class="d-flex flex-column wrapper" >
        <nav class="navbar navbar-expand-lg  bg-lg  border-bottom shadow-sm mb-3" style="background-color: rgb(31, 87, 192);">
              <div class="container">
                         <a class="navbar-brand text-white" href="/">SISTEMA WEB</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                        data-bs-target=".navbar-collapse">
                         <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse">
                        <ul class="navbar-nav flex-grow-1">
                            <li class="nav-item">
                                 <a class="nav-link text-white active " href="/">Cadastrar</a>
                            </li>
                            <li class="nav-item">
                                 <a class="nav-link text-white" href="/index.html">Consultar</a>
                            </li>
                        </ul>
                     </div>
                </div>
        </nav>
        <div id="carouselExampleSlidesOnly" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-inner">
            </div>
        </div>
        <main class="flex-fill">
            <div class="container">
                <div class="texto">
                    <h1 style="color: #000000;"> Cadastrar - Agendamento de Potenciais Clientes</h1>
                  Sistema utilizado para agendamento de serviços
                </div>
                
                <form method="POST" action="testpessoa.php">

                          
                                <legenda> Nome: </legenda>
                                <div class=" form-floating mb-3 "  style="margin-top: 10px;">
                                    <input class=" form-control " type=" text " id=" nome " placeholder="  "
                                        autofocus name="nome"/>
                                    <label for=" txtNome ">  </label>
                                </div>
                                
                                <legenda> Telefone: </legenda>
                                <div class=" form-floating mb-3 "  style="margin-top: 10px;">
                                    <input class=" form-control " type=" text " id=" telefone " placeholder="  " autofocus name="telefone"/>
                                    <label for=" txtNome "> (xx)xxxxx-xxxx </label>
                                </div>
                     
                                <legenda> Origem: </legenda>
                                <select class="form-select form-select-lg mb-3" style="margin-top: 10px;" aria-label=".form-select-lg example" name="origem" id="origem">
                                    <option selected> Celular </option>
                                    <option value="1">One</option>
                                    <option value="2">Two</option>
                                    <option value="3">Three</option>
                                  </select>

                                <div class="mb-3">
                                    <label for="exampleFormControlInput1" class="form-label">Data:</label>
                                    <input type="date" class="form-control" id="data" placeholder="name@example.com" name="data">
                                  </div>
                                  <div class="mb-3">
                                    <label for="exampleFormControlTextarea1" class="form-label">Observação</label>
                                    <textarea class="form-control" id="observacao" name="observacao"rows="3"></textarea>
                                  </div>
                         
                            <div class="mb-3">    
                                <input  class="btn btn-lg btn-success" style="background-color: rgb(31, 87, 192);" type="submit" name="Cadastrar" value="Cadastrar">
                            </div>  
                </form>
            </div>
        </main>
    </div>

    </div>
</body>

</html>