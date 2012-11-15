package persistens.database.infoparking;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistens.database.infoparking.Reservas;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-14T23:28:48")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> nombre;
    public static volatile SingularAttribute<Usuarios, Character> genero;
    public static volatile SingularAttribute<Usuarios, BigDecimal> idusuario;
    public static volatile SingularAttribute<Usuarios, String> usuario;
    public static volatile SingularAttribute<Usuarios, BigInteger> edad;
    public static volatile CollectionAttribute<Usuarios, Reservas> reservasCollection;
    public static volatile SingularAttribute<Usuarios, String> clave;

}