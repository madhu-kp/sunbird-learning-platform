package com.ilimi.taxonomy.content.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.ekstep.content.entity.Plugin;
import org.ekstep.content.util.ECRFConversionUtility;
import org.junit.Test;

public class ECRFConversionUtilityTest {

	@SuppressWarnings("unused")
	@Test
	public void getECRF_Test01() {
		ECRFConversionUtility fixture = new ECRFConversionUtility();
		String strContent = getFileString("Sample_XML_1.ecml");
		Plugin plugin = fixture.getECRF(strContent);
	}

	private String getFileString(String fileName) {
		String fileString = "";
		File file = new File(getClass().getResource("/Contents/" + fileName).getFile());
		try {
			fileString = FileUtils.readFileToString(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileString;
	}
}
