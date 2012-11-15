/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistens.database.infoparking;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author dpineda
 */
@Embeddable
public class CaracteristicasParqueaderosPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_idcaracteristica")
    private BigInteger codIdcaracteristica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_idparqueadero")
    private BigInteger codIdparqueadero;

    public CaracteristicasParqueaderosPK() {
    }

    public CaracteristicasParqueaderosPK(BigInteger codIdcaracteristica, BigInteger codIdparqueadero) {
        this.codIdcaracteristica = codIdcaracteristica;
        this.codIdparqueadero = codIdparqueadero;
    }

    public BigInteger getCodIdcaracteristica() {
        return codIdcaracteristica;
    }

    public void setCodIdcaracteristica(BigInteger codIdcaracteristica) {
        this.codIdcaracteristica = codIdcaracteristica;
    }

    public BigInteger getCodIdparqueadero() {
        return codIdparqueadero;
    }

    public void setCodIdparqueadero(BigInteger codIdparqueadero) {
        this.codIdparqueadero = codIdparqueadero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codIdcaracteristica != null ? codIdcaracteristica.hashCode() : 0);
        hash += (codIdparqueadero != null ? codIdparqueadero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CaracteristicasParqueaderosPK)) {
            return false;
        }
        CaracteristicasParqueaderosPK other = (CaracteristicasParqueaderosPK) object;
        if ((this.codIdcaracteristica == null && other.codIdcaracteristica != null) || (this.codIdcaracteristica != null && !this.codIdcaracteristica.equals(other.codIdcaracteristica))) {
            return false;
        }
        if ((this.codIdparqueadero == null && other.codIdparqueadero != null) || (this.codIdparqueadero != null && !this.codIdparqueadero.equals(other.codIdparqueadero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistens.database.infoparking.CaracteristicasParqueaderosPK[ codIdcaracteristica=" + codIdcaracteristica + ", codIdparqueadero=" + codIdparqueadero + " ]";
    }
    
}
