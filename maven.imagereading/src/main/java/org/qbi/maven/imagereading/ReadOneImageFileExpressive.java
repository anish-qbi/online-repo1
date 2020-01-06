package org.qbi.maven.imagereading;

import java.io.File;

import com.astero.numerics.DoubleMatrix2D;

import miatool.core.setssingles.image.GreyU16DiskSingle;

public class ReadOneImageFileExpressive {
	
	public static void main(String[] args) {
		File imageFile = new File("D:\\projects\\astero\\2020 QBI\\raw data\\working-dir\\mum-small\\ImageFiles\\Series1\\s1_1.tif");
		GreyU16DiskSingle imageRef = new GreyU16DiskSingle(imageFile.getAbsolutePath(), false);
		double[][] imageData = imageRef.get2DImageMatrix();
		
		System.out.println(DoubleMatrix2D.toString(imageData));
		System.out.println("Height, Width: " + imageRef.getHeight() + ", " + imageRef.getWidth());
	}
}
