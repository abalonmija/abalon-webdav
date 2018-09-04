package se.abalon.relevate.generic;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AbalonWebdavService {

    private static final Logger log = LoggerFactory.getLogger(AbalonWebdavService.class);

    public AbalonWebdavService() {

    }

    public String test() {
        log.info("service");
        return "OK!";
    }


    public void findByFile(String code) {
/*
        DbEntity entity = entityRepository.findByCode(code);
        if (entity != null) {
            dto.setCode(entity.getCode());
            dto.setDesc(entity.getDesc());
        }

        return dto;
        */

        System.out.println("FindByFile!");
    }

    public void saveFile() {
        /*
        DbEntity entity = new DbEntity();

        entity.setCode(dbEntityDTO.getCode());
        entity.setDesc(dbEntityDTO.getDesc());
        entity.setId(ponClient.getNext());

        entityRepository.save(entity);

        return dbEntityDTO;
*/

        System.out.println("saveFile!");
    }
}
