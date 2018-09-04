package se.abalon.relevate.generic;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * AbalonWebdav controller.
 */
@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
//@Api(authorizations = {@Authorization(value = "oauth", scopes = {@AuthorizationScope(scope = "openid", description = "openid")})})
public class AbalonWebdavController {

    private static final Logger log = LoggerFactory.getLogger(AbalonWebdavController.class);

    private final AbalonWebdavService abalonWebdav;

    public AbalonWebdavController(AbalonWebdavService abalonWebdav) {
        this.abalonWebdav = abalonWebdav;
    }


    /**
     * Find entity by code.
     *
     * @param code the entity code
     * @return DbEntityDTO dto
     */
    @RequestMapping(value = "/{file}", method = RequestMethod.GET)
    public void findByFile(@PathVariable("file") String file) {
        //log.info("findByCode: {}", code);

        try {

            //dto = abalonWebdav.findByCode(code);
            //linkAdder.addLinks(dto);

        } catch (Exception e) {
            log.error("Error : ", e);
        }

        //return dto;
    }


    /**
     * Insert entity.
     *
     * @param saveFile the entity
     * @return DbEntityDTO dto
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void saveFile(@PathVariable("file") String file) {

        try {

            //dto = abalonWebdav.saveEntity(insertDTO);

        } catch (Exception e) {
            log.error("Error : ", e);
        }

        //return dto;
    }
}
