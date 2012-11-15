package persistens.database.infoparking;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistens.database.infoparking.Parqueaderos;
import persistens.database.infoparking.Usuarios;
import persistens.database.infoparking.Vehiculos;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-14T23:28:48")
@StaticMetamodel(Reservas.class)
public class Reservas_ { 

    public static volatile SingularAttribute<Reservas, Vehiculos> codIdvehiculo;
    public static volatile SingularAttribute<Reservas, Date> fechaReserva;
    public static volatile SingularAttribute<Reservas, BigDecimal> idreserva;
    public static volatile SingularAttribute<Reservas, Date> fechaFin;
    public static volatile SingularAttribute<Reservas, String> localizacionDestino;
    public static volatile SingularAttribute<Reservas, Usuarios> codIdusuario;
    public static volatile SingularAttribute<Reservas, Float> latOrigen;
    public static volatile SingularAttribute<Reservas, Float> longOrigen;
    public static volatile SingularAttribute<Reservas, Float> longDestino;
    public static volatile SingularAttribute<Reservas, Parqueaderos> codIdparqueadero;
    public static volatile SingularAttribute<Reservas, Float> latDestino;
    public static volatile SingularAttribute<Reservas, String> localizacionOrigen;
    public static volatile SingularAttribute<Reservas, Date> fechaInicio;

}