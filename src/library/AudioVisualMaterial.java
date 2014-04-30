/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

import java.applet.AudioClip;
import java.awt.Image;
import javax.sound.sampled.Clip;

/**
 * Audio and visual material Class
 *
 * @author Kou Xiong
 */
public class AudioVisualMaterial extends LibraryMaterial
{
    
    protected String avType;
    protected Image avCover;
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
     * @param _avType AudioVisual type
     * @param _avCover AudioVisual cover
     * @param _avSound AudioVisual sound clip
     */
    public AudioVisualMaterial (String _avType, Image _avCover, Clip _avSound)
    {
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
    public Image displayCover ()
    {
        return avCover;
    }
    
    /**
     * Sets the cover of the audio and visual material.
     * @param _cover the cover image
     */
    public void setCover (Image _cover)
    {
        avCover = _cover;
    }
    
    /**
     * Plays the audio and visual material sound clip.
     */
    @Override
    public void playSound ()
    {
        avSound.start();
    }
    
    /**
     * Sets the sound of the audio and visual material.
     * @param _sound the sound clip
     */
    @Override
    public void setSound (Clip _sound)
    {
        avSound = _sound;
    }
    
    /**
     * Displays the audio and visual material info.
     */
    @Override
    public String displayInfo ()
    {
        return ("Title: " + getTitle() + "\n\nAuthor: " + getAuthor() + "\n\nYear: " + getYear());
    }
    
}
