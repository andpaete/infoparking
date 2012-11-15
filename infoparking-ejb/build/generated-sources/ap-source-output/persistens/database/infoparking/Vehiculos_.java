package persistens.database.infoparking;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistens.database.infoparking.Reservas;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-14T20:17:54")
@StaticMetamodel(Vehiculos.class)
public class Vehiculos_ { 

    public static volatile SingularAttribute<Vehiculos, BigDecimal> idvehiculo;
    public static volatile SingularAttribute<Vehiculos, String> color;
    public static volatile SingularAttribute<Vehiculos, String> placa;
    public static volatile CollectionAttribute<Vehiculos, Reservas> reservasCollection;
    public static volatile SingularAttribute<Vehiculos, String> marca;

}