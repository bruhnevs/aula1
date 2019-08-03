package aula0208;

import java.time.Duration;
import java.time.Instant;

public class DatasTimes {
	public static void main(String[] args) {
	Instant inicio = Instant.now();
	
	try {
		Thread.sleep(1000); //fazer o processador esperar
	} catch (InterruptedException e){
		//TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Instant fim = Instant.now();

	Duration duracao = Duration.between(inicio, fim);

	System.out.println("Duracao em nanos segundos" + duracao.toNanos());
	System.out.println("Duracao em nanos minutos" + duracao.toMinutes());
	System.out.println("Duracao em nanos horas" + duracao.toHours());
	System.out.println("Duracao em nanos milisegundos" + duracao.toMillis());
	System.out.println("Duracao em nanos dias" + duracao.toDays());
	}
}