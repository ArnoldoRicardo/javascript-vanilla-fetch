package mx.sisu.challengeajax.ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponses;
import com.wordnik.swagger.annotations.ApiResponse;


import mx.sisu.challengeajax.dto.Ciudad;
import mx.sisu.challengeajax.dto.DatosUsuario;
import mx.sisu.challengeajax.dto.Estado;
import mx.sisu.challengeajax.dto.Pais;

@RestController
@RequestMapping("/servicio")
@Api(value = "main", description = "La API principal del usuario")
public class PrincipalWebService {

	//Lista de paises
	List<Pais> paises = new ArrayList<>();
	//Lista de ciudades
	List<Ciudad> ciudades = new ArrayList<>();
	//Lista de estados
	List<Estado> estados = new ArrayList<>();
	
	
	//Inicialización
	@PostConstruct
	public void init(){
		paises.add(new Pais(1, "México"));
		paises.add(new Pais(2, "Estados Unidos"));
		paises.add(new Pais(3, "Canadá"));
		
		estados.add(new Estado(1, 1, "Chihuahua"));
		estados.add(new Estado(2, 1, "Nayarit"));
		estados.add(new Estado(3, 2, "Ohio"));
		estados.add(new Estado(4, 2, "Texas"));
		estados.add(new Estado(5, 3, "Manitoba"));
		estados.add(new Estado(6, 3, "Alberta"));
		
		
		ciudades.add(new Ciudad(1, 1, "Juárez"));
		ciudades.add(new Ciudad(2, 1, "Chihuahua"));
		ciudades.add(new Ciudad(3, 2, "La palma"));
		ciudades.add(new Ciudad(4, 2, "Tepic"));
		ciudades.add(new Ciudad(5, 3, "Columbus"));
		ciudades.add(new Ciudad(6, 3, "Springfield"));
		ciudades.add(new Ciudad(7, 4, "San Antonio"));
		ciudades.add(new Ciudad(8, 4, "Austin"));
		ciudades.add(new Ciudad(9, 5, "Winnipeg"));
		ciudades.add(new Ciudad(10, 5, "Winkler"));
		ciudades.add(new Ciudad(11, 6, "Lacombe"));
		ciudades.add(new Ciudad(12, 6, "Calgary"));

	}
	

    @ApiOperation(value = "Obtener los países", notes = "Obtiene los países como un arreglo de objetos JSON. ")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK") })
	@CrossOrigin(origins="*")
	@RequestMapping(value="/paises", method=RequestMethod.GET)
	public ResponseEntity<List<Pais>> obtenerPaises(){
		return new ResponseEntity<List<Pais>>(paises, HttpStatus.OK);
	}
	

    @ApiOperation(value = "Obtener los estados de un país", notes = "Obtiene los estados de un país como un arreglo de objetos JSON. Se le debe de pasar en el mensaje únicamente el identificador del país.")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK") })
	@CrossOrigin(origins="*")
	@RequestMapping(value="/estados", method=RequestMethod.POST)
	public ResponseEntity<List<Estado>> obtenerEstados(@RequestBody @Valid Integer paisId){
		List<Estado> resultado = new ArrayList<>();
		for (Estado estado : estados) {
			if(paisId == estado.getPaisId()){
				resultado.add(estado);
			}
		}
		return new ResponseEntity<List<Estado>>(resultado, HttpStatus.OK);
	}

    @ApiOperation(value = "Obtener las ciudades de un estado", notes = "Obtiene las ciudades de un estado como un arreglo de objetos JSON. Se le debe de pasar en el mensaje únicamente el identificador del estado.")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK") })
	@CrossOrigin(origins="*")
	@RequestMapping(value="/ciudades", method=RequestMethod.POST)
	public ResponseEntity<List<Ciudad>> obtenerEstado(@RequestBody @Valid Integer estadoId){
		List<Ciudad> resultado = new ArrayList<>();
		for (Ciudad ciudad : ciudades) {
			if(estadoId == ciudad.getEstadoId()){
				resultado.add(ciudad);
			}
		}
		return new ResponseEntity<List<Ciudad>>(resultado, HttpStatus.OK);
	}
	
    @ApiOperation(value = "Guardar usuario", notes = "Guarda el usuario, indicando su edad, el identificador de la ciudad y su nombre. La edad y el identificador deben de pasarse como enteros, el nombre como string. Ver ejemplo.")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 400, message = "Objeto JSON malformado") })
	@CrossOrigin(origins="*")
	@RequestMapping(value="/guardar", method=RequestMethod.POST)
	public ResponseEntity<Map<String, String>> obtenerEstado(@RequestBody @Valid DatosUsuario datos, BindingResult bindingResult){
		if (bindingResult.hasErrors()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
		System.out.println(datos);
		Map<String, String> resultado = new HashMap<>();
		resultado.put("resultado", "Usuario creado");
		return new ResponseEntity<Map<String, String>>(resultado,HttpStatus.OK);
	}
	
	
	
}
