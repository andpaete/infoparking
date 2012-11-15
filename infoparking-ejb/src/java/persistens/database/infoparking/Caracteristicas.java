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
@Table(name = "caracteristicas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Caracteristicas.findAll", query = "SELECT c FROM Caracteristicas c"),
    @NamedQuery(name = "Caracteristicas.findByIdcaracteristica", query = "SELECT c FROM Caracteristicas c WHERE c.idcaracteristica = :idcaracteristica"),
    @NamedQuery(name = "Caracteristicas.findByNombrecaracteristica", query = "SELECT c FROM Caracteristicas c WHERE c.nombrecaracteristica = :nombrecaracteristica")})
public class Caracteristicas implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcaracteristica")
    private BigDecimal idcaracteristica;
    @Size(max = 100)
    @Column(name = "nombrecaracteristica")
    private String nombrecaracteristica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "caracteristicas")
    private Collection<CaracteristicasParqueaderos> caracteristicasParqueaderosCollection;

    public Caracteristicas() {
    }

    public Caracteristicas(BigDecimal idcaracteristica) {
        this.idcaracteristica = idcaracteristica;
    }

    public BigDecimal getIdcaracteristica() {
        return idcaracteristica;
    }

    public void setIdcaracteristica(BigDecimal idcaracteristica) {
        this.idcaracteristica = idcaracteristica;
    }

    public String getNombrecaracteristica() {
        return nombrecaracteristica;
    }

    public void setNombrecaracteristica(String nombrecaracteristica) {
        this.nombrecaracteristica = nombrecaracteristica;
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
        hash += (idcaracteristica != null ? idcaracteristica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caracteristicas)) {
            return false;
        }
        Caracteristicas other = (Caracteristicas) object;
        if ((this.idcaracteristica == null && other.idcaracteristica != null) || (this.idcaracteristica != null && !this.idcaracteristica.equals(other.idcaracteristica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistens.database.infoparking.Caracteristicas[ idcaracteristica=" + idcaracteristica + " ]";
    }
    
}
