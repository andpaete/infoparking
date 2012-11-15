/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistens.database.infoparking;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dpineda
 */
@Entity
@Table(name = "perfiles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Perfiles.findAll", query = "SELECT p FROM Perfiles p"),
    @NamedQuery(name = "Perfiles.findByIdperfiles", query = "SELECT p FROM Perfiles p WHERE p.idperfiles = :idperfiles"),
    @NamedQuery(name = "Perfiles.findByNombreperfil", query = "SELECT p FROM Perfiles p WHERE p.nombreperfil = :nombreperfil")})
public class Perfiles implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idperfiles")
    private BigDecimal idperfiles;
    @Size(max = 20)
    @Column(name = "nombreperfil")
    private String nombreperfil;

    public Perfiles() {
    }

    public Perfiles(BigDecimal idperfiles) {
        this.idperfiles = idperfiles;
    }

    public BigDecimal getIdperfiles() {
        return idperfiles;
    }

    public void setIdperfiles(BigDecimal idperfiles) {
        this.idperfiles = idperfiles;
    }

    public String getNombreperfil() {
        return nombreperfil;
    }

    public void setNombreperfil(String nombreperfil) {
        this.nombreperfil = nombreperfil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idperfiles != null ? idperfiles.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Perfiles)) {
            return false;
        }
        Perfiles other = (Perfiles) object;
        if ((this.idperfiles == null && other.idperfiles != null) || (this.idperfiles != null && !this.idperfiles.equals(other.idperfiles))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistens.database.infoparking.Perfiles[ idperfiles=" + idperfiles + " ]";
    }
    
}
