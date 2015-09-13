package parser;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rate")
public class Rate {
	@XmlElement
	public String id;
	@XmlElement
	public String Name;
	@XmlElement
	public double Rate;
	@XmlElement
	public String Date;
	@XmlElement
	public String Time;
	@XmlElement
	public String Ask;
	@XmlElement
	public String Bid;

	public Rate() {
		super();
	}

}
