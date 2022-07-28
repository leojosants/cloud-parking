package dio.digitalinnovationone.parking.controller;

import dio.digitalinnovationone.parking.model.Parking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    @GetMapping
    public List<Parking> findAll() {
        var parking = new Parking();
        parking.setColor("Preto");
        parking.setLicense("MMSS-1111");
        parking.setModel("VW GOL");
        parking.setStage("SP");

        return Arrays.asList(parking);
    }

}