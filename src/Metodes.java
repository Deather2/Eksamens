import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Metodes {
	public static void Sveiki() {
		String name;
		do{
    		name="";
    		name = (String) JOptionPane.showInputDialog(null, "Kāds ir Jūsu vārds?", "Iepazīšanos", JOptionPane.DEFAULT_OPTION,null, null, "Jūsu vārds");
    		}while(name == null||!name.matches("[a-zA-Z]+")||name.length()<3);
		JOptionPane.showMessageDialog(null, "Sveiki, "+name+", šeit ir tests no 10 jautājumiem par tēmu \"Cikls ar priekšnosacījumu programmēšanas valodā Java\".", "Apsveikums", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Es uzdošu Jums 10 jautājumus. Katrā jautājumā būs 4 atbilžu varianti, bet pareizais ir tikai viens. Veiksmi!", "Noteikumi", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static ImageIcon resizeImage(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image resizedImage = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
	
	public static void beigasLabs(int x) {
		ImageIcon icon = new ImageIcon("kubok.png");
		icon = Metodes.resizeImage(icon, 200, 200);
		JOptionPane.showMessageDialog(null, "Jūms ir "+x+" pareizas atbildes!", "Apsveicu!",JOptionPane.INFORMATION_MESSAGE,icon);
	}
	
	public static void beigasSlikts(int x) {
		ImageIcon icon = new ImageIcon("sad.png");
		icon = Metodes.resizeImage(icon, 200, 200);
		JOptionPane.showMessageDialog(null, "Jūms ir "+x+" pareizas atbildes. Jums vēl vajag trenēties.", "Varētu labāk!",JOptionPane.INFORMATION_MESSAGE,icon);
	}
}
