package persistens.database.infoparking;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistens.database.infoparking.TarifasParqueaderos;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-14T20:37:52")
@StaticMetamodel(Tarifas.class)
public class Tarifas_ { 

    public static volatile SingularAttribute<Tarifas, BigDecimal> idtarifa;
    public static volatile CollectionAttribute<Tarifas, TarifasParqueaderos> tarifasParqueaderosCollection;
    public static volatile SingularAttribute<Tarifas, String> tipotarifa;

}