package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{

	@FXML
	private MenuItem menuItemSeller;
	@FXML
	private MenuItem menuItemDepartment;
	@FXML
	private MenuItem menuItemAbout;
		
	@FXML
	public static void onMenuItemSellerAction() {
		System.out.println("Seller");
	}
	
	@FXML
	public static void onMenuItemDepartmentAction() {
		System.out.println("Department");
	}
	
	@FXML
	public static void onMenuItemAboutAction() {
		System.out.println("About");
	}
	
	@Override
	public void initialize(URL uri, ResourceBundle resourceBundle) {
		
		
	}

}
