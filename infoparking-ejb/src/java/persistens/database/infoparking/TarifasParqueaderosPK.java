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
public class TarifasParqueaderosPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_idparqueadero")
    private BigInteger codIdparqueadero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_idtarifa")
    private BigInteger codIdtarifa;

    public TarifasParqueaderosPK() {
    }

    public TarifasParqueaderosPK(BigInteger codIdparqueadero, BigInteger codIdtarifa) {
        this.codIdparqueadero = codIdparqueadero;
        this.codIdtarifa = codIdtarifa;
    }

    public BigInteger getCodIdparqueadero() {
        return codIdparqueadero;
    }

    public void setCodIdparqueadero(BigInteger codIdparqueadero) {
        this.codIdparqueadero = codIdparqueadero;
    }

    public BigInteger getCodIdtarifa() {
        return codIdtarifa;
    }

    public void setCodIdtarifa(BigInteger codIdtarifa) {
        this.codIdtarifa = codIdtarifa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codIdparqueadero != null ? codIdparqueadero.hashCode() : 0);
        hash += (codIdtarifa != null ? codIdtarifa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TarifasParqueaderosPK)) {
            return false;
        }
        TarifasParqueaderosPK other = (TarifasParqueaderosPK) object;
        if ((this.codIdparqueadero == null && other.codIdparqueadero != null) || (this.codIdparqueadero != null && !this.codIdparqueadero.equals(other.codIdparqueadero))) {
            return false;
        }
        if ((this.codIdtarifa == null && other.codIdtarifa != null) || (this.codIdtarifa != null && !this.codIdtarifa.equals(other.codIdtarifa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistens.database.infoparking.TarifasParqueaderosPK[ codIdparqueadero=" + codIdparqueadero + ", codIdtarifa=" + codIdtarifa + " ]";
    }
    
}
