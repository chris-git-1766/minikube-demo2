package at.htlkaindorf.repository;

import at.htlkaindorf.entity.Vehicle;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VehicleRepository  implements PanacheRepository<Vehicle> {


}
