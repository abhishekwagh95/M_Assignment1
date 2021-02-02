package com.abhishekwagh.mavenir1;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "contacts")
public class Contacts {
    @PrimaryKey(autoGenerate = true)
    int uid;

    private String Name;

    //    @ColumnInfo(typeAffinity = ColumnInfo.BINARY)
    private String Birthday;

//    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
//    private byte[] Image;

    private String Phone_Number;

    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        Phone_Number = phone_Number;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public void setName(String name) {
        Name = name;
    }

//    public void setBirthday(Date birthday) {
//        Birthday = birthday;
//    }

//    public void setImage(byte[] image) {
//        this.Image = image;
//    }



    public String getName() {
        return Name;
    }

//    public Date getBirthday() {
//        return Birthday;
//    }

//    public byte[] getImage() {
//        return Image;
//    }


}
