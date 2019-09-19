package discography;

import java.util.ArrayList;

public class Discography {

    private final String name;
    private final int recordCount;
    private final ArrayList<Record> records;

    public Discography(String name, int recordCount) {
        this(name,recordCount,null);

    }
    public Discography(String name, int recordCount, ArrayList<Record> records){
        this.name = name;
        this.recordCount = recordCount;
        this.records = records;

    }

    public String getName() {
        return name;
    }

    public int getRecordCount() {
        return recordCount;
    }
    public ArrayList<Record> getRecords(){
        return records;
    }

    @Override
    public String toString() {
        String output = name + "\n"+ recordCount + " records";
        int i = 1;
        if(records != null){
            for (Record record:
                 records) {

                output += "\n["+i+"] "+record.toString();
                i++;
            }
        }
        System.out.println(output);
        return output;
    }
}
