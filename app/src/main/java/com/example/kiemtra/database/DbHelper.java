package com.example.kiemtra.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    public DbHelper(@Nullable Context context) {
        super(context, "QLSanPham", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE SanPham(MaSP INTEGER PRIMARY KEY AUTOINCREMENT, " + "TenSP TEXT, GiaTien REAL, Image TEXT)";
        db.execSQL(sql);
        String data = "INSERT INTO SanPham VALUES(1, 'Pho bo', '30000', 'https://vit29.com/media/product/229_ph____b___29.jpg')," +
                "(2, 'Bun cha ha noi', '35000', 'https://statics.vinwonders.com/bun-cha-ha-noi-3_1688011791.jpg')," +

                "(3, 'Bia tiger ', '17000', 'https://cooponline.vn/wp-content/uploads/2022/11/bia-tiger-crystal-lon-330ml-2023228.jpg')," +
                "(4, 'Sting ', '10000', 'https://tea-3.lozi.vn/v1/ship/resized/losupply-quan-tan-phu-quan-tan-phu-ho-chi-minh-1618467447167540212-nuoc-tang-luc-sting-vang-320ml-0-1631366947?w=480&type=o')" ;

        db.execSQL(data);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        if (i != i1){
            db.execSQL("DROP TABLE IF EXISTS SanPham");
            onCreate(db);
        }
    }
}
