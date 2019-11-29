<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    import ="cadastro.*"
    %>
    
<!DOCTYPE html>
<html>
<head>

<title>Cadastro</title>
<link href="css\estilo.css" rel="stylesheet" type="text/css">
<link href="../bootstrap/css/" rel="stylesheet" type="text/css">
</head>
<body>
<div class="top">
		<ul>
			<li class="aba"><a href="">Inicio</a></li>
			<li class="aba"><a href="">Estoque</a></li>
			<li class="aba"><a href="">Fonecedores</a></li>
			<li class="aba"><a href="cadastro.html">Clientes</a></li>
			<li class="aba"><a href="">Contatos</a></li>
		</ul>
	</div>
	
	<div class="principal"><h1>SISTEMA DE CADASTRO DE CLIENTE</h1></div>
<div class="bloco">
	<form	action="relatorio.jsp" method="post">
				<div class="box">
					<input	 type="text"	name="nome"	required=""/>
					<label>Nome</label>																				
				</div>
				<div class="box">
					<input	 type="text"	name="email" required=""/>	
					<label>Email</label>																				
				</div>
				<div class="box">
					<input	 type="text"	name="endereco" required=""/>
					<label>Endereco</label>																				
				</div>
				<div class="box">
					<input	class="box" type="text"	name="dataNascimento" required=""/>
					<label>Data Nascimento</label>	
				</div>
				<div class="box">										
				<input	class="bnt" type="submit"	value="Salvar"/>
				</div>																
	</form>
</div>

</body>
</html>