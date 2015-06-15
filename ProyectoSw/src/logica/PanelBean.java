package logica;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "panelbean")
@ViewScoped
public class PanelBean implements Serializable{
	private boolean collapsed;
	
	public PanelBean() {
		collapsed = true;
	}

	public boolean isCollapsed() {
		return collapsed;
	}

	public void setCollapsed(boolean collapsed) {
		this.collapsed = collapsed;
	}
	

}
