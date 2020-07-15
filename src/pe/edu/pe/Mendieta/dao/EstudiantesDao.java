package pe.edu.pe.Mendieta.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.Mendieta.entity.Estudiantes;

public interface EstudiantesDao {
		public int create(Estudiantes u);
		public int update(Estudiantes u);
		public int delete(int id);
		public List<Map<String,Object>> read(int id);
		public List<Map<String,Object>> readAll();

	}


