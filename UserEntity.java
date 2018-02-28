package com.annaru.wanglei.test;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.view.View;

/**
 * Created by wanglei on 2018/2/27.
 */

public class UserEntity extends BaseObservable{

    public String name ;
    public String sex;
    public int age ;
    public int type;
    public ObservableField<String> address = new ObservableField<>();
    public ObservableField<String> img = new ObservableField<>();

    public ObservableField<Boolean> checked = new ObservableField<>();
    public ObservableField<String> color = new ObservableField<>();

    public String initType(int type){
        String result;
        switch (type){
            case 1:
                result = "程序猿";
                break;
            case 2:
                result = "程序猿的天敌";
                break;
            default:
                result = "无业游民";
                break;
        }
        return result;
    }

    public void changeAddress(View view){
        address.set("change:" + address.get());
    }

    public void addAge(View view) {
        setAge(getAge() + 1);
    }


//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
//        notifyChange();//刷新所有可刷新数据
        notifyPropertyChanged(BR.age);
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


}
