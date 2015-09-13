package parser;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.net.URL;

public class Main {
	public static void main(String[] args) {
		try {
			String request = "http://query.yahooapis.com/v1/public/yql?format=xml&q=select%20*%20from%20"
					+ "yahoo.finance.xchange%20where%20pair%20in%20(\"EURUAH\",%20\"USDUAH\")&env=store://datatables.org/alltableswithkeys";
			URL url = new URL(request);

			JAXBContext context = JAXBContext.newInstance(Query.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Query object = (Query) unmarshaller.unmarshal(url);
			for (Rate rate : object.results.rate) {
				System.out.println(rate.id + "=" + rate.Rate);
			}

			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(object, System.out);
		} catch (JAXBException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
