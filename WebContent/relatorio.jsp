<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    import ="cadastro.*,
    java.util.*, 
    java.util.Calendar, 
    java.util.Date,
    java.io.PrintWriter, 
    java.text.ParseException, 
    java.text.SimpleDateFormat, 
    java.io.IOException,  
    java.util.ArrayList, 
    java.util.List,
    java.util.GregorianCalendar, 
    java.text.ParseException,
    java.text.SimpleDateFormat"

    %>
<!DOCTYPE html>
<html>
<head>

<title>Relatorio</title>

<link href="css/estilotable.css" rel="stylesheet" type="text/css">

</head>
<body>
	<% Dados dados = new Dados();
		
	String nome = request.getParameter("nome");
	String email = request.getParameter("email");
	String endereco = request.getParameter("endereco");
	String dataEmTexto = request.getParameter("dataNascimento");

	ConvertData data = new ConvertData();
	
	dados.setNome(nome);
	dados.setEmail(email);
	dados.setEndereco(endereco);
	dados.setDataNascimento(data.converter(dataEmTexto));
	
	CadastroDao dao = new CadastroDao();
	
	dao.adiciona(dados);
	%>

	<%
	List<Dados>	dado	=	dao.getLista();%>
	
	<h4>RELATORIO DE DADOS CADASTRADOS</h4>
	<table id="estilotable"> 
							<thead>
								<tr>
									<th class="id" >id</th>
									<th class="box">Nome</th>
									<th class="box">Email</th>
									<th class="box">Endereco</th>
									<th class="box">Data Nascimeto</th>
								</tr>
							</thead>
							</table>
				<%for (Dados dado1 : dado	)	{ %>				
					<%SimpleDateFormat formato = new SimpleDateFormat(); %>
					
							<table id="estilotable"> 
					
							<tr> 
							<td class="id"><%=dado1.getId()%></td>
							<td class="box"><%=dado1.getNome()%></td>
							<td class="box"><%=dado1.getEmail()%></td>
							<td class="box"><%=dado1.getEndereco()%></td>
							<td class="box"><%out.print(formato.format(dado1.getDataNascimento().getTimeInMillis()));%></td>
							</tr>
							</tbody>
							</table>			
				<%}%>  
</body>
</html>