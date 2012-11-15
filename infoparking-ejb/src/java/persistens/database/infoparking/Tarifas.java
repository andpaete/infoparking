/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistens.database.infoparking;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "tarifas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarifas.findAll", query = "SELECT t FROM Tarifas t"),
    @NamedQuery(name = "Tarifas.findByTipotarifa", query = "SELECT t FROM Tarifas t WHERE t.tipotarifa = :tipotarifa"),
    @NamedQuery(name = "Tarifas.findByIdtarifa", query = "SELECT t FROM Tarifas t WHERE t.idtarifa = :idtarifa")})
public class Tarifas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "tipotarifa")
    private String tipotarifa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtarifa")
    private BigDecimal idtarifa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tarifas")
    private Collection<TarifasParqueaderos> tarifasParqueaderosCollection;

    public Tarifas() {
    }

    public Tarifas(BigDecimal idtarifa) {
        this.idtarifa = idtarifa;
    }

    public String getTipotarifa() {
        return tipotarifa;
    }

    public void setTipotarifa(String tipotarifa) {
        this.tipotarifa = tipotarifa;
    }

    public BigDecimal getIdtarifa() {
        return idtarifa;
    }

    public void setIdtarifa(BigDecimal idtarifa) {
        this.idtarifa = idtarifa;
    }

    @XmlTransient
    public Collection<TarifasParqueaderos> getTarifasParqueaderosCollection() {
        return tarifasParqueaderosCollection;
    }

    public void setTarifasParqueaderosCollection(Collection<TarifasParqueaderos> tarifasParqueaderosCollection) {
        this.tarifasParqueaderosCollection = tarifasParqueaderosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtarifa != null ? idtarifa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarifas)) {
            return false;
        }
        Tarifas other = (Tarifas) object;
        if ((this.idtarifa == null && other.idtarifa != null) || (this.idtarifa != null && !this.idtarifa.equals(other.idtarifa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistens.database.infoparking.Tarifas[ idtarifa=" + idtarifa + " ]";
    }
    
}
