/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistens.database.infoparking;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author dpineda
 */
@Entity
@Table(name = "parqueaderos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parqueaderos.findAll", query = "SELECT p FROM Parqueaderos p"),
    @NamedQuery(name = "Parqueaderos.findByIdparqueadero", query = "SELECT p FROM Parqueaderos p WHERE p.idparqueadero = :idparqueadero"),
    @NamedQuery(name = "Parqueaderos.findByNombre", query = "SELECT p FROM Parqueaderos p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Parqueaderos.findByDireccion", query = "SELECT p FROM Parqueaderos p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Parqueaderos.findByTelefono", query = "SELECT p FROM Parqueaderos p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "Parqueaderos.findByCupos", query = "SELECT p FROM Parqueaderos p WHERE p.cupos = :cupos"),
    @NamedQuery(name = "Parqueaderos.findByDisponibilidad", query = "SELECT p FROM Parqueaderos p WHERE p.disponibilidad = :disponibilidad"),
    @NamedQuery(name = "Parqueaderos.findByNit", query = "SELECT p FROM Parqueaderos p WHERE p.nit = :nit")})
public class Parqueaderos implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idparqueadero")
    private BigDecimal idparqueadero;
    @Size(max = 200)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 200)
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private BigInteger telefono;
    @Column(name = "cupos")
    private BigInteger cupos;
    @Column(name = "disponibilidad")
    private BigInteger disponibilidad;
    @Size(max = 20)
    @Column(name = "nit")
    private String nit;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parqueaderos")
    private Collection<TarifasParqueaderos> tarifasParqueaderosCollection;
    @OneToMany(mappedBy = "codIdparqueadero")
    private Collection<Reservas> reservasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parqueaderos")
    private Collection<CaracteristicasParqueaderos> caracteristicasParqueaderosCollection;

    public Parqueaderos() {
    }

    public Parqueaderos(BigDecimal idparqueadero) {
        this.idparqueadero = idparqueadero;
    }

    public BigDecimal getIdparqueadero() {
        return idparqueadero;
    }

    public void setIdparqueadero(BigDecimal idparqueadero) {
        this.idparqueadero = idparqueadero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public BigInteger getTelefono() {
        return telefono;
    }

    public void setTelefono(BigInteger telefono) {
        this.telefono = telefono;
    }

    public BigInteger getCupos() {
        return cupos;
    }

    public void setCupos(BigInteger cupos) {
        this.cupos = cupos;
    }

    public BigInteger getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(BigInteger disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @XmlTransient
    public Collection<TarifasParqueaderos> getTarifasParqueaderosCollection() {
        return tarifasParqueaderosCollection;
    }

    public void setTarifasParqueaderosCollection(Collection<TarifasParqueaderos> tarifasParqueaderosCollection) {
        this.tarifasParqueaderosCollection = tarifasParqueaderosCollection;
    }

    @XmlTransient
    public Collection<Reservas> getReservasCollection() {
        return reservasCollection;
    }

    public void setReservasCollection(Collection<Reservas> reservasCollection) {
        this.reservasCollection = reservasCollection;
    }

    @XmlTransient
    public Collection<CaracteristicasParqueaderos> getCaracteristicasParqueaderosCollection() {
        return caracteristicasParqueaderosCollection;
    }

    public void setCaracteristicasParqueaderosCollection(Collection<CaracteristicasParqueaderos> caracteristicasParqueaderosCollection) {
        this.caracteristicasParqueaderosCollection = caracteristicasParqueaderosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idparqueadero != null ? idparqueadero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parqueaderos)) {
            return false;
        }
        Parqueaderos other = (Parqueaderos) object;
        if ((this.idparqueadero == null && other.idparqueadero != null) || (this.idparqueadero != null && !this.idparqueadero.equals(other.idparqueadero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistens.database.infoparking.Parqueaderos[ idparqueadero=" + idparqueadero + " ]";
    }
    
}
