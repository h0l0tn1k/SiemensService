package cz.siemens.inventory.controllers;

import cz.siemens.inventory.dao.GenericDao;
import cz.siemens.inventory.entity.DeviceType;
import cz.siemens.inventory.controllers.exceptions.ResourceAlreadyExistsException;
import cz.siemens.inventory.controllers.exceptions.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiUris.ROOT_URI_DEVICE_TYPE)
public class DeviceTypeController {

    private GenericDao<DeviceType> inventoryRecordDao;
    final static Logger logger = LoggerFactory.getLogger(DeviceTypeController.class);

    @Autowired
    public DeviceTypeController(GenericDao<DeviceType> inventoryRecordDao) {
        this.inventoryRecordDao = inventoryRecordDao;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public final List<DeviceType> findAll(){
        logger.info("findAll() called");
        return inventoryRecordDao.readAll();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public final DeviceType findById(@PathVariable("id") Long id) throws Exception {
        logger.info("findById({id}) called", id);
        try {
            return inventoryRecordDao.read(id);
        } catch(Exception ex) {
            throw new ResourceNotFoundException();
        }
    }

    @RequestMapping(value = "/create", method= RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public final void create(@RequestBody DeviceType deviceType) throws Exception {
        logger.info("create({deviceType}) called", deviceType.toString());
        try {
            inventoryRecordDao.create(deviceType);
        } catch(Exception ex) {
            throw new ResourceAlreadyExistsException();
        }
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public final void remove(@PathVariable("id") Long id) throws Exception {
        logger.info("remove({id}) called", id);
        try {
            inventoryRecordDao.delete(inventoryRecordDao.read(id));
        } catch (Exception ex) {
            throw new ResourceNotFoundException();
        }
    }
}