package drop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class Csv {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		File src = new File("D:\\Testing Program\\Automation\\helloworld.csv");
//		FileReader fr =new FileReader(src);
//		BufferedReader br = new BufferedReader(fr);
//		System.out.println(br.readLine());
//		System.out.println("tulasi kiddish behaviour");
//		br.close();
			
		CSVWriter writer=new CSVWriter(new FileWriter("D:\\Testing Program\\Automation\\lion.csv"));
        String a[]= {"Father of testing","phaniraj"};
        String b[]= {"mother of testing","priyanka_Gandhi"};
        String c[]= {"son of testing","phani_Gandhi"};
        
        writer.writeNext(a);
        writer.writeNext(b);
        writer.writeNext(c);
        writer.flush();
        System.out.println("writesuccess");
	}

}
 