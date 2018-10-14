/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package cz.siemens.inventory.gen.api;

import cz.siemens.inventory.gen.model.DeviceCalibration;
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

@Api(value = "calibrations", description = "the calibrations API")
public interface CalibrationsApi {

    Logger log = LoggerFactory.getLogger(CalibrationsApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Creates new Calibration", nickname = "createCalibration", notes = "", response = DeviceCalibration.class, tags={ "Calibration", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Calibration created", response = DeviceCalibration.class),
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/calibrations",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<DeviceCalibration> createCalibration(@ApiParam(value = "Calibration object that needs to be created" ,required=true )  @Valid @RequestBody DeviceCalibration body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"calibrationInterval\" : 6,  \"lastCalibrationDateString\" : \"lastCalibrationDateString\",  \"id\" : 0}", DeviceCalibration.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default CalibrationsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Gets Calibration based on calibrationId", nickname = "getCalibration", notes = "", response = DeviceCalibration.class, tags={ "Calibration", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The Calibration", response = DeviceCalibration.class),
        @ApiResponse(code = 404, message = "Requested Calibration does not exist.") })
    @RequestMapping(value = "/calibrations/{calibrationId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<DeviceCalibration> getCalibration(@ApiParam(value = "Calibration's id",required=true) @PathVariable("calibrationId") Long calibrationId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"calibrationInterval\" : 6,  \"lastCalibrationDateString\" : \"lastCalibrationDateString\",  \"id\" : 0}", DeviceCalibration.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default CalibrationsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Updates an Calibration based on revisionId", nickname = "updateCalibration", notes = "", response = DeviceCalibration.class, tags={ "Calibration", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated Calibration", response = DeviceCalibration.class),
        @ApiResponse(code = 404, message = "Specified Calibration does not exist.") })
    @RequestMapping(value = "/calibrations/{calibrationId}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    default ResponseEntity<DeviceCalibration> updateCalibration(@ApiParam(value = "Calibration id to update",required=true) @PathVariable("calibrationId") Long calibrationId,@ApiParam(value = "Calibration object that needs to be updated" ,required=true )  @Valid @RequestBody DeviceCalibration body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"calibrationInterval\" : 6,  \"lastCalibrationDateString\" : \"lastCalibrationDateString\",  \"id\" : 0}", DeviceCalibration.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default CalibrationsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
