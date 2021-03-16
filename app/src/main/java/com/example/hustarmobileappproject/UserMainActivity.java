package com.example.hustarmobileappproject;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;
import com.example.hustarmobileappproject.StringTagName;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class UserMainActivity extends AppCompatActivity {

    // Debug Variable;
    private static final boolean                D           = true;
    private static final String                 TAG         = "UserMainActivity";

    // Member Variable
    private String                              myJSON;
    private String                              addressUrl;
    private JSONArray                           categoires     = null;
    private ArrayList<HashMap<String, String>>  categoryList;

    // View Variable
    private EditText searchEditText;
    private GridLayout categoryListGridLayout;


    // UserMainActivity's Override Method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate() Start");
        setContentView(R.layout.activity_main); // user_main_layout
        init();
        getData(addressUrl);
        getCategoryList();
        Log.i(TAG, "onCreate() Finish");
    }


    // UserMainActivity's Member Method

    // View 내 id를 통해 View 객체를 가져옴
    public void init() {
        // searchEditText = findViewById(R.id.searchEditText);
        // categoryListGridLayout = findViewById(R.id.categoryListGridLayout);
        addressUrl = "http://10.1.4.122/getStoreCategory.php";
        categoryList = new ArrayList<>();
        Log.i(TAG, "init()");
    }

    // 화면 내 GridLayout에 카테고리 버튼 리스트 출력
    public void getCategoryList() {
        Log.i(TAG, "getCategoryList()");
        for(int i=0; i<categoryList.size(); i++) {
            Button categoryButton = new Button(this);
            // 카테고리 화면 클릭 시, 해당 카테고리 이름과 함께 UserCategoryActivity로 이동
            // categoryButton.setBackgroundResource(); image 불러오는 부분
            categoryButton.setText(categoryList.get(i).get(StringTagName.TAG_STORE_CATEGORY_NAME));
            Log.i(TAG, "getCategoryList() value => " + categoryList.get(i).get("store_category_name"));

            categoryButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent moveToUserCategoryPageActivity = new Intent(UserMainActivity.this, UserCategoryPageActivity.class);
                    moveToUserCategoryPageActivity.putExtra("CategoryName", ((Button)v).getText().toString());
                    startActivity(moveToUserCategoryPageActivity);
                }
            });
            categoryListGridLayout.addView(categoryButton);
        }
    }

    public void showList() {
        Log.i(TAG, "showList()");
        try {
            JSONObject jsonObj = new JSONObject(myJSON);
            categoires = jsonObj.getJSONArray(StringTagName.TAG_RESULT); // jsonobject가 배열 형태로 있음(모음)

            for(int i=0; i<categoires.length(); i++) {
                JSONObject c = categoires.getJSONObject(i);
                String storeCategorySeq = c.getString(StringTagName.TAG_STORE_CATEGORY_SEQ);
                String storeCategoryName = c.getString(StringTagName.TAG_STORE_CATEGORY_NAME);

                HashMap<String, String> category = new HashMap<String, String>();

                category.put(StringTagName.TAG_STORE_CATEGORY_SEQ, storeCategorySeq);
                category.put(StringTagName.TAG_STORE_CATEGORY_NAME, storeCategoryName);

                categoryList.add(category);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void getData(String url) {
        class GetDataJSON extends AsyncTask<String, Void, String> {
            // 쓰레드에 의해 처리될 내용을 담은 함수
            // params : execute 함수의 인자로 전달되는 값(...은 배열이라고 생각)
            // execute 함수에 의해 호출
            @Override
            protected String doInBackground(String... params) {
                String uri = params[0];
                Log.i(TAG, uri);
                BufferedReader bufferedReader = null;

                Log.i(TAG, "doInBackground() Start");
                try {
                    URL url = new URL(uri);
                    HttpURLConnection con = (HttpURLConnection)url.openConnection(); // 전달받은 url을 통해 연결
                    StringBuilder sb = new StringBuilder();

                    bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream())); // inputstream을 통해 php 실행 결과 가져옴(json)
                    String json;
                    while((json = bufferedReader.readLine()) != null) {
                        Log.i(TAG, "가져온 값 => " + json);
                        sb.append(json + "\n");
                    }
                    Log.i(TAG, "doInBackground() Finish");
                    return sb.toString().trim(); // onPostExecute 함수로 넘겨주는 값
                } catch (Exception e) {
                    return null;
                }
            }
            // AsyncTask의 모든 작업이 완료된 후 가장 마지막에 호출(doInBackground 함수의 최종 값을 받기 위해)
            // result : json형태의 값(전체 뭉탱이)
            @Override
            protected void onPostExecute(String result) {
                Log.i(TAG, "onPostExecute() Start");
                myJSON = result;
                Log.i(TAG, "onPostExecute() myJSON => " + myJSON);
                showList();
                Log.i(TAG, "onPostExecute() Finish");
            }
        }

        GetDataJSON g = new GetDataJSON();
        g.execute(url);
    }
}