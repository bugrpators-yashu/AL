package commonClassesReusable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.Test;

@Test
public class LoadExcel extends BrowserSelection {

	private static String[] ro = new String[900];
	private static List<String> list = new ArrayList<String>();
	public static String getnewfoldernamecreated;
	public static String Module_Value;

	public static void main(String[] args) throws IOException {
		Module_Value = ReadDataFromPropertiesFile.readProperty_CommonData("Module");
		System.out.println(Module_Value + "get value");
		getnewfoldernamecreated = CreateUniqueNumber.Generate_Unique_variable(Module_Value);
		log1.info("value of getnewfoldernamecreated" + getnewfoldernamecreated);
		CreateEmptyFolder.testCreateEmptyFolder("Results\\" + getnewfoldernamecreated);

		FileInputStream in = new FileInputStream("properties/commondata.properties");
		Properties props = new Properties();
		props.load(in);
		in.close();

		FileOutputStream out = new FileOutputStream("properties/commondata.properties");
		props.setProperty("newfoldercreated", getnewfoldernamecreated);
		props.store(out, null);
		out.close();

		FileInputStream file = new FileInputStream(new File("Excel\\check.xls"));
		HSSFWorkbook wb = new HSSFWorkbook(file);

		Sheet sheet = wb.getSheet(Module_Value);

		for (int j = 0; j < sheet.getLastRowNum() + 1; j++) {
			Row row = sheet.getRow(j);
			Cell cell = row.getCell(1);
			if (cell.toString().equalsIgnoreCase("Y")) {
				ro[j] = row.getCell(0).toString();
			} else {
				continue;
			}
		}

		for (String as : ro) {
			if (as != null && as.length() > 0) {
				list.add(as);

			}
		}

		ro = list.toArray(new String[list.size()]);

		PrintWriter writer = new PrintWriter(
				"src/com/packages/javaclass/" + Module_Value + "/step_runner_SeleniumRepositoryProject.java", "UTF-8");
		writer.println("package com.packages.javaclass." + Module_Value + ";");
		writer.println("import java.io.IOException;");
		writer.println("import org.junit.AfterClass;");
		writer.println("import org.junit.BeforeClass;");
		writer.println("import org.junit.runner.RunWith;");
		writer.println("import commonClassesReusable.BrowserSelection;");
		writer.println("import cucumber.api.junit.Cucumber;");
		writer.println("@RunWith(Cucumber.class)");
		writer.print("@Cucumber.Options( features = {");
		System.out.println("ro length" + ro.length + ro[0]);

		for (int i = 0; i < ro.length; i++) {
			if (ro[i] != null) {
				if (i == ro.length - 1) {
					writer.print(
							"\"src/com/packages/javaclass/resources/" + Module_Value + "/" + ro[i] + ".feature\"},");
				} else {
					writer.print(
							"\"src/com/packages/javaclass/resources/" + Module_Value + "/" + ro[i] + ".feature\",");
				}
			}
		}
		writer.println("format={\"html:Results/" + getnewfoldernamecreated + "/Capture_Output" + "\"})");
		writer.println("public class step_runner_SeleniumRepositoryProject");
		writer.println("{");
		writer.println("@BeforeClass");
		writer.println("public static void Start() throws IOException");
		writer.println("{");
		writer.println("BrowserSelection.beforeSuite();");
		writer.println("}");
		writer.println("@AfterClass");
		writer.println("public static void Stop() throws IOException, InterruptedException");
		writer.println("{");
		writer.println("BrowserSelection.afterSuite();");
		writer.println("}}");
		writer.close();
		System.out.println("All test-cases which needs to be executed are being loaded into cache...");
	}

}
