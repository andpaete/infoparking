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
@Table(name = "caracteristicas_parqueaderos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CaracteristicasParqueaderos.findAll", query = "SELECT c FROM CaracteristicasParqueaderos c"),
    @NamedQuery(name = "CaracteristicasParqueaderos.findByCodIdcaracteristica", query = "SELECT c FROM CaracteristicasParqueaderos c WHERE c.caracteristicasParqueaderosPK.codIdcaracteristica = :codIdcaracteristica"),
    @NamedQuery(name = "CaracteristicasParqueaderos.findByCodIdparqueadero", query = "SELECT c FROM CaracteristicasParqueaderos c WHERE c.caracteristicasParqueaderosPK.codIdparqueadero = :codIdparqueadero"),
    @NamedQuery(name = "CaracteristicasParqueaderos.findByAplica", query = "SELECT c FROM CaracteristicasParqueaderos c WHERE c.aplica = :aplica")})
public class CaracteristicasParqueaderos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CaracteristicasParqueaderosPK caracteristicasParqueaderosPK;
    @Column(name = "aplica")
    private Character aplica;
    @JoinColumn(name = "cod_idparqueadero", referencedColumnName = "idparqueadero", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Parqueaderos parqueaderos;
    @JoinColumn(name = "cod_idcaracteristica", referencedColumnName = "idcaracteristica", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Caracteristicas caracteristicas;

    public CaracteristicasParqueaderos() {
    }

    public CaracteristicasParqueaderos(CaracteristicasParqueaderosPK caracteristicasParqueaderosPK) {
        this.caracteristicasParqueaderosPK = caracteristicasParqueaderosPK;
    }

    public CaracteristicasParqueaderos(BigInteger codIdcaracteristica, BigInteger codIdparqueadero) {
        this.caracteristicasParqueaderosPK = new CaracteristicasParqueaderosPK(codIdcaracteristica, codIdparqueadero);
    }

    public CaracteristicasParqueaderosPK getCaracteristicasParqueaderosPK() {
        return caracteristicasParqueaderosPK;
    }

    public void setCaracteristicasParqueaderosPK(CaracteristicasParqueaderosPK caracteristicasParqueaderosPK) {
        this.caracteristicasParqueaderosPK = caracteristicasParqueaderosPK;
    }

    public Character getAplica() {
        return aplica;
    }

    public void setAplica(Character aplica) {
        this.aplica = aplica;
    }

    public Parqueaderos getParqueaderos() {
        return parqueaderos;
    }

    public void setParqueaderos(Parqueaderos parqueaderos) {
        this.parqueaderos = parqueaderos;
    }

    public Caracteristicas getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(Caracteristicas caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (caracteristicasParqueaderosPK != null ? caracteristicasParqueaderosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CaracteristicasParqueaderos)) {
            return false;
        }
        CaracteristicasParqueaderos other = (CaracteristicasParqueaderos) object;
        if ((this.caracteristicasParqueaderosPK == null && other.caracteristicasParqueaderosPK != null) || (this.caracteristicasParqueaderosPK != null && !this.caracteristicasParqueaderosPK.equals(other.caracteristicasParqueaderosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistens.database.infoparking.CaracteristicasParqueaderos[ caracteristicasParqueaderosPK=" + caracteristicasParqueaderosPK + " ]";
    }
    
}
