
import com.entity.Fizioterapeut;
import com.entity.Karton;
import com.entity.Lekar;
import com.entity.Pregled;
import com.entity.Terapija;
import com.entity.Tip;
import com.service.FizioterapeutService;
import com.service.KartonService;
import com.service.LekarService;
import java.sql.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jelena.pajdic
 */
public class MainApp {
    public static void main(String[] args) {
       ApplicationContext context = 
             new ClassPathXmlApplicationContext("Bean2.xml");
       
       KartonService kService= (KartonService) context.getBean("kartonService");
       Karton k = kService.vratiPacijenta("2712");
       LekarService lService = (LekarService) context.getBean("lekarService");
       FizioterapeutService fService= (FizioterapeutService) context.getBean("fizioterapeutService");
       
       Fizioterapeut f =fService.vratiFizoterapeuta("123");
       Pregled p = lService.vratiPregled(3);
       Terapija t =fService.vratiTerapiju(2);
       
        System.out.println(""+f.getIme());
        
    Lekar lekar = new Lekar();
    lekar.setBrojLicence("875");
    lekar.setEmail("emaill");
        lekar.setIme("le");
        lekar.setPrezime("pr");
        lekar.setSifra("s");
       lService.saveLekar(lekar);
         

    }
}
