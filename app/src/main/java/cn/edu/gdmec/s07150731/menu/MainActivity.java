package cn.edu.gdmec.s07150731.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText tEdit1;
    private EditText tEdit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        tEdit1 = (EditText) findViewById(R.id.editText1);
        tEdit2 = (EditText) findViewById(R.id.editText2);
        registerForContextMenu(tEdit1);
        registerForContextMenu(tEdit2);
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        switch (v.getId()){
            case R.id.editText1:
                menu.add(0,1,0,"菜单项1");
                menu.add(0,2,0,"菜单项2");
                menu.add(0,3,0,"菜单项3");
                break;

            case R.id.editText2:
                menu.add(0,4,0,"菜单项4");
                menu.add(0,5,0,"菜单项5");
                menu.add(0,6,0,"菜单项6");
                break;
        }
        super.onCreateContextMenu(menu,v,menuInfo);
    }

        public boolean onCreateOptionsMenu(Menu menu){
            menu.add(Menu.NONE,1,Menu.NONE,"添加");
            menu.add(Menu.NONE,2,Menu.NONE,"删除");
            menu.add(Menu.NONE,3,Menu.NONE,"保存").setIcon(android.R.drawable.ic_menu_edit);
            menu.add(Menu.NONE,4,Menu.NONE,"退出");
            return true;
        }

        public boolean onOptionsItemSelected(MenuItem item){
            switch(item.getItemId()){
                case 1:
                    setTitle("菜单添加事件!");
                    break;
                case 2:
                    setTitle("菜单删除事件!");
                    break;
                case 3:
                    setTitle("菜单保存事件!");
                    break;
                case 4:
                    setTitle("菜单退出事件!");
                    break;
            }
            return true;
        }


    public boolean onContextItemSelected(MenuItem item){
        switch(item.getItemId()){
            case 1:
            case 2:
            case 3:
                setTitle(item.getTitle()+"被按下");
                break;

            case 4:
            case 5:
                setTitle(item.getTitle()+"被按下");
                break;
        }
        return true;
    }

 
}
