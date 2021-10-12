package nueva_Tienda_BackEnd.ZNueva_Tienda_BackEnd.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.persistence.Query;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nueva_Tienda_BackEnd.ZNueva_Tienda_BackEnd.DAO.ProveedoresDAO;
import nueva_Tienda_BackEnd.ZNueva_Tienda_BackEnd.model.Proveedores;

@RestController
@RequestMapping("proveedores")
public class ProveedoresAPI {
	
	@Autowired
	private ProveedoresDAO ProveedoresDAO;
	
	@PostMapping("/guardar")
	public void registrarProveedor(@RequestBody Proveedores proveedores) {
		ProveedoresDAO.save(proveedores);
	}

	
	
	

}



