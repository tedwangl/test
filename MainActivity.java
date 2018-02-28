package com.annaru.wanglei.test;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.databinding.Observable;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.annaru.wanglei.test.databinding.DataBingMain;

@Route(path = "/activity/main")
public class MainActivity extends AppCompatActivity {

    private DataBingMain viewDataBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewDataBinding = DataBindingUtil.setContentView(this,R.layout.activity_main,new MyComponent());
        UserEntity user = new UserEntity();
        user.name="lxf";
        user.setSex("man");
        user.setAge(25);
        user.setType(1);
        user.address.set("长沙");
        user.img.set("https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png");
        user.checked.set(true);
        user.color.set("#de3654");

        //3.绑定数据
        viewDataBinding.setUser(user);
        viewDataBinding.setUtil(new TestUtil());
        user.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable observable, int i) {
                if (i == BR.age){
                    Toast.makeText(getApplicationContext(),"age刷新了", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @BindingAdapter({"url","placeholder"})
    public static void setImage(ImageView imageView, String url, int placeHolder){
        ImgLoadUtil.load(imageView,url,placeHolder);
    }
}
