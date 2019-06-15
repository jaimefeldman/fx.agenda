package cl.jimix.modelo;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

/**
 * @author Jaime Feldman
 * @ 
 *
 */
public class Person {

	private final StringProperty			nombre;
	private final StringProperty			apellido;
	private final IntegerProperty			edad;
	private final ObjectProperty<LocalDate> fechaNaciminto;
	private final StringProperty 			signoZodiacal;
	private final StringProperty 			asendenteZodiacal;
	private final StringProperty 			paisResidencia;
	private final StringProperty 			ciudadResidencia;
	private final StringProperty 			direccionResidencia;
	private final StringProperty 			codigoPostal;

	
	// Constructor designado.
	public Person(StringProperty nombre, 
				  StringProperty apellido, 
				  IntegerProperty edad,
				  ObjectProperty<LocalDate> fechaNaciminto, 
				  StringProperty signoZodiacal, 
				  StringProperty asendenteZodiacal,
				  StringProperty paisResidencia, 
				  StringProperty ciudadResidencia, 
				  StringProperty direccionResidencia,
				  StringProperty codigoPostal) 
	{
		super();
		this.nombre 			= nombre;
		this.apellido 			= apellido;
		this.edad 				= edad;
		this.fechaNaciminto 	= fechaNaciminto;
		this.signoZodiacal 		= signoZodiacal;
		this.asendenteZodiacal 	= asendenteZodiacal;
		this.paisResidencia 	= paisResidencia;
		this.ciudadResidencia 	= ciudadResidencia;
		this.direccionResidencia= direccionResidencia;
		this.codigoPostal 		= codigoPostal;
	}

	public Person() {
		
		super();
		this.nombre 			= null;
		this.apellido 			= null;
		this.edad 				= null;
		this.fechaNaciminto 	= null;
		this.signoZodiacal 		= null;
		this.asendenteZodiacal 	= null;
		this.paisResidencia 	= null;
		this.ciudadResidencia 	= null;
		this.direccionResidencia= null;
		this.codigoPostal 		= null;
	}

	// Getters //
	public String getNombre() {
		return this.nombre.get();
	}
	
	public String getApellido() {
		return this.apellido.get();
	}
	
	public Integer getEdad() {
		return this.edad.get();
	}
	
	public LocalDate getFechaNacimiento() {
		return this.fechaNaciminto.get();
	}

	public String getSignoZodiaco() {
		return this.signoZodiacal.get();
	}
	
	public String getAsendenteZodiacal() {
		return this.asendenteZodiacal.get();
	}
	
	public String getPaisResidencia() {
		return this.paisResidencia.get();
	}
	
	public String getCiudadResidencia() {
		return this.ciudadResidencia.get();
	}
	
	public String getDireccionResidencia() {
		return this.direccionResidencia.get();
	}
	
	public String getCodigoPostal() {
		return this.codigoPostal.get();
	}
	// End Getters //

	// Setters    //
	public void setNombre(String nombre) {
		this.nombre.set(nombre);
	}

	public void setApellido(String apellido) {
		this.apellido.set(apellido);
	}
	
	public void setEdad(Integer edad) {
		this.edad.set(edad);
	}
	
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNaciminto.set(fechaNacimiento);
	}

	public void setSignoZodiaco(String signoZodiaco) {
		this.signoZodiacal.set(signoZodiaco);
	}
	
	public void setAsendenteZodiacal(String asendenteZodiacal) {
		this.asendenteZodiacal.set(asendenteZodiacal);
	}
	
	public void setPaisResidencia(String paisResidencia) {
		this.paisResidencia.set(paisResidencia);
	}
	
	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia.set(ciudadResidencia);
	}
	
	public void setDireccionResidencia(String direccionResidencia) {
		this.direccionResidencia.set(direccionResidencia);
	}
	
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal.set(codigoPostal);
	}
	
	// End Setters //
	
	// Get Properties //
	public StringProperty nombreProperty() {
		return this.nombre;
	}
	
	public StringProperty apellidoProperty() {
		return this.apellido;
	}
	
	public IntegerProperty edadProperty() {
		return this.edad;
	}
	
	public ObjectProperty<LocalDate > fechaNacimientoProperty() {
		return this.fechaNaciminto;
	}

	public StringProperty signoZodiacoProperty() {
		return this.signoZodiacal;
	}
	
	public StringProperty asendenteZodiacalProperty() {
		return this.asendenteZodiacal;
	}
	
	public StringProperty paisResidenciaProperty() {
		return this.paisResidencia;
	}
	
	public StringProperty ciudadResidenciaProperty() {
		return this.ciudadResidencia;
	}
	
	public StringProperty direccionResidenciaProperty() {
		return this.direccionResidencia;
	}
	
	public StringProperty codigoPostalProperty() {
		return this.codigoPostal;
	}
}

