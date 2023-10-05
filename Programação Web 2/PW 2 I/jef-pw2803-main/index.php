<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario</title>
</head>
<body style="background-color: grey;">
    <div class="container" style="background-color: white; padding: 0;">
        <header>
    <html lang="pt-br">
        <head>
                <meta charset="utf-8">
                <meta name="viewport" content="width=device-width, initial-scale=1">
                <title>pw0603</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
                integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        </head>
         
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
                                        <a class="nav-link text-white active " href="index.php">Cadastrar</a>
                                    </li>
                                    <li class="nav-item">
                                     <a class="nav-link text-white" href="consultar.php">Consultar</a>
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
                    
                    <form method="POST" action="teste.class.php">
                              
                     <legenda> Nome: </legenda>
                     <div class=" form-floating mb-3 "  style="margin-top: 10px;">
                     <input class=" form-control " type="text" id=" txtNome " placeholder="  "
                     autofocus name="nome"/>
                     <label for=" txtNome ">  </label>
                    </div>
                                    
                   <legenda> Telefone: </legenda>
                    <div class=" form-floating mb-3 "  style="margin-top: 10px;">
                    <input class=" form-control " type="number" id=" txtNome " placeholder="  " autofocus name="telefone"/>
                     <label for=" txtNome "> (xx)xxxxx-xxxx </label>
                 </div>
                         
                  <legenda> Origem: </legenda>
                     <select class="form-select form-select-lg mb-3" style="margin-top: 10px;" aria-label=".form-select-lg example" name="origem">
                      <option selected> Celular </option>
                      <option value="1">One</option>
                      <option value="2">Two</option>
                      <option value="3">Three</option>
                          </select>
                     <div class="mb-3">
                     <label for="exampleFormControlInput1" class="form-label">Data do contato</label>
                        <input type="date" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com" name="data">
                     </div>
                        <div class="mb-3">
                          <label for="exampleFormControlTextarea1" class="form-label">Observação</label>
                            <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="observacao"></textarea>
                     </div> 
                         <div class=" mb-3 text-left ">
                             <input style="background-color: rgb(31, 87, 192);" type="submit" value="Cadastrar" class=" btn btn-lg btn-success "
>
                          </div>
                    </form>
                </div>
            </main>
        </div>
    
        </div>
        <script src=" https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js "
          integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3 " crossorigin="anonymous ">
           </script>
</body>
</html>