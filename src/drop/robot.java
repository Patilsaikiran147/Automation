package drop;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robot {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\sp21440\\Desktop\\kiru.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				Cell c = wb.getSheet("Sheet1").getRow(i).getCell(j);
				System.out.print(c + "      ");
			}
			System.out.println();
		}
	}

}
