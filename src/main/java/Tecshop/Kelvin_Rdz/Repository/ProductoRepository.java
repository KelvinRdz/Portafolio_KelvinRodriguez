package Tecshop.Kelvin_Rdz.Repository;

import Tecshop.Kelvin_Rdz.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    public List<Producto> findByActivoTrue();

}