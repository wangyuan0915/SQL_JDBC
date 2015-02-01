import java.sql.*;
import java.io.*;
 
class A2Test {
  public static void main (String args[]) {
    System.out.println("helloworld");
    Assignment2 a2 = new Assignment2();
    
    if (a2.connectDB("jdbc:postgresql://localhost:5432/csc343h-g3naiver",
                 "g3naiver", "") == true){
		System.out.println("Connected Success");	 
		}
	
	else {
		System.out.println("Failed");
	}
    
    
    
    if (a2.insertCountry (11000,"dog", 39, 39) == false)
		System.out.println("insertNo");
    
    
    
    if (a2.getCountriesNextToOceanCount(102) != 4)
		System.out.println("getCountriesNextToOceanCountNo");	
	
	
	
	String text1 = "102:Atlantic Ocean:1024";
	if (!a2.getOceanInfo(102).equals(text1)){
		System.out.println(a2.getOceanInfo(102));
		System.out.println("getOceanInfoNo");	
	}
	
	

	if (a2.chgHDI(003,2010, 0.38f) == false)
		System.out.println("chgHDINo");
	
	
	
	if (a2.deleteNeighbour(1, 3) == false)
		System.out.println("deleteNeighbourNo");
	
	if (a2.deleteNeighbour(19, 3) == false)
		System.out.println("deleteNeighbourNo2");
	
	
	if (!a2.listCountryLanguages(001).equals("11:Spanish:21802899#21:Portuguese:21802899#9:Italian:52949901#1:Chinese:77867500#19:French:728839788#3:English:1881278847#")){
		System.out.println(a2.listCountryLanguages(001));
		System.out.println("listCountryLanguageNo");
	}
	
	if (a2.updateHeight(001,200) == false)
		System.out.println("updateHeightNo");
    
	
	if (a2.updateDB() == false)
		System.out.println("updateDBNo");
    
    
    if(a2.disconnectDB() == false){
		System.out.println("disconnectDB");
    }
    System.out.println("finished");
  }
}
 
 
/* go to dbsrv1 and the proper dir
 * psql csc343h-g3allenx and import (\i a2.ddl) the database
 * exit psql, run "javac A2Test.java" to compile the test file
 * run "java -cp /local/packages/jdbc-postgresql/postgresql-9.1-903.jdbc4.jar: A2Test" to run the file
 * */
