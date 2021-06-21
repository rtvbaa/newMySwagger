/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Person;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-21T17:38:45.388006+03:00[Europe/Minsk]")
@Validated
@Api(value = "api", description = "the api API")
public interface ApiApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api/person : Добавляет человека в базу данных
     *
     * @param name Имя человека (required)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "Добавляет человека в базу данных", nickname = "addPerson", notes = "", response = Person.class, tags={ "База данных с людьми", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Person.class) })
    @PostMapping(
        value = "/api/person",
        produces = { "application/json;charset=UTF-8" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Person> addPerson(@ApiParam(value = "Имя человека" ,required=true )  @Valid @RequestBody String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=UTF-8"))) {
                    String exampleString = "{ \"name\" : " + name + ", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=UTF-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/person/{id} : Получить имя человека
     *
     * @param id ID человека (required)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "Получить имя человека", nickname = "getPersonById", notes = "", response = Person.class, responseContainer = "List", tags={ "База данных с людьми", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Person.class, responseContainer = "List") })
    @GetMapping(
        value = "/api/person/{id}",
        produces = { "application/json;charset=UTF-8" }
    )
    default ResponseEntity<List<Person>> getPersonById(@ApiParam(value = "ID человека",required=true) @PathVariable("id") Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=UTF-8"))) {
                    String exampleString = "{ \"name\" : \"name\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=UTF-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /api/person/{id} : Удаляет человека из базы
     *
     * @param id ID человека (required)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "Удаляет человека из базы", nickname = "personDELETE", notes = "", tags={ "База данных с людьми", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @DeleteMapping(
        value = "/api/person/{id}"
    )
    default ResponseEntity<Void> personDELETE(@ApiParam(value = "ID человека",required=true) @PathVariable("id") Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}