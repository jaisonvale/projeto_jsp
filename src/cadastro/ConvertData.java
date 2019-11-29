package cadastro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class ConvertData {
	Calendar dataNascimento;
	public Calendar converter(String dataEmTexto) {
	try	{																						
		Date	date	=  new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
		this.dataNascimento	=	Calendar.getInstance();	
		this.dataNascimento.setTime(date);	
		}	catch	(ParseException	e)	{
			System.out.println("Erro	de	conversão	da	data");
						
		}
	
	return dataNascimento;
	}
}
