package eg.edu.alexu.csd.oop.db.cs73.View;

import java.sql.SQLException;

import eg.edu.alexu.csd.oop.db.Database;

/*

    This class is just for testing purposes

 */

import eg.edu.alexu.csd.oop.db.cs73.Model.DatabaseImp;

public class Testing {

    public static void main(String[] args){
<<<<<<< HEAD
        /*String x = "UPDATE table_name9 SET column_name1='value1', column_name2=15, column_name3='value2'";
=======
        /*String x = "CREATE TABLE Persons (PersonID int,LastName varchar(255),FirstName varchar(255),Address varchar(255),City varchar(255) )";
>>>>>>> 28606f66a6f95a968e207be87f68a82df45569d1
        //Create TABLE table_name1(column_name1 varchar, column_name2 int, column_name3 varchar)
        // INSERT INTO table_name8(column_NAME1, COLUMN_name3, column_name2) VALUES ('value1', 'value3', 4) INSERT INTO table_name8(column_NAME1, COLUMN_name3, column_name2) VALUES ('value1', 'value3', 4)
        //UPDATE table_name9 SET column_name1='value1', column_name2=15, column_name3='value2' UPDATE table_name9 SET column_name1='value1', column_name2=15, column_name3='value2'
        x = x.replaceAll("\\)", " ").replaceAll("\\(", " ").replaceAll("'", "");
        System.out.println(x);
        String [] z = x.split("\\s+|\\,\\s*|\\(|\\)|\\=");
        for(String v : z)
        	System.out.println(v);*/
<<<<<<< HEAD
    	DatabaseImp db = new DatabaseImp();
    	db.createDatabase("7amada", true);
    	try {
			db.executeStructureQuery("CREATE TABLE table_1 (column_name1 varchar, column_name2 int, column_name3 varchar)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	try {
			db.executeUpdateQuery("INSERT INTO table_1(column_NAME1, COLUMN_name2, column_name3) VALUES ('value1', 4, 'value2')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
=======

        String q = "SELECT col1,col2,col3 FROM table";
        String[] qs = q.split(" ");
        for(String s : qs){
            System.out.println(s);
        }
>>>>>>> 28606f66a6f95a968e207be87f68a82df45569d1
    }

}
