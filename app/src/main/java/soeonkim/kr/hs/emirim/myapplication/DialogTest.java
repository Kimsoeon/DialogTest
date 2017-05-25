package soeonkim.kr.hs.emirim.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DialogTest extends AppCompatActivity implements View.OnClickListener{ //현재 클래스가 리스너가됨.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_test);
        Button butDialog = (Button)findViewById(R.id.but_dialog);
        butDialog.setOnClickListener(this); //이벤트 감지를 위해 리스너 설정 (클릭되는지 감시) 이벤트 발생되면 처리자에게 일을 시킴
    }


    @Override
    public void onClick(View v) {

    }
}
