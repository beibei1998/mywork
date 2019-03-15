package po;

import java.io.Serializable;

/**
 * ��������Ϣ
 * @author guxinyu
 * @version 2017.12.4
 *
 */
public class SingleEntryPO implements Serializable{

	private static final long serialVersionUID = 8L;
	
	private String belongedBill;
	private String date;
	private String event;
	private String amount;
	
	public SingleEntryPO(){
		
	}

	public SingleEntryPO(String belonged, String d, String e, String a){
		setBelongedBill(belonged);
		setDate(d);
		setEvent(e);
		setAmount(a);
	}

	public String getBelongedBill() {
		return belongedBill;
	}

	public void setBelongedBill(String belongedBill) {
		this.belongedBill = belongedBill;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
