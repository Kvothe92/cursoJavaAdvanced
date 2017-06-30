

package friday;

import java.io.File;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Songs {
    public static void main(String[] args) throws UnsupportedAudioFileException{
        Songs.open(AudioSystem.getAudioInputStream(new File
        ("C:\\Users\CC-04\Desktop\Brms\Clocks.wav"));
        
        AudioFileFormat.Type[] tipos = AudioSystem.getAudioFileTypes();
        
        for (AudioFileFormat.Type tipo : tipos)
            System.out.println(tipo.getExtension());
    }
    
}
