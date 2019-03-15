package ui.mainUi.managerMainUi;

import java.net.URL;
import java.util.ResourceBundle;

import assistant.type.UserPositionEnum;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import ui.approveBillUi.ApproveBillUiStarter;
import ui.listUi.BusinessConditionListUiStarter;
import ui.listUi.BusinessProcessListUiStarter;
import ui.listUi.SalesDetailsListUiStarter;
import ui.promotionUi.PromotionUiStarter;
import vo.UserInfoVO;

/**
 * �ܾ����������������
 * @author �Ű�  161250193
 * @version 2017.12.10
 */
public class ManagerMainUiController implements Initializable{
	private UserInfoVO user;//�û���Ϣ
	
	@FXML
	private Text userNameText;//�û����Ƶ�text��Ϣ
	@FXML
	private Text userIdText;//�û�id��text��Ϣ
	
	@FXML
	private Button promotionButton;//�û��������԰�ť
	@FXML
	private Button approveBillButton;//�������ݰ�ť
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//userNameText.setText(user.getName());
		//userIdText.setText(user.getId());
	}

	public void setUser(UserInfoVO user){
		this.user = user; 
		userNameText.setText(user.getName());
		userIdText.setText(user.getId());
	}
	
	@FXML
	protected void promotionButtonListener(){
		PromotionUiStarter starter =new PromotionUiStarter();
		starter.start(user);
	}  
	
	@FXML
	protected void approveBillButtonListener(){
		ApproveBillUiStarter approveBillUiStarter = new ApproveBillUiStarter();
		approveBillUiStarter.start(user);
	} 
	
	@FXML
	protected void businessConditionListButtonListener(){
		BusinessConditionListUiStarter starter = new BusinessConditionListUiStarter();
		starter.businessConditionListUi(user.getUserPositionEnum());
	} 
	
	@FXML
	protected void businessProcessListButtonListener(){
		BusinessProcessListUiStarter starter = new BusinessProcessListUiStarter();
		starter.businessProcessListUi(user.getUserPositionEnum());
	}
	
	@FXML
	protected void salesDetailsListButtonListener(){
		SalesDetailsListUiStarter starter = new SalesDetailsListUiStarter();
		starter.salesDetailsListUi(user.getUserPositionEnum());;
	}
}