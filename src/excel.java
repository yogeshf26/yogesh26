import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile= new File("C:\\selenium\\exel\\C:\\selenium\\exel.xlsx");
		WorkbookFactory.create(myfile).getSheet("Sheet2");

	}

}
