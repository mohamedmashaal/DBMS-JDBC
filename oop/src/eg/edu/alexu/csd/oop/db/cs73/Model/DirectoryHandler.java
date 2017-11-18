package eg.edu.alexu.csd.oop.db.cs73.Model;

/*

    This class handles the main directory of databases:
        Checks if a newly created database already exists
        Creates new databases
        Creates new tables

 */

import java.io.File;
import java.io.IOException;

public class DirectoryHandler {

    File mainDirectory;

    public DirectoryHandler(){
        mainDirectory = new File("data");
        mainDirectory.mkdirs();
    }

    public boolean exists(){
        // TODO Complete It
        for(File dir : mainDirectory.listFiles()){

        }
        return false;
    }

    public boolean deleteDatabase(String databaseName){
        // TODO
        return true;
    }


    public String getPathOf(String databaseName) {
    	File dataFile = new File(mainDirectory.getPath() + "/" + databaseName);
        return dataFile.getAbsolutePath();
    }
    
    public void dropDir(String databaseName) {
    	File dir = new File(mainDirectory.getPath() + "/" + databaseName);
    	dir.delete();
    }
}