package persistens.database.infoparking;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistens.database.infoparking.CaracteristicasParqueaderos;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-14T20:37:52")
@StaticMetamodel(Caracteristicas.class)
public class Caracteristicas_ { 

    public static volatile SingularAttribute<Caracteristicas, String> nombrecaracteristica;
    public static volatile CollectionAttribute<Caracteristicas, CaracteristicasParqueaderos> caracteristicasParqueaderosCollection;
    public static volatile SingularAttribute<Caracteristicas, BigDecimal> idcaracteristica;

}