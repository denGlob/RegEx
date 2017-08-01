package controller;

import controller.utils.RecordInputController;
import exceptions.LoginInUseException;
import model.Model;
import view.View;

import java.util.Scanner;

/**
 * Created by denglob on 7/31/17.
 */
public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);

        inputRecord(scanner);

        view.printResultMessages();
        view.printMessage(model.getRecords().toString());
    }

    private void inputRecord(Scanner scanner) {
        RecordInputController inputNoteController = new RecordInputController(scanner, view);
        boolean finished = false;
        while (!finished){
            try {
                model.addRecord(inputNoteController.createRecord());
                finished = true;
            } catch (LoginInUseException e) {
                inputNoteController.inputNewLogin();
            }
        }
    }
}
