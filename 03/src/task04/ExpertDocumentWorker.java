package task04;

/**
 * Created by Andrii_Grygoruk on 9/12/2017.
 */
public class ExpertDocumentWorker extends ProDocumentWorker{
    @Override
    void saveDocument(){
        System.out.println("Документ сохранен в новом формате");
    }
}
