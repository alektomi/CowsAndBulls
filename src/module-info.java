module CowsAndBulls { // tak my objavljaem, chto nasha programma javlaetsja modulem Java
    requires javafx.controls; // controls soderzhit vse chto estj v java - knopki i t d.
    exports cab to javafx.graphics, javafx.fxml; // exportiruem vse chto v package cab v javafx grafiku
    requires javafx.fxml;
    opens cab to javafx.fxml, javafx.base;

}