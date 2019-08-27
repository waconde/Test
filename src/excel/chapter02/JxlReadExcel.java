package excel.chapter02;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class JxlReadExcel {

	/**
	 * JXL解析Excel
	 * @author David
	 * @param args
	 */
	public static void main(String[] args) {
		String fileUrl="/Users/zhangke/Downloads/excel/jxl_test.xls";

		try {
			//创建workbook
			Workbook workbook = Workbook.getWorkbook(new File(fileUrl));
			//获取第一个工作表sheet
			Sheet sheet = workbook.getSheet(0);
			//获取数据
			for (int i = 0; i < sheet.getRows(); i++) {
				for (int j = 0; j < sheet.getColumns(); j++) {
					Cell cell = sheet.getCell(j,i);
					System.out.print(cell.getContents() + "  ");
				}
				System.out.println();
			}
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
