
package GameCode;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.ImageIcon;

public class Sounds extends Resources{
	protected Object loadResource(URL url) { 
		return Applet.newAudioClip(url);
	}
    protected Object loadResourceImages(URL url) {
        ImageIcon tujuan = new ImageIcon(url);
		return tujuan.getImage();
	}
	public AudioClip getAudioClip(String name) {
	  return (AudioClip)getResource(name);
	}
	public void playSound(final String name) {
		 new Thread(
       new Runnable() {
       	public void run() {
			    getAudioClip(name).play();
       	}
       }
		 ).start();
	}

	public void loopSound(final String name) {
		new Thread(
	  new Runnable() {
	   public void run() {
			   getAudioClip(name).loop();
	   }
	  }
		).start();	}
}
