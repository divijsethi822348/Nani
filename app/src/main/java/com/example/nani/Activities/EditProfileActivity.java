package com.example.nani.Activities;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nani.R;

public class EditProfileActivity extends AppCompatActivity implements View.OnClickListener {
    Button save;
    ImageView back;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        initIds();
        setClicks();
    }

    private void setClicks() {
        back.setOnClickListener(this);
        save.setOnClickListener(this);
    }

    private void initIds() {
        save=findViewById(R.id.save_button_edit_profile);
        back=findViewById(R.id.appbar_small_image1);
        title=findViewById(R.id.title_app_bar_small);
        title.setText("Edit Profile");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.save_button_edit_profile:
                finish();
                break;
            case R.id.appbar_small_image1:
                finish();
                break;
        }
    }

//    private void changePic() {
//        checkPermision();
//        PopupMenu popupMenu=new PopupMenu(EditProfileActivity.this,);
//        popupMenu.getMenuInflater().inflate(R.menu.camera_intent_menu,popupMenu.getMenu());
//
//        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                switch (item.getItemId()){
//                    case R.id.take_pic:
//                        Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                        startActivityForResult(intent,10);
//                        break;
//
//                    case R.id.select_pic:
//                        Intent intent2=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//                        startActivityForResult(intent2, 11);
//                        break;
//
//
//                }
//                return true;
//            }
//        });
//
//        popupMenu.show();
//
//    }
//    private void checkPermision() {
//        if (ActivityCompat.checkSelfPermission(EditProfileActivity.this, Manifest.permission.CAMERA)!= PackageManager.PERMISSION_GRANTED || ActivityCompat.checkSelfPermission(EditProfileActivity.this,Manifest.permission.READ_EXTERNAL_STORAGE)!=PackageManager.PERMISSION_GRANTED || ActivityCompat.checkSelfPermission(EditProfileActivity.this,Manifest.permission.WRITE_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED)
//        {
//            ActivityCompat.requestPermissions(EditProfileActivity.this,new String[]{Manifest.permission.CAMERA,Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE},100);
//
//        }
//        else{
//            Toast.makeText(this, "Everything On", Toast.LENGTH_SHORT).show();
//        }
//
//    }
}
