package com.example.shah.databasedemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by shah on 9/1/15.
 */
public class Newclass {

    public static final String KEY_ID="_id";
    public  static final String NAME="Name";
    public  static final String NUMBER="number";
    public static final String PASSWORD="Password";
    public static final String STATUS="Statusl";

    private  static final String DATABASE_NAME="NEWDBASEdb";
    private  static final String DATABSE_TABLE="PersonTABLE";
    private  static final String TABLE_NAME="PersonalTABLE";
    private  static final String DATA_TABLE="PersnTABLE";
    private  static final int DTATBASE_VERSION=1;

    private DBhelper ourhelper;
    private Context ourcontext;
    private SQLiteDatabase ourDatabase;



    private static class DBhelper extends SQLiteOpenHelper{

      public DBhelper(Context context){
          super(context,DATABASE_NAME,null,DTATBASE_VERSION);
      }


        @Override
        public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + DATABSE_TABLE + " (" +
         KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
         NAME + " TEXT NOT NULL, " +
         NUMBER + " TEXT NOT NULL);");

            db.execSQL("CREATE TABLE " + TABLE_NAME + " (" +
                    KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    NAME + " TEXT NOT NULL);");
            db.execSQL("CREATE TABLE " + DATA_TABLE + " (" +
                    KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    NAME + " TEXT NOT NULL, " +
                    NUMBER + " TEXT NOT NULL);");
            //, " +
            //          STATUS + " INTEGER NOT NULL
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
db.execSQL("DROP TABLE IF EXIST " +DATABSE_TABLE);
            db.execSQL("DROP TABLE IF EXIST " +TABLE_NAME);
            db.execSQL("DROP TABLE IF EXIST " +DATA_TABLE);
            onCreate(db);
        }
    }
public  Newclass(Context c){
    ourcontext=c;
}
    public Newclass open() throws SQLException{
        ourhelper=new DBhelper(ourcontext);
        ourDatabase=ourhelper.getWritableDatabase();
        return this;
    }

    public void close(){
        ourhelper.close();
    }

//CREATE Entry
//1
    public long createEntry(String name,String number){

        ContentValues cv=new ContentValues();
        cv.put(NAME,name);
        cv.put(NUMBER,number);
       return ourDatabase.insert(DATABSE_TABLE,null,cv);

    }
 //2
    public long createEntry1(String name){
        ContentValues cv=new ContentValues();
        cv.put(NAME,name);

        return ourDatabase.insert(TABLE_NAME,null,cv);

    }

//3

    public long createEntry2(String name,String number){

        ContentValues cv=new ContentValues();
        cv.put(NAME,name);
        cv.put(NUMBER,number);
        return ourDatabase.insert(DATA_TABLE,null,cv);

    }


    public String getdata() {

        String columns[]=new String[]{KEY_ID,NAME,NUMBER};
        Cursor c=ourDatabase.query(DATABSE_TABLE,columns,KEY_ID + "<11",null,null,null,null);
        String result=" ";


        int irow=c.getColumnIndex(KEY_ID);
        int iname=c.getColumnIndex(NAME);
        int inumber=c.getColumnIndex(NUMBER);




        for(c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
            result = result + c.getString(irow) + "        " + c.getString(iname) + "            " + c.getString(inumber) + "\n";
        }
        return result;
    }

    public String getdata1() {

        String columns[] = new String[]{KEY_ID, NAME};
        Cursor c = ourDatabase.query(TABLE_NAME, columns, KEY_ID+ "<7", null, null, null, null);
        String result = " ";


        int irow = c.getColumnIndex(KEY_ID);
        int iname = c.getColumnIndex(NAME);



        for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
            result = result + c.getString(irow) + "                  " + c.getString(iname) +"\n";
        }
        return result;
    }
    public String getdata3() {

        String columns[]=new String[]{KEY_ID,NAME,NUMBER};
        Cursor c=ourDatabase.query(DATA_TABLE,columns,KEY_ID + "<11",null,null,null,null);
        String result=" ";


        int irow=c.getColumnIndex(KEY_ID);
        int iname=c.getColumnIndex(NAME);
        int inumber=c.getColumnIndex(NUMBER);




        for(c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
            result = result + c.getString(irow) + "        " + c.getString(iname) + "            " + c.getString(inumber) + "\n";
        }
        return result;
    }

    public String getName(long l) {

        String columns[]=new String[]{KEY_ID,NAME,NUMBER};
        Cursor c=ourDatabase.query(DATABSE_TABLE,columns,KEY_ID + " = " + l,null,null,null,null);
        if(c!=null)
        {
            c.moveToFirst();
            String name=c.getString(1);
            return name;
        }
        return null;
    }


    public String getName1(long l) {

        String columns[]=new String[]{KEY_ID,NAME};
        Cursor c=ourDatabase.query(TABLE_NAME,columns,KEY_ID + " = " + l,null,null,null,null);
        if(c!=null)
        {
            c.moveToFirst();
            String name=c.getString(1);
            return name;
        }
        return null;
    }


    public String getNumber(long l) {

        String columns[]=new String[]{KEY_ID,NAME,NUMBER};
        Cursor c=ourDatabase.query(DATABSE_TABLE,columns,KEY_ID + " = " + l,null,null,null,null);
        if(c!=null)
        {
            c.moveToFirst();
            String number=c.getString(2);
            return number;
        }
    return null;
    }
    public String getNumber(String s) {

        String columns[]=new String[]{KEY_ID,NAME,NUMBER};
        Cursor c=ourDatabase.query(DATA_TABLE,columns," NAME=?", new String[]{s},null,null,null);
        if(c!=null)
        {
            c.moveToFirst();
            String number=c.getString(2);
            return number;
        }
        return null;
    }

    public void updateEntry(long ll, String personnamemodify, String personnumbermodify) {

        ContentValues cvup=new ContentValues();
        cvup.put(NAME,personnamemodify);
        cvup.put(NUMBER,personnumbermodify);
        ourDatabase.update(DATABSE_TABLE,cvup,KEY_ID + " = " + ll,null);

    }

    public void updateEntry1(long ll, String personnamemodify) {

        ContentValues cvup=new ContentValues();
        cvup.put(NAME,personnamemodify);

        ourDatabase.update(TABLE_NAME,cvup,KEY_ID + " = " + ll,null);

    }


}
