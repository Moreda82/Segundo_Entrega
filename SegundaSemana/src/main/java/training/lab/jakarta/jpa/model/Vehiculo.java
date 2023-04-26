package training.lab.jakarta.jpa.model;

import jakarta.persistence.*;

@Entity //Esta anotación es la clase entidad que va a persistir, representa una tabla de datos relacional
@Table(name = "Vehiculo")// tabla que representa la clase entidad
public class Vehiculo {
	
	@Id //representa la PK de la tabla
	
	@SequenceGenerator(  //con esta anotación le indicamos que el ID se genera secuencialmente y
			             //comienza en 100
            name = "Vehiculo",
            sequenceName = "Id",
            allocationSize = 1,
            initialValue = 100
    )
    @GeneratedValue(  
            strategy = GenerationType.SEQUENCE,
            generator = "Vehiculo"
    )
	//Indicamos que los atributos son una columna
	private int  Id;
	@Column 
	private String nombre;
	@Column
	private String modelo;
	@Column
	private double precio;
	
	
	public Vehiculo(String nombre, String modelo, double precio) {
		super();
		this.nombre = nombre;
		this.modelo= modelo;
		this.precio=precio;
	
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Vehiculo [Id=" + Id + ", nombre=" + nombre + ", modelo=" + modelo + ", precio=" + precio + "]";
	}
	
	}
	

