package systethings;

import java.util.Locale;

public class SystemLanguage {

    public static void main(String[] args) {
        Locale sistema = Locale.getDefault();
        
        String languageName = sistema.getDisplayLanguage();

        System.out.println("The default language of your system is: " + languageName);
    }
}