
package Controller;

import Model.Work;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainController {
    private static MainController instance;
    
    public static MainController getInstance(){
        if (instance == null){
            instance = new MainController();
        }
        return instance;
    }
    
    private MainController(){
        listWork = new ArrayList();
        try {
            listWork = IOSystem.getInstance().read(System.getProperty("user.dir") + "/files/data/listWork.dat");
        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private List<Work> listWork;

    public List<Work> getListWork() {
        return listWork;
    }

}
