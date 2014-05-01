/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

import javax.sound.sampled.Clip;
import javax.swing.Icon;

/**
 * Audio and visual material Class
 * Concept #8: Polymorphism
 * Concept #3: Protected Visibility Modifier
 * @author Kou Xiong
 */
public class AudioVisualMaterial extends LibraryMaterial
{
    
    protected String avType;
    protected Icon avCover;
    protected Clip avSound;
    
    /**
     * Default audio and visual material constructor.
     * 
     */
    public AudioVisualMaterial ()
    {
        
    }
    
    /**
     * Audio and visual material constructor.
     * 
     * Concept #5: Super reference
     * 
     * @param author Author/artist/studio
     * @param title Title
     * @param price Price
     * @param year Year released
     * @param _avType AudioVisual type
     * @param _avCover AudioVisual cover
     * @param _avSound AudioVisual sound clip
     */
    public AudioVisualMaterial (String author, String title, double price, int year, String _avType, Icon _avCover, Clip _avSound)
    {
        super (author, title, price, year);
        avType = _avType;
        avCover = _avCover;
        avSound = _avSound;
    }
    
    /**
     * Gets the type of audio and visual material.
     * @return a string specifying the type of material
     */
    public String getType ()
    {
        return avType;
    }
    
    /**
     * Sets the type of audio and visual material.
     * @param _type the type of material
     */
    public void setType (String _type)
    {
        avType = _type;
    }
    
    /**
     * Displays the audio and visual materials cover. 
     * @return an image of the audio and visual material
     */
    public Icon displayCover ()
    {
        return avCover;
    }
    
    /**
     * Sets the cover of the audio and visual material.
     * @param _cover the cover image
     */
    public void setCover (Icon _cover)
    {
        avCover = _cover;
    }
    
    /**
     * Plays the audio and visual material sound clip.
     */
        public void playSound ()
    {
        avSound.start();
    }
        
        /**
         * Stops the audio from playing
         */
        public void stopSound()
    {
        if(avSound != null){
            avSound.stop();
            avSound.flush();
            avSound.close();
        }
    }
    
    /**
     * Sets the sound of the audio and visual material.
     * @param _sound the sound clip
     */
        public void setSound (Clip _sound)
    {
        avSound = _sound;
    }
    
    /**
     * Displays the audio and visual material info.
     * Concept #6 Method Override
     * @return String for results
     */
    @Override
    public String displayInfo ()
    {
        return ("Title: " + getTitle() + "\n\nAuthor: " + getAuthor() + "\n\nPrice: " + getPrice() + "\n\nYear: " + getYear());
    }
    
}
