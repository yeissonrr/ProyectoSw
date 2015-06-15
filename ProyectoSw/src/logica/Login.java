package logica;

import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean(name = "login")
@ViewScoped
@RequestScoped
public class Login {
	private String usuario;
	private String contrasenia;
	private final HttpServletRequest httpServletRequest;
	private final FacesContext facesContext;
	private FacesMessage facesMessage;
	private ConexionBD bd;

	public Login() {
		facesContext = FacesContext.getCurrentInstance();
		httpServletRequest = (HttpServletRequest) facesContext
				.getExternalContext().getRequest();

	}

	public String conexionLogin(String nick, String pass){
			ArrayList<String> nicknames = new ArrayList<String>();
			ArrayList<String> contraseñas = new ArrayList<String>();
			String sql = "select nick_usuarion, contraseña_usuarion from usuarios";
			Statement comando;
			try {
				comando = bd.getConexion().createStatement();
				ResultSet registro;
				registro = comando.executeQuery(sql);

				while (registro.next()) {
					
					nicknames.add(registro.getString(1));
					contraseñas.add(registro.getString(2));
					for (int i = 0; i < nicknames.size(); i++) {
						if (nicknames.get(i).equals(nick) && contraseñas.get(i).equals(pass)) {
							httpServletRequest.getSession().setAttribute("SesionUsuario", usuario);
							facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Acceso correcto", null);
							facesContext.addMessage(null, facesMessage);
							return "accesso";
						}
						else {
							facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario o contraseña incorrectos", null);
							facesContext.addMessage(null, facesMessage);
							return "index";
						}
							
					}
					
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			return "";
		}

}
