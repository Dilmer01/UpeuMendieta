package pe.edu.pe.upeu.Mendieta;

import com.google.gson.Gson;

import pe.edu.pe.Mendieta.dao.EscuelaDao;
import pe.edu.pe.Mendieta.dao.EstudiantesDao;
import pe.edu.upeu.Mendieta.daoImp.EscuelaDaoImp;
import pe.edu.upeu.Mendieta.daoImp.EstudiantesDaoImp;
import pe.edu.upeu.Mendieta.utils.Conexion;

public class Test {
	private static EstudiantesDao pd = new EstudiantesDaoImp();
	private static Gson g = new Gson();
	private static EscuelaDao es = new EscuelaDaoImp();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//conex();
		listarP();
		//ListaC();
		
 }
	
	static void conex() {
		  if(Conexion.getConexion()!=null) {
			  System.out.println("Conectado");
		  }else {
			 System.out.println("Desconectado"); 
		  }	  
	  }
	

static void listarP() {
  System.out.println(g.toJson(pd.readAll()));
}

}
