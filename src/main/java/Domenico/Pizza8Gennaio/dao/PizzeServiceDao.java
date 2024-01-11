package Domenico.Pizza8Gennaio.dao;

import Domenico.Pizza8Gennaio.enteties.Pizze;
import Domenico.Pizza8Gennaio.exceptions.IdNonTrovato;
import Domenico.Pizza8Gennaio.interfacce.PizzeDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PizzeServiceDao{
    @Autowired
    private PizzeDao pizzeDao;

    public void savePizzaIntoDatabase(Pizze pizze){
        pizzeDao.save(pizze);
        log.info("pizza salvata");
    }

    public Pizze findById(long id) throws IdNonTrovato {
        return pizzeDao.findById(id).orElseThrow(()-> new IdNonTrovato(id));//forma accorciata del metodo per quello più lungo vedere gli appunti
    }

    public void findByIdAndDelete(long id){
        Pizze pi=this.findById(id);
        pizzeDao.delete(pi);
        log.info("l'id "+id+" è stato eliminato correttamente");
    }

}
