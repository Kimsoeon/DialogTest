package soeonkim.kr.hs.emirim.myapplication;

import android.support.v7.app.AlertDialog;
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
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);//getApplicationContext() 대화상자가 어느 액티비티에 만들어지는지 매개변수로 넣으면됨
        dialog.setTitle("Lunatic-Hai");
        dialog.setIcon(R.drawable.dog); //안드로이드 아이콘 보여주고싶으면 R.mipmap.뭐 하면됨(왼쪽 mipmap폴더 참고)
        dialog.setMessage("때지야!!");
        dialog.setPositiveButton("사랑해",null); //두번째 매개변수는 버튼 클릭했을때 어떤 리스너 쓸껀지. 지금은 그냥 모양만 넣음
        dialog.show(); // 보임. 이거 안하면 의미 x

    }
}
