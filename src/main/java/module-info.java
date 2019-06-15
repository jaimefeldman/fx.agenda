module fx.ventanas {
	exports cl.jimix.agenda;

	requires javafx.base;
	requires transitive javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	
	uses cl.jimix.agenda.Launcher;
}