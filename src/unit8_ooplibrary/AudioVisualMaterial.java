

package unit8_ooplibrary;

import java.math.BigDecimal;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;

/**
 *
 * @author John Mambo <john.mambo@gmail.com>
 */
public class AudioVisualMaterial extends LibraryMaterial{
   
    public enum AudioVisualType{
        AUDIOTAPE(1),
        CD(2), 
        DVD(3);
        
        private final int val;

        private AudioVisualType(int val){
            this.val = val;
        }
        
        /**
         * This method returns the Ordinal position of the Level enumerable value property.
         * @return {@code int} Corresponding ordinal position of the Level enumerable property. 
         */
        public int index(){
            return val;
        }
    }
    
    private AudioVisualType type;
    private ImageIcon coverImage;
    private Clip soundClip;
    
    public AudioVisualMaterial() {
        super();
    }
    
    public AudioVisualMaterial(AudioVisualType type, ImageIcon coverImage, Clip soundClip) {
        super();
        this.type = type;
        this.coverImage = coverImage;
        this.soundClip = soundClip;
    }
    
    public AudioVisualMaterial(String author, String title, BigDecimal price, short publicationYear, AudioVisualType type, ImageIcon coverImage, Clip soundClip) {
        super(author, title, price, publicationYear, coverImage);
        this.type = type;
        this.coverImage = coverImage;
        this.soundClip = soundClip;
    }
    
    public AudioVisualType getType() {
        return this.type;
    }

    public void setType(AudioVisualType type) {
        this.type = type;
    }

    public Clip getSoundClip() {
        return this.soundClip;
    }

    public void setSoundClip(Clip soundClip) {
        this.soundClip = soundClip;
    }

    @Override
    public ImageIcon getCoverImage() {
        if (this.coverImage != null) {
            return this.coverImage;
        }
        return super.getCoverImage();
    }
    
    @Override
    public void setCoverImage(ImageIcon coverImage) {
        super.setCoverImage(coverImage);
        this.coverImage = coverImage;
    }
}
