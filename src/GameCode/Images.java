package GameCode;

import java.applet.Applet;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Images extends Resources{

	protected Object loadResource(URL url) {
		return Applet.newAudioClip(url);
	}
    protected Object loadResourceImages(URL url) {
        ImageIcon tujuan = new ImageIcon(url);
		return tujuan.getImage();
	}
	public Image getImages(String name) {
	  return (Image)getResourceImage(name);
	}

}
