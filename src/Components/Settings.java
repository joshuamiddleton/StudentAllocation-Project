
package components;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Settings {
    private FileWriter fw;
    private BufferedWriter bw;
    private final String path = "C:\\Users\\Necro\\Desktop\\settings.txt";
    private int none;
    
    public Settings(int none){
        none = this.none;
    }
    
    public void condenseSettings(int groupSize){
        try {
            File file = new File(path);
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            
            System.out.println(groupSize);
            bw.write("Group Size: " + groupSize);
            
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
