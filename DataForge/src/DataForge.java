
import Interfaz.Interfaz;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class DataForge {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new HiFiLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
        }
        
        Interfaz menPrincipal = new Interfaz();
        menPrincipal.setVisible(true);
        menPrincipal.setLocationRelativeTo(null);

        analizadores("src/Analizadores/", "Lexer.jflex", "Parser.cup");
    }

    public static void analizadores(String ruta, String jflexFile, String cupFile) {
        try {
            String opcionesJflex[] = {ruta + jflexFile, "-d", ruta};
            jflex.Main.generate(opcionesJflex);

            String opcionesCup[] = {"-destdir", ruta, "-parser", "Parser", ruta + cupFile};
            java_cup.Main.main(opcionesCup);

        } catch (Exception e) {
            System.out.println("No se ha podido generar los analizadores");
            System.out.println(e);
        }
    }
}
