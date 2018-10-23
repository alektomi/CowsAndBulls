package cab;

import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;

public class MainController {

    private int turnNr;
    public Spinner<Integer> num1;
    public Spinner<Integer> num2;
    public Spinner<Integer> num3;
    public Spinner<Integer> num4;
    public TableView<Turn> turns;

    //    kogda programma gotova ona vyvodit Hello, chtoby user mog rabotatj
    public void initialize() {
        System.out.println("Hello!");

        //zdesj mozhno vpisatj kod dlja zgaduvanije cifr
    }


    public void go() {
        turnNr++;
        int n1 = num1.getValue();
        int n2 = num2.getValue();
        int n3 = num3.getValue();
        int n4 = num4.getValue();
        System.out.println("" + n1 + n2 + n3 + n4); // esli ne dobavitj kavychki to programma sdelaet slozhenie, t.k. znachenija integer

        // v go metode mozhno schitatj kol-vo korov i bykov

        Turn turn = new Turn();
        turn.setGuess("" + n1 + n2 + n3 + n4);
        turn.setTurnNr(turnNr);

        turns.getItems().add(turn);


    }
}
