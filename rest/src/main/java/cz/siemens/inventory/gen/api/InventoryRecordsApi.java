/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package cz.siemens.inventory.gen.api;

import cz.siemens.inventory.gen.model.Device;
import cz.siemens.inventory.gen.model.InventoryRecord;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Api(value = "inventory-records", description = "the inventory-records API")
public interface InventoryRecordsApi {

    Logger log = LoggerFactory.getLogger(InventoryRecordsApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Gets all Checked Devices", nickname = "getCheckedDevices", notes = "", response = Device.class, responseContainer = "List", tags={ "InventoryRecord", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All Checked Devices", response = Device.class, responseContainer = "List") })
    @RequestMapping(value = "/inventory-records/checked",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Device>> getCheckedDevices() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"deviceType\" : {    \"orderNumber\" : \"orderNumber\",    \"price\" : 2.027123023002322,    \"supplier\" : {      \"name\" : \"name\",      \"id\" : 3    },    \"objectTypeName\" : \"objectTypeName\",    \"id\" : 7,    \"classification\" : 9,    \"version\" : \"version\",    \"manufacturer\" : \"manufacturer\"  },  \"owner\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"flagWrite\" : true,    \"superiorFirstName\" : \"superiorFirstName\",    \"flagRead\" : true,    \"flagBorrow\" : true,    \"flagAdmin\" : true,    \"flagRevision\" : true,    \"id\" : 1,    \"flagInventory\" : true,    \"email\" : \"email\",    \"superiorLastName\" : \"superiorLastName\"  },  \"barcodeNumber\" : \"barcodeNumber\",  \"serialNumber\" : \"serialNumber\",  \"addDateString\" : \"addDateString\",  \"project\" : {    \"name\" : \"name\",    \"id\" : 4  },  \"holder\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"flagWrite\" : true,    \"superiorFirstName\" : \"superiorFirstName\",    \"flagRead\" : true,    \"flagBorrow\" : true,    \"flagAdmin\" : true,    \"flagRevision\" : true,    \"id\" : 1,    \"flagInventory\" : true,    \"email\" : \"email\",    \"superiorLastName\" : \"superiorLastName\"  },  \"companyOwner\" : {    \"name\" : \"name\",    \"id\" : 5  },  \"nstValue\" : \"nstValue\",  \"inventoryRecord\" : {    \"inventoryState\" : { },    \"id\" : 0  },  \"revision\" : {    \"revisionInterval\" : 1,    \"lastRevisionDateString\" : \"lastRevisionDateString\",    \"id\" : 7  },  \"inventoryNumber\" : \"inventoryNumber\",  \"comment\" : \"comment\",  \"id\" : 0,  \"deviceState\" : {    \"name\" : \"name\",    \"id\" : 2  },  \"department\" : {    \"name\" : \"name\",    \"id\" : 5  },  \"calibration\" : {    \"calibrationInterval\" : 1,    \"lastCalibrationDateString\" : \"lastCalibrationDateString\",    \"id\" : 6  },  \"defaultLocation\" : \"defaultLocation\"}, {  \"deviceType\" : {    \"orderNumber\" : \"orderNumber\",    \"price\" : 2.027123023002322,    \"supplier\" : {      \"name\" : \"name\",      \"id\" : 3    },    \"objectTypeName\" : \"objectTypeName\",    \"id\" : 7,    \"classification\" : 9,    \"version\" : \"version\",    \"manufacturer\" : \"manufacturer\"  },  \"owner\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"flagWrite\" : true,    \"superiorFirstName\" : \"superiorFirstName\",    \"flagRead\" : true,    \"flagBorrow\" : true,    \"flagAdmin\" : true,    \"flagRevision\" : true,    \"id\" : 1,    \"flagInventory\" : true,    \"email\" : \"email\",    \"superiorLastName\" : \"superiorLastName\"  },  \"barcodeNumber\" : \"barcodeNumber\",  \"serialNumber\" : \"serialNumber\",  \"addDateString\" : \"addDateString\",  \"project\" : {    \"name\" : \"name\",    \"id\" : 4  },  \"holder\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"flagWrite\" : true,    \"superiorFirstName\" : \"superiorFirstName\",    \"flagRead\" : true,    \"flagBorrow\" : true,    \"flagAdmin\" : true,    \"flagRevision\" : true,    \"id\" : 1,    \"flagInventory\" : true,    \"email\" : \"email\",    \"superiorLastName\" : \"superiorLastName\"  },  \"companyOwner\" : {    \"name\" : \"name\",    \"id\" : 5  },  \"nstValue\" : \"nstValue\",  \"inventoryRecord\" : {    \"inventoryState\" : { },    \"id\" : 0  },  \"revision\" : {    \"revisionInterval\" : 1,    \"lastRevisionDateString\" : \"lastRevisionDateString\",    \"id\" : 7  },  \"inventoryNumber\" : \"inventoryNumber\",  \"comment\" : \"comment\",  \"id\" : 0,  \"deviceState\" : {    \"name\" : \"name\",    \"id\" : 2  },  \"department\" : {    \"name\" : \"name\",    \"id\" : 5  },  \"calibration\" : {    \"calibrationInterval\" : 1,    \"lastCalibrationDateString\" : \"lastCalibrationDateString\",    \"id\" : 6  },  \"defaultLocation\" : \"defaultLocation\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default InventoryRecordsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Gets Inventory Record based on inventoryRecordId", nickname = "getInventoryRecord", notes = "", response = InventoryRecord.class, tags={ "InventoryRecord", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The Inventory Record", response = InventoryRecord.class),
        @ApiResponse(code = 404, message = "Requested Inventory Record does not exist.") })
    @RequestMapping(value = "/inventory-records/{inventoryRecordId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<InventoryRecord> getInventoryRecord(@ApiParam(value = "Inventory Record id to get",required=true) @PathVariable("inventoryRecordId") Long inventoryRecordId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"inventoryState\" : { },  \"id\" : 0}", InventoryRecord.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default InventoryRecordsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Gets all Inventory Records", nickname = "getInventoryRecords", notes = "", response = InventoryRecord.class, responseContainer = "List", tags={ "InventoryRecord", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All Inventory Records", response = InventoryRecord.class, responseContainer = "List") })
    @RequestMapping(value = "/inventory-records",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<InventoryRecord>> getInventoryRecords() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"inventoryState\" : { },  \"id\" : 0}, {  \"inventoryState\" : { },  \"id\" : 0} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default InventoryRecordsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Gets all Unchecked Devices", nickname = "getUncheckedDevices", notes = "", response = Device.class, responseContainer = "List", tags={ "InventoryRecord", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All Unchecked Devices", response = Device.class, responseContainer = "List") })
    @RequestMapping(value = "/inventory-records/unchecked",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Device>> getUncheckedDevices() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"deviceType\" : {    \"orderNumber\" : \"orderNumber\",    \"price\" : 2.027123023002322,    \"supplier\" : {      \"name\" : \"name\",      \"id\" : 3    },    \"objectTypeName\" : \"objectTypeName\",    \"id\" : 7,    \"classification\" : 9,    \"version\" : \"version\",    \"manufacturer\" : \"manufacturer\"  },  \"owner\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"flagWrite\" : true,    \"superiorFirstName\" : \"superiorFirstName\",    \"flagRead\" : true,    \"flagBorrow\" : true,    \"flagAdmin\" : true,    \"flagRevision\" : true,    \"id\" : 1,    \"flagInventory\" : true,    \"email\" : \"email\",    \"superiorLastName\" : \"superiorLastName\"  },  \"barcodeNumber\" : \"barcodeNumber\",  \"serialNumber\" : \"serialNumber\",  \"addDateString\" : \"addDateString\",  \"project\" : {    \"name\" : \"name\",    \"id\" : 4  },  \"holder\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"flagWrite\" : true,    \"superiorFirstName\" : \"superiorFirstName\",    \"flagRead\" : true,    \"flagBorrow\" : true,    \"flagAdmin\" : true,    \"flagRevision\" : true,    \"id\" : 1,    \"flagInventory\" : true,    \"email\" : \"email\",    \"superiorLastName\" : \"superiorLastName\"  },  \"companyOwner\" : {    \"name\" : \"name\",    \"id\" : 5  },  \"nstValue\" : \"nstValue\",  \"inventoryRecord\" : {    \"inventoryState\" : { },    \"id\" : 0  },  \"revision\" : {    \"revisionInterval\" : 1,    \"lastRevisionDateString\" : \"lastRevisionDateString\",    \"id\" : 7  },  \"inventoryNumber\" : \"inventoryNumber\",  \"comment\" : \"comment\",  \"id\" : 0,  \"deviceState\" : {    \"name\" : \"name\",    \"id\" : 2  },  \"department\" : {    \"name\" : \"name\",    \"id\" : 5  },  \"calibration\" : {    \"calibrationInterval\" : 1,    \"lastCalibrationDateString\" : \"lastCalibrationDateString\",    \"id\" : 6  },  \"defaultLocation\" : \"defaultLocation\"}, {  \"deviceType\" : {    \"orderNumber\" : \"orderNumber\",    \"price\" : 2.027123023002322,    \"supplier\" : {      \"name\" : \"name\",      \"id\" : 3    },    \"objectTypeName\" : \"objectTypeName\",    \"id\" : 7,    \"classification\" : 9,    \"version\" : \"version\",    \"manufacturer\" : \"manufacturer\"  },  \"owner\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"flagWrite\" : true,    \"superiorFirstName\" : \"superiorFirstName\",    \"flagRead\" : true,    \"flagBorrow\" : true,    \"flagAdmin\" : true,    \"flagRevision\" : true,    \"id\" : 1,    \"flagInventory\" : true,    \"email\" : \"email\",    \"superiorLastName\" : \"superiorLastName\"  },  \"barcodeNumber\" : \"barcodeNumber\",  \"serialNumber\" : \"serialNumber\",  \"addDateString\" : \"addDateString\",  \"project\" : {    \"name\" : \"name\",    \"id\" : 4  },  \"holder\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"flagWrite\" : true,    \"superiorFirstName\" : \"superiorFirstName\",    \"flagRead\" : true,    \"flagBorrow\" : true,    \"flagAdmin\" : true,    \"flagRevision\" : true,    \"id\" : 1,    \"flagInventory\" : true,    \"email\" : \"email\",    \"superiorLastName\" : \"superiorLastName\"  },  \"companyOwner\" : {    \"name\" : \"name\",    \"id\" : 5  },  \"nstValue\" : \"nstValue\",  \"inventoryRecord\" : {    \"inventoryState\" : { },    \"id\" : 0  },  \"revision\" : {    \"revisionInterval\" : 1,    \"lastRevisionDateString\" : \"lastRevisionDateString\",    \"id\" : 7  },  \"inventoryNumber\" : \"inventoryNumber\",  \"comment\" : \"comment\",  \"id\" : 0,  \"deviceState\" : {    \"name\" : \"name\",    \"id\" : 2  },  \"department\" : {    \"name\" : \"name\",    \"id\" : 5  },  \"calibration\" : {    \"calibrationInterval\" : 1,    \"lastCalibrationDateString\" : \"lastCalibrationDateString\",    \"id\" : 6  },  \"defaultLocation\" : \"defaultLocation\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default InventoryRecordsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Updates an Inventory Record", nickname = "updateInventoryRecord", notes = "", response = InventoryRecord.class, tags={ "InventoryRecord", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated Inventory Record", response = InventoryRecord.class),
        @ApiResponse(code = 404, message = "Specified Inventory Record does not exist.") })
    @RequestMapping(value = "/inventory-records/{inventoryRecordId}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    default ResponseEntity<InventoryRecord> updateInventoryRecord(@ApiParam(value = "Inventory Record id to update",required=true) @PathVariable("inventoryRecordId") Long inventoryRecordId,@ApiParam(value = "Inventory Record object that needs to be updated" ,required=true )  @Valid @RequestBody InventoryRecord body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"inventoryState\" : { },  \"id\" : 0}", InventoryRecord.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default InventoryRecordsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
