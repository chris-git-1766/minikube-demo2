package at.htlkaindorf.repository;

import at.htlkaindorf.entity.Vehicle;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest //Eigene Quarkus Instnace wird gestartet, damit kann ein Dev-Quarkus (im Terminal) weiterlaufen
class VehicleRepositoryTest {
    @Inject
    VehicleRepository vehicleRepository;
 /*
    @Test
    @Transactional //JDBC: DB-Connextion automatisch aus Pool und gibt nach Test wieder zu
   void createRecordSmokeTest() {
        var myCar = new Vehicle("Opel", "Kadett"); //var schaut rechts nach, welcher Datentype (wie ein Interface
        vehicleRepository.persist(myCar);
    } */

}

