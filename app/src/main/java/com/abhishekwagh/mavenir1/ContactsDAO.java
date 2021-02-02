package com.abhishekwagh.mavenir1;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ContactsDAO {
    @Query("select * from Contacts")
    List<Contacts> getAllContacts();

    @Insert
    void insertUser(Contacts contacts);

    @Update
    void updateUser(Contacts contacts);

    @Delete
    void deleteContacts(Contacts contacts);

//    @Query("SELECT * FROM contacts")
//    public List<Contacts> getContacts();

    @Query("SELECT * FROM contacts WHERE Phone_Number = :number")
    public Contacts getContactWithId(String number);

    @Query("SELECT * FROM contacts WHERE Name = :name")
    public Contacts getContactsWithName(String name);


}
