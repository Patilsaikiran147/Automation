package drop;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class Readercsv {

	public static void main(String[] args) throws IOException, CsvValidationException {
		// TODO Auto-generated method stub
		CSVReader reader=new CSVReader(new FileReader("D:\\Testing Program\\Automation\\helloworld.csv"));
	     StringBuffer sb=new StringBuffer();
	     String [] data;
	     while((data=reader.readNext())!=null) {
	         for(int i=0;i<data.length;i++) {
	             System.out.println(data[i]);
	         }
	         System.out.println(" ");
	     }

	}

}
