package tests;

import org.testng.annotations.Test;

public class BoardCreation extends TestBase {


    @Test
    public void boardCreation1(){

        app.getBoard().initBoardCreationFromHeader();
        app.getBoard().fillboardCreationForm();
        app.getBoard().scrollDownTheForm();
        app.getBoard().pause();
        app.getBoard().submitBoardCreation();
        app.getBoard().pause();
        app.getBoard().returnToHomePage();
    }

}
