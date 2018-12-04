package chapter07;

class CellPhon{
	protected String model;
	String color;
	
	void powerOn() {System.out.println("전원을 켭니다.");}
	void powerOff() {System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sendVoic(String message) {System.out.println("자기 : "+message);}
	void receiveVoice(String message) {System.out.println("상대방 : "+message);}
	void hangUp() {System.out.println("전화를 끊습니다");}
}

class DmbCellPhone extends CellPhon{
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
		
	}
	
	
	
	void turnOnDmb() {
		System.out.println("체널 " +channel + "번 DMB 방송 수신을 시작합니다");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " +channel + "번으로 바꿉니다");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다");
	}
	
	
	
	
}

public class Ex04_CellPhon {
	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10);
		
		System.out.println("모델 : " +dmbCellPhone.model);
		System.out.println("색상 : " +dmbCellPhone.color);
		
		System.out.println("채널 : " +dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoic("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbCellPhone.sendVoic("아~예 반갑습니다");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
	}

}
