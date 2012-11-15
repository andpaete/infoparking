/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistens.database.infoparking;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dpineda
 */
@Entity
@Table(name = "tarifas_parqueaderos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TarifasParqueaderos.findAll", query = "SELECT t FROM TarifasParqueaderos t"),
    @NamedQuery(name = "TarifasParqueaderos.findByCodIdparqueadero", query = "SELECT t FROM TarifasParqueaderos t WHERE t.tarifasParqueaderosPK.codIdparqueadero = :codIdparqueadero"),
    @NamedQuery(name = "TarifasParqueaderos.findByCodIdtarifa", query = "SELECT t FROM TarifasParqueaderos t WHERE t.tarifasParqueaderosPK.codIdtarifa = :codIdtarifa"),
    @NamedQuery(name = "TarifasParqueaderos.findByValor", query = "SELECT t FROM TarifasParqueaderos t WHERE t.valor = :valor"),
    @NamedQuery(name = "TarifasParqueaderos.findByTipoVehiculo", query = "SELECT t FROM TarifasParqueaderos t WHERE t.tipoVehiculo = :tipoVehiculo")})
public class TarifasParqueaderos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TarifasParqueaderosPK tarifasParqueaderosPK;
    @Column(name = "valor")
    private BigInteger valor;
    @Column(name = "tipo_vehiculo")
    private Character tipoVehiculo;
    @JoinColumn(name = "cod_idtarifa", referencedColumnName = "idtarifa", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Tarifas tarifas;
    @JoinColumn(name = "cod_idparqueadero", referencedColumnName = "idparqueadero", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Parqueaderos parqueaderos;

    public TarifasParqueaderos() {
    }

    public TarifasParqueaderos(TarifasParqueaderosPK tarifasParqueaderosPK) {
        this.tarifasParqueaderosPK = tarifasParqueaderosPK;
    }

    public TarifasParqueaderos(BigInteger codIdparqueadero, BigInteger codIdtarifa) {
        this.tarifasParqueaderosPK = new TarifasParqueaderosPK(codIdparqueadero, codIdtarifa);
    }

    public TarifasParqueaderosPK getTarifasParqueaderosPK() {
        return tarifasParqueaderosPK;
    }

    public void setTarifasParqueaderosPK(TarifasParqueaderosPK tarifasParqueaderosPK) {
        this.tarifasParqueaderosPK = tarifasParqueaderosPK;
    }

    public BigInteger getValor() {
        return valor;
    }

    public void setValor(BigInteger valor) {
        this.valor = valor;
    }

    public Character getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(Character tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public Tarifas getTarifas() {
        return tarifas;
    }

    public void setTarifas(Tarifas tarifas) {
        this.tarifas = tarifas;
    }

    public Parqueaderos getParqueaderos() {
        return parqueaderos;
    }

    public void setParqueaderos(Parqueaderos parqueaderos) {
        this.parqueaderos = parqueaderos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tarifasParqueaderosPK != null ? tarifasParqueaderosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TarifasParqueaderos)) {
            return false;
        }
        TarifasParqueaderos other = (TarifasParqueaderos) object;
        if ((this.tarifasParqueaderosPK == null && other.tarifasParqueaderosPK != null) || (this.tarifasParqueaderosPK != null && !this.tarifasParqueaderosPK.equals(other.tarifasParqueaderosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistens.database.infoparking.TarifasParqueaderos[ tarifasParqueaderosPK=" + tarifasParqueaderosPK + " ]";
    }
    
}
