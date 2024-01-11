package Domenico.Pizza8Gennaio.dao;

import Domenico.Pizza8Gennaio.enteties.Bevande;
import Domenico.Pizza8Gennaio.interfacce.BevandeDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BevandeServiceDao {
    @Autowired
    BevandeDao bevandeDao;

    public void saveBevande(Bevande bevande){
        bevandeDao.save(bevande);
        log.info("bevanda aggiunta");
    }


}
