/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package cz.siemens.inventory.gen.api;

import cz.siemens.inventory.gen.model.DeviceType;
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

@Api(value = "device-types", description = "the device-types API")
public interface DeviceTypesApi {

    Logger log = LoggerFactory.getLogger(DeviceTypesApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Creates new Device Type", nickname = "createDeviceType", notes = "", response = DeviceType.class, tags={ "DeviceType", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "DeviceInternal Type created", response = DeviceType.class),
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/device-types",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<DeviceType> createDeviceType(@ApiParam(value = "Device Type object that needs to be created" ,required=true )  @Valid @RequestBody DeviceType body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"orderNumber\" : \"orderNumber\",  \"price\" : 5.962133916683182,  \"supplier\" : {    \"name\" : \"name\",    \"id\" : 1  },  \"objectTypeName\" : \"objectTypeName\",  \"id\" : 0,  \"classification\" : 6,  \"version\" : \"version\",  \"manufacturer\" : \"manufacturer\"}", DeviceType.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default DeviceTypesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Deletes an Device Type", nickname = "deleteDeviceType", notes = "", tags={ "DeviceType", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Device Type was deleted."),
        @ApiResponse(code = 404, message = "Specified Device Type does not exist.") })
    @RequestMapping(value = "/device-types/{deviceTypeId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteDeviceType(@ApiParam(value = "Device Type's id",required=true) @PathVariable("deviceTypeId") Long deviceTypeId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default DeviceTypesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Gets Device Type based on deviceTypeId", nickname = "getDeviceType", notes = "", response = DeviceType.class, tags={ "DeviceType", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The Device Type", response = DeviceType.class),
        @ApiResponse(code = 404, message = "Requested Device Type does not exist.") })
    @RequestMapping(value = "/device-types/{deviceTypeId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<DeviceType> getDeviceType(@ApiParam(value = "Device Type's id",required=true) @PathVariable("deviceTypeId") Long deviceTypeId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"orderNumber\" : \"orderNumber\",  \"price\" : 5.962133916683182,  \"supplier\" : {    \"name\" : \"name\",    \"id\" : 1  },  \"objectTypeName\" : \"objectTypeName\",  \"id\" : 0,  \"classification\" : 6,  \"version\" : \"version\",  \"manufacturer\" : \"manufacturer\"}", DeviceType.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default DeviceTypesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Gets all Device types", nickname = "getDeviceTypes", notes = "", response = DeviceType.class, responseContainer = "List", tags={ "DeviceType", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All Device Types", response = DeviceType.class, responseContainer = "List") })
    @RequestMapping(value = "/device-types",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<DeviceType>> getDeviceTypes() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"orderNumber\" : \"orderNumber\",  \"price\" : 5.962133916683182,  \"supplier\" : {    \"name\" : \"name\",    \"id\" : 1  },  \"objectTypeName\" : \"objectTypeName\",  \"id\" : 0,  \"classification\" : 6,  \"version\" : \"version\",  \"manufacturer\" : \"manufacturer\"}, {  \"orderNumber\" : \"orderNumber\",  \"price\" : 5.962133916683182,  \"supplier\" : {    \"name\" : \"name\",    \"id\" : 1  },  \"objectTypeName\" : \"objectTypeName\",  \"id\" : 0,  \"classification\" : 6,  \"version\" : \"version\",  \"manufacturer\" : \"manufacturer\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default DeviceTypesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Gets Device Types based on deviceTypeName", nickname = "getDeviceTypesByName", notes = "", response = DeviceType.class, responseContainer = "List", tags={ "Device", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All Device Types filtered out by", response = DeviceType.class, responseContainer = "List") })
    @RequestMapping(value = "/device-types/name/like/{deviceTypeName}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<DeviceType>> getDeviceTypesByName(@ApiParam(value = "Name of device type",required=true) @PathVariable("deviceTypeName") String deviceTypeName) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"orderNumber\" : \"orderNumber\",  \"price\" : 5.962133916683182,  \"supplier\" : {    \"name\" : \"name\",    \"id\" : 1  },  \"objectTypeName\" : \"objectTypeName\",  \"id\" : 0,  \"classification\" : 6,  \"version\" : \"version\",  \"manufacturer\" : \"manufacturer\"}, {  \"orderNumber\" : \"orderNumber\",  \"price\" : 5.962133916683182,  \"supplier\" : {    \"name\" : \"name\",    \"id\" : 1  },  \"objectTypeName\" : \"objectTypeName\",  \"id\" : 0,  \"classification\" : 6,  \"version\" : \"version\",  \"manufacturer\" : \"manufacturer\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default DeviceTypesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Updates Device Type based on deviceTypeId", nickname = "updateDeviceType", notes = "", response = DeviceType.class, tags={ "DeviceType", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The Device Type", response = DeviceType.class),
        @ApiResponse(code = 404, message = "Requested DeviceInternal Type does not exist.") })
    @RequestMapping(value = "/device-types/{deviceTypeId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<DeviceType> updateDeviceType(@ApiParam(value = "Device Type's id",required=true) @PathVariable("deviceTypeId") Long deviceTypeId,@ApiParam(value = "Device Type object that needs to be updated" ,required=true )  @Valid @RequestBody DeviceType body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"orderNumber\" : \"orderNumber\",  \"price\" : 5.962133916683182,  \"supplier\" : {    \"name\" : \"name\",    \"id\" : 1  },  \"objectTypeName\" : \"objectTypeName\",  \"id\" : 0,  \"classification\" : 6,  \"version\" : \"version\",  \"manufacturer\" : \"manufacturer\"}", DeviceType.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default DeviceTypesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
