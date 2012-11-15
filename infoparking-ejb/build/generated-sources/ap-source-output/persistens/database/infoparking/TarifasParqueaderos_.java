package persistens.database.infoparking;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistens.database.infoparking.Parqueaderos;
import persistens.database.infoparking.Tarifas;
import persistens.database.infoparking.TarifasParqueaderosPK;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-14T20:17:54")
@StaticMetamodel(TarifasParqueaderos.class)
public class TarifasParqueaderos_ { 

    public static volatile SingularAttribute<TarifasParqueaderos, Character> tipoVehiculo;
    public static volatile SingularAttribute<TarifasParqueaderos, Tarifas> tarifas;
    public static volatile SingularAttribute<TarifasParqueaderos, Parqueaderos> parqueaderos;
    public static volatile SingularAttribute<TarifasParqueaderos, BigInteger> valor;
    public static volatile SingularAttribute<TarifasParqueaderos, TarifasParqueaderosPK> tarifasParqueaderosPK;

}