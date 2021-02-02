package com.abhishekwagh.mavenir1;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Contacts.class}, version = 1)
public  abstract class ContactsDatabase extends RoomDatabase {
    public abstract ContactsDAO contactsDAO();
}