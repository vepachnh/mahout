package com.train.recommender;

import java.io.File;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;

public class RecommenderIntro {
	
	public static void main(String[] a){
		try{
			DataModel model = new FileDataModel(new File("intro.csv"));
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
