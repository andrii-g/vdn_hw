package task04;

/**
 * Created by Andrii_Grygoruk on 9/12/2017.
 */
public class DocumentWorker {
    void openDocument(){
        System.out.println("Документ открыт");
    }

    void editDocument(){
        System.out.println("Редактирование документа доступно в версии Про");
    }

    void saveDocument(){
        System.out.println("Сохранение документа доступно в версии Про");
    }

    void printInfo(){
        this.openDocument();
        this.editDocument();
        this.saveDocument();
    }
}
