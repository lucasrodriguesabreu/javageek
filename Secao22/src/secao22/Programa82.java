package secao22;
//Datas
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Programa82 {
    public static void main(String[] args) {
        
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje); //Formato ISO (Internacional)
        
        LocalDate ano_novo = LocalDate.of(2020, Month.JANUARY, 1);
        System.out.println(ano_novo); //Formato ISO (Internacional)
        
        int ano = ano_novo.getYear();
        Month mes = ano_novo.getMonth();
        int dia = ano_novo.getDayOfMonth();
        System.out.println("O ano novo será em " + dia + " de " + mes + " de " + ano);
        
        Period periodo = Period.between(hoje, ano_novo);
        System.out.println(periodo);
        
        System.out.println("Faltam " + periodo.getYears() + " anos " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias para o Ano Novo!");
        
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(hoje.format(formatador));
        
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora); //Formato ISO (Internacional)
        
        DateTimeFormatter formatador_horas = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(agora.format(formatador_horas));
        
        LocalTime intervalo = LocalTime.of(9, 30);
        System.out.println(intervalo);
    }
}