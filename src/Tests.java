import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Tests {

	public static void main(String[] args) {
		Metodes.Sveiki();
		boolean spelet = true;
		String izvele = "";
		do {
			int x = 0;
		 String[] questions = {
				 "Kas ir cikls?",
					"Cik cikli ir kopā Javā?",
					"Kas ir cikls ar priekšnosacījumu?",
					"Cik reizes nostrādās cikls while?",
					"Kur atrodas cikla nosacījums?",
					"Kas jāraksta, lai cikls darbojas bezgalīgi?",
					"Kurš operators tiek izmantots, lai pārtrauktu while ciklu?",
					"Kāds būs šāda koda rezultāts? \n\nint x = 10; \nwhile (x > 0) { \nSystem.out.print(x + \" \"); \nx -= 2; \n}",
					"Kurš operators tiek izmantots, lai turpinātu nākamās while cikla iterācijas izpildi?",
					"Cik reizes šis kods drukā \"Hello\"? \n\nint n = 5; \nwhile (n > 0) { \nSystem.out.println(\"Hello\"); \nn--; \n}",
					"Kas notiek, ja nosacījums while ciklā vienmēr ir patiess?",
					"Kāda ir sintakse, kuru izmanto while cikls Java?",
					"Kāds būs šāda koda rezultāts? \n\nint m = 10; \nwhile (m >= 0) { \nSystem.out.print(m + \" \"); \nm -= 2; \n}",
					"Kāds būs šāda koda rezultāts? \n\nint n = 1; \nwhile (n <= 3) { \nSystem.out.print(n * n + \" \"); \nn++; \n}",
					"Cik reizes minimāli nostrādās cikls while?"
		        };

		        // Массив правильных ответов (индексы правильных ответов)
		        int[] correctAnswers = {
		            0,1,2,0,3,3,1,1,2,0,2,1,2,1,3
		        };

		        // Массив вариантов ответов
		        String[][] answers = {
		            {"Process, kurā kāda darbība tiek veikta vairākkārtigi","Tas ir veids, kā izveidot grafiskos elementus Java",
						"Funkcija, kas veic matemātiskas darbības", "Šis ir atslēgvārds objektu izveidei Java"},
		            {"1","3","2","4"},
		            {"do...while", "for", "while", "if...else"},
		            {"Nav zināms", "1 reizi", "3 reizes", "Bezgalīgi"},
		            {"Tam nav nekādu nosacījumu", "Cikla beigās", "Cikla vidū", "Cikla sākumā"},
		            {"while(True)", "while(false)", "while(False)", "while(true)"},
		            {"continue;", "break;", "return;", "false;"},
		            {"8 6 4 2 0", "10 8 6 4 2", "10 8 6 4", "8 6 4"},
		            {"return;", "break;", "continue;", "false;"},
		            {"5", "4", "6", "1"},
		            {"Programma nestartēs", "Cikls izstrādās 100 reizes", "Cikls strādās bezgalīgi", "Cikls nedarbosies"},
		            {"while {nosacījums} () {}", "while (nosacījums) {}", "while [nosacījums] {}", "while {nosacījums} [] {}"},
		            {"8 6 4 2 0", "8 6 4 2 0 -2", "10 8 6 4 2 0", "10 8 6"},
		            {"1 4 9 16", "1 4 9", "1 4 7", "4 9 16"},
		            {"3", "2", "1", "0"}
		        };

		        // Создаем список из номеров вопросов и перемешиваем его
		        ArrayList<Integer> questionNumbers = new ArrayList<>();
		        for (int i = 0; i < questions.length; i++) {
		            questionNumbers.add(i);
		        }
		        Collections.shuffle(questionNumbers);

		        // Берем первые 10 вопросов
		        int numQuestions = 10;
		        for (int i = 0; i < numQuestions; i++) {
		            int qIndex = questionNumbers.get(i);
		            String question = questions[qIndex];
		            String[] options = answers[qIndex];

		            // Выводим вопрос и варианты ответа с использованием JOptionPane
		            String userAnswer = (String) JOptionPane.showInputDialog(
		                null,
		                question,
		                "Jautājums " + (i + 1),
		                JOptionPane.QUESTION_MESSAGE,
		                null,
		                options,
		                options[0]
		            );

		            // Проверяем правильный ли ответ
		            int correctIndex = correctAnswers[qIndex];
		            if (userAnswer != null && userAnswer.equals(options[correctIndex])) {
		                x++;
		            } else {
		                //сохранять в файл
		            }
		            
		            
		        }
		        if(x>5)
		        Metodes.beigasLabs(x);
		        else
		        Metodes.beigasSlikts(x); 
		        do{
		    		izvele = (String)JOptionPane.showInputDialog(null, "Vai spēlēsiet atkal? J/N","Vēl viena iespēja!" , JOptionPane.DEFAULT_OPTION,null, null, "J");
		    		}while(izvele != null && !izvele.equalsIgnoreCase("J") && !izvele.equalsIgnoreCase("N"));
		        if(izvele.equalsIgnoreCase("N"))
		        	spelet=false;
		}while(spelet==true);
	}

}
