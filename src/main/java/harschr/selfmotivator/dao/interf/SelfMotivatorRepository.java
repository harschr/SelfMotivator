
package harschr.selfmotivator.dao.interf;

import harschr.selfmotivator.model.Training;
import java.sql.ResultSet;
import java.util.ArrayList;

public interface SelfMotivatorRepository {
    
      void insert(Training tr);
      
      void delete(String id);
      
       ArrayList<String[]> listAll ();
       
       void update(Training tr, String id);
       
       Training findById(String trId);
       
       Training makeOneTraining (ResultSet rs);
}
