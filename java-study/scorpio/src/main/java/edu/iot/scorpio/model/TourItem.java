package edu.iot.scorpio.model;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TourItem implements Comparable<TourItem>, Serializable {

	private static final long serialVersionUID = 1L;
	

	Date date;       //방문일/시간
	TourSpot spot;	 //방문지


	@Override
	public int compareTo(TourItem item) {
		return date.compareTo(item.date);
	}

}
