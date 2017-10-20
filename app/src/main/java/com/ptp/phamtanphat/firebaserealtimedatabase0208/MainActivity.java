package com.ptp.phamtanphat.firebaserealtimedatabase0208;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        //Kiểu 1 : String
        //Tạo child
//        mDatabase.child("SinhVien1").child("Sinh Viên trường đại học").setValue("Công Nghiệp");
//        Kiểu 2 : long
//        mDatabase.child("Xemay").child("Honda").setValue(100);
//        Kiểu 3 :Map
//        Map<String,String> map = new HashMap<>();
//        map.put("Xe","Xe đạp");
//        mDatabase.child("Phuongtien").setValue(map);
//        Kiểu 4 : Object
//        Nhanvien nhanvien = new Nhanvien("Nguyễn Văn Hùng",25);
//        mDatabase.child("Nhanvien").setValue(nhanvien);
//        Kiểu 5 : sử dụng push dữ liệu để auto id và lắng khi tạo dữ liệu thành công
//        Nhanvien nhanvien = new Nhanvien("Nguyễn Văn Tuấn",27);
//        mDatabase.child("Nhanvien").push().setValue(nhanvien, new DatabaseReference.CompletionListener() {
//            @Override
//            public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
//                if(databaseError == null){
//                    Toast.makeText(MainActivity.this, "Tạo thành công", Toast.LENGTH_SHORT).show();
//                }else {
//                    Toast.makeText(MainActivity.this, "Lỗi", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
        //Lấy dữ liệu về
//        Kiểu 1 : Sự kiện realtimedatabase
//        final TextView txt = (TextView) findViewById(R.id.textview);
//        mDatabase.child("Hoten").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                String hoten = (String) dataSnapshot.getValue();
//                txt.setText(hoten);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
//        Kiểu 2 : Lấy dữ toàn bộ nodelist
        mDatabase.child("Nhanvien").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Nhanvien nhanvien = dataSnapshot.getValue(Nhanvien.class);
                Log.d("BBBB",nhanvien.getTennv());
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
