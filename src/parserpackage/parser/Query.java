package parser;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class Query {
	@XmlElement
	public int count;
	@XmlElement
	public String created;
	@XmlElement
	public String lang;
	@XmlElement
	public Results results;

	public Query() {
	}

}
