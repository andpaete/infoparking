/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistens.database.infoparking;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dpineda
 */
@Entity
@Table(name = "reservas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservas.findAll", query = "SELECT r FROM Reservas r"),
    @NamedQuery(name = "Reservas.findByLocalizacionOrigen", query = "SELECT r FROM Reservas r WHERE r.localizacionOrigen = :localizacionOrigen"),
    @NamedQuery(name = "Reservas.findByLocalizacionDestino", query = "SELECT r FROM Reservas r WHERE r.localizacionDestino = :localizacionDestino"),
    @NamedQuery(name = "Reservas.findByLatOrigen", query = "SELECT r FROM Reservas r WHERE r.latOrigen = :latOrigen"),
    @NamedQuery(name = "Reservas.findByLatDestino", query = "SELECT r FROM Reservas r WHERE r.latDestino = :latDestino"),
    @NamedQuery(name = "Reservas.findByLongOrigen", query = "SELECT r FROM Reservas r WHERE r.longOrigen = :longOrigen"),
    @NamedQuery(name = "Reservas.findByLongDestino", query = "SELECT r FROM Reservas r WHERE r.longDestino = :longDestino"),
    @NamedQuery(name = "Reservas.findByFechaReserva", query = "SELECT r FROM Reservas r WHERE r.fechaReserva = :fechaReserva"),
    @NamedQuery(name = "Reservas.findByFechaInicio", query = "SELECT r FROM Reservas r WHERE r.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Reservas.findByFechaFin", query = "SELECT r FROM Reservas r WHERE r.fechaFin = :fechaFin"),
    @NamedQuery(name = "Reservas.findByIdreserva", query = "SELECT r FROM Reservas r WHERE r.idreserva = :idreserva")})
public class Reservas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 100)
    @Column(name = "localizacion_origen")
    private String localizacionOrigen;
    @Size(max = 100)
    @Column(name = "localizacion_destino")
    private String localizacionDestino;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "lat_origen")
    private Float latOrigen;
    @Column(name = "lat_destino")
    private Float latDestino;
    @Column(name = "long_origen")
    private Float longOrigen;
    @Column(name = "long_destino")
    private Float longDestino;
    @Column(name = "fecha_reserva")
    @Temporal(TemporalType.DATE)
    private Date fechaReserva;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idreserva")
    private BigDecimal idreserva;
    @JoinColumn(name = "cod_idvehiculo", referencedColumnName = "idvehiculo")
    @ManyToOne
    private Vehiculos codIdvehiculo;
    @JoinColumn(name = "cod_idusuario", referencedColumnName = "idusuario")
    @ManyToOne
    private Usuarios codIdusuario;
    @JoinColumn(name = "cod_idparqueadero", referencedColumnName = "idparqueadero")
    @ManyToOne
    private Parqueaderos codIdparqueadero;

    public Reservas() {
    }

    public Reservas(BigDecimal idreserva) {
        this.idreserva = idreserva;
    }

    public String getLocalizacionOrigen() {
        return localizacionOrigen;
    }

    public void setLocalizacionOrigen(String localizacionOrigen) {
        this.localizacionOrigen = localizacionOrigen;
    }

    public String getLocalizacionDestino() {
        return localizacionDestino;
    }

    public void setLocalizacionDestino(String localizacionDestino) {
        this.localizacionDestino = localizacionDestino;
    }

    public Float getLatOrigen() {
        return latOrigen;
    }

    public void setLatOrigen(Float latOrigen) {
        this.latOrigen = latOrigen;
    }

    public Float getLatDestino() {
        return latDestino;
    }

    public void setLatDestino(Float latDestino) {
        this.latDestino = latDestino;
    }

    public Float getLongOrigen() {
        return longOrigen;
    }

    public void setLongOrigen(Float longOrigen) {
        this.longOrigen = longOrigen;
    }

    public Float getLongDestino() {
        return longDestino;
    }

    public void setLongDestino(Float longDestino) {
        this.longDestino = longDestino;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public BigDecimal getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(BigDecimal idreserva) {
        this.idreserva = idreserva;
    }

    public Vehiculos getCodIdvehiculo() {
        return codIdvehiculo;
    }

    public void setCodIdvehiculo(Vehiculos codIdvehiculo) {
        this.codIdvehiculo = codIdvehiculo;
    }

    public Usuarios getCodIdusuario() {
        return codIdusuario;
    }

    public void setCodIdusuario(Usuarios codIdusuario) {
        this.codIdusuario = codIdusuario;
    }

    public Parqueaderos getCodIdparqueadero() {
        return codIdparqueadero;
    }

    public void setCodIdparqueadero(Parqueaderos codIdparqueadero) {
        this.codIdparqueadero = codIdparqueadero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreserva != null ? idreserva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservas)) {
            return false;
        }
        Reservas other = (Reservas) object;
        if ((this.idreserva == null && other.idreserva != null) || (this.idreserva != null && !this.idreserva.equals(other.idreserva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistens.database.infoparking.Reservas[ idreserva=" + idreserva + " ]";
    }
    
}
