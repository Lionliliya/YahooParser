package parser;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "results")
public class Results {

	@XmlElement(name = "rate")
	public Rate[] rate;

	public Results(Rate[] rate) {
		super();
		this.rate = rate;
	}

	public Results() {
		super();
	}

}
