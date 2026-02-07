package listarray.ex030;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Spinner<Integer> spinnN;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnRemove;
    @FXML
    private Button btnOrder;
    @FXML
    private Label lblSelect;
    @FXML
    private ListView<Integer> lstArray;
    private ObservableList<Integer> obsItens = FXCollections.observableArrayList();


    int vetor[] = new int[8];
    int selected = 0;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        SpinnerValueFactory<Integer> valueFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(-100,100,0);
        spinnN.setValueFactory(valueFactory);


        for (int c = 0; c < vetor.length; c++){
            obsItens.add(vetor[c]);
        }
        lstArray.setItems(obsItens);
    }


    @FXML
    protected void onClickAdd(ActionEvent event) {
        vetor[selected] = spinnN.getValue();
        obsItens.clear();
        for (int c = 0; c < vetor.length; c++){
            obsItens.add(vetor[c]);
        }
    }

    @FXML
    protected void onClickRemove(ActionEvent event) {
        vetor[selected] = 0;
        obsItens.clear();
        for (int c = 0; c < vetor.length; c++){
            obsItens.add(vetor[c]);
        }
    }

    @FXML
    protected void onClickOrder(ActionEvent event) {
        Arrays.sort(vetor);
        obsItens.clear();
        for (int c = 0; c < vetor.length; c++){
            obsItens.add(vetor[c]);
            System.out.print(vetor[c] + " ");
        }

    }

    @FXML
    protected void onMouse(MouseEvent event){
        selected = lstArray.getSelectionModel().getSelectedIndex();
        lblSelect.setText("[" + selected + "]");
    }
}
