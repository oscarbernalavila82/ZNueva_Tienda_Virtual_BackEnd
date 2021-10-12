package nueva_Tienda_BackEnd.ZNueva_Tienda_BackEnd.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import nueva_Tienda_BackEnd.ZNueva_Tienda_BackEnd.model.Usuarios;

@Repository
public interface UsuariosDAO extends JpaRepository<Usuarios, Integer>{
	
	ArrayList<Usuarios> findByUsuarioAndPassword(String Usuario, String password);

	//ArrayList<Usuarios> findByCedula(int Cedula_usuario);

	//Optional<Usuarios> deleteByCedula_usuario(Long cedula_usuario);
	
	
}