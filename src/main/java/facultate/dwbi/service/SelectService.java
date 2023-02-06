package facultate.dwbi.service;

import facultate.dwbi.model.Driver;
import facultate.dwbi.repository.DriverRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectService {

    private static Logger logger = LoggerFactory.getLogger(SelectService.class);
    private final DriverRepository driverRepository;

    public SelectService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    public List<Driver> getDrivers() {
        logger.error("FIRST NAME: ");
        return driverRepository.findAll();
    }
}
