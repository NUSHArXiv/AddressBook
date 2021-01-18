module AddressBook {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    opens application;
    opens application.controller;
    opens application.model;
}