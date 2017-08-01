package model;

import exceptions.LoginInUseException;
import model.entity.Record;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by denglob on 7/31/17.
 */
public class Model {

    private List<Record> records;

    public Model() {
        this.records = new ArrayList<Record>();
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public void addRecord(Record record) throws LoginInUseException{
        records.add(record);
    }
}
