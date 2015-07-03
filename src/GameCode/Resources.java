

package GameCode;

import java.net.URL;
import java.util.HashMap;

public abstract class Resources {
	protected HashMap resources;

	public Resources() {
	  resources = new HashMap();
	}

	protected Object loadResource(String name) {
		URL url=null;
		url = getClass().getClassLoader().getResource(name);
		return loadResource(url);
	}

    protected Object loadResourceImages(String name) {
		URL url=null;
		url = getClass().getClassLoader().getResource(name);
		return loadResourceImages(url);
	}

	protected Object getResource(String name) {
		Object res = resources.get(name);
		if (res == null) {
			res = loadResource("resources/"+name);
			resources.put(name,res);
		}
		return res;
	}

    protected Object getResourceImage(String name) {
		Object res = resources.get(name);
		if (res == null) {
			res = loadResourceImages("Images/"+name);
			resources.put(name,res);
		}
		return res;
	}

	protected abstract Object loadResource(URL url);
    protected abstract Object loadResourceImages(URL url);

}
