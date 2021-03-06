package bwie.com.gouwuwu.presenter;

import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;

import bwie.com.gouwuwu.bean.InfoDatas;
import bwie.com.gouwuwu.model.IRecyModel;
import bwie.com.gouwuwu.model.RecyModel;
import bwie.com.gouwuwu.utils.OnUiCallback;
import bwie.com.gouwuwu.view.IRecyView;
import okhttp3.Call;

/**
 * Created by BAIPEI on 2017/12/13.
 */

public class RecyPresenter {
    private IRecyView view;
    private IRecyModel model;

    public RecyPresenter(IRecyView view) {
        this.view = view;
        model = new RecyModel();
    }

    public void showRecy(){
        model.recy(new OnUiCallback() {

            private InfoDatas infoDatas;

            @Override
            public void onFailed(Call call, IOException e) {

            }

            @Override
            public void onSuccess(String result) throws IOException {
                Log.i("ss",result);
                Gson gson = new Gson();
                infoDatas = gson.fromJson(result, InfoDatas.class);
                view.showRecy(infoDatas);
            }
        });
    }

    //解绑
        public void onDestory(){
        view = null;
    }

}
