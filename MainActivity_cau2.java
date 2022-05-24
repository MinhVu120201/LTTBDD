package tmv61131565.baithoquehuong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Data
        ArrayList<String> listSong =  new ArrayList<String>();
        listSong.add("tho");
        listSong.add("tho_ve_que_huong");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listSong);
        ListView lv= (ListView)findViewById(R.id.listView_Cac_bai_tho);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String tenTho = listSong.get(i);
                Intent intentT = new Intent(MainActivity.this, ShowLyricActivity.class);
                intentT.putExtra("tenT",tenTho);
                startActivity(intentT);
            }
        });
    }


}