package task04;

/**
 * Created by Andrii_Grygoruk on 9/12/2017.
 */
public class ProDocumentWorker extends DocumentWorker {
    @Override
    void editDocument(){
        System.out.println("Документ отредактирован");
    }

    @Override
    void saveDocument(){
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }
}
