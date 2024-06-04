import javax.swing.JOptionPane;

public class Metodes {
	public static void Sveiki() {
		String name;
		do{
    		name="";
    		name = JOptionPane.showInputDialog(null, "Kāds ir Jūsu vārds?");
    		}while(name == null||!name.matches("[a-zA-Z]+")||name.length()<3);
		JOptionPane.showMessageDialog(null, "Sveiki, "+name+", šeit ir tests no 10 jautājumiem par tēmu \"Cikls ar priekšnosacījumu programmēšanas valodā Java\".", "Apsveikums", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Es uzdošu Jums 10 jautājumus. Katrā jautājumā būs 4 atbilžu varianti, bet pareizais ir tikai viens. Veiksmi!", "Noteikumi", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
