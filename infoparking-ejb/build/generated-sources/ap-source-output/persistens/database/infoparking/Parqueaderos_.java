package persistens.database.infoparking;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistens.database.infoparking.CaracteristicasParqueaderos;
import persistens.database.infoparking.Reservas;
import persistens.database.infoparking.TarifasParqueaderos;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-14T20:17:54")
@StaticMetamodel(Parqueaderos.class)
public class Parqueaderos_ { 

    public static volatile SingularAttribute<Parqueaderos, String> nombre;
    public static volatile SingularAttribute<Parqueaderos, String> direccion;
    public static volatile CollectionAttribute<Parqueaderos, TarifasParqueaderos> tarifasParqueaderosCollection;
    public static volatile SingularAttribute<Parqueaderos, BigInteger> cupos;
    public static volatile SingularAttribute<Parqueaderos, BigInteger> disponibilidad;
    public static volatile SingularAttribute<Parqueaderos, BigDecimal> idparqueadero;
    public static volatile SingularAttribute<Parqueaderos, String> nit;
    public static volatile SingularAttribute<Parqueaderos, BigInteger> telefono;
    public static volatile CollectionAttribute<Parqueaderos, Reservas> reservasCollection;
    public static volatile CollectionAttribute<Parqueaderos, CaracteristicasParqueaderos> caracteristicasParqueaderosCollection;

}