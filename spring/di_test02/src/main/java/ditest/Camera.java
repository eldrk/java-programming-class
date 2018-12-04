package ditest;

import org.springframework.beans.factory.annotation.Required;

import lombok.Data;

@Data
public class Camera {
	private int number;
	
	@Required
	public void setNumber(int number) {
		this.number = number;
	}
	
}
