package com.example.yangxiaochun.myandroidproject.activity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yangxiaochun.myandroidproject.R;
import com.example.yangxiaochun.myandroidproject.view.FlowLayout;
import com.example.yangxiaochun.myandroidproject.view.flowlayout.TagAdapter;
import com.example.yangxiaochun.myandroidproject.view.flowlayout.TagFlowLayout;
import com.example.yangxiaochun.myandroidproject.view.flowlayout.TagView;

import java.util.Arrays;

public class FlowLayoutActivity extends AppCompatActivity {
    private FlowLayout flowLayout;
    private TagFlowLayout tagFlowLayout;
    private AppCompatActivity mActivity;
    private String[] mVals = new String[]
            {"Hello 1", "Android1", "Weclome Hi1 ", "Button1", "TextView1","Hello 2", "Android2", "Weclome Hi2 ", "Button2", "TextView2"
            ,"Hello 3", "Android3", "Weclome Hi3 ", "Button3", "TextView3","Hello 4", "Android4", "Weclome Hi4 ", "Button4", "TextView4",
                    "Hello 5", "Android5", "Weclome Hi5 ", "Button5", "TextView5",
                    "Hello 6", "Android6", "Weclome Hi6 ", "Button6", "TextView6",
                    "Hello 7", "Android7", "Weclome Hi7 ", "Button7", "TextView7",
                    "Hello 8", "Android8", "Weclome Hi8 ", "Button8", "TextView8",
                    "Hello 9", "Android9", "Weclome Hi9 ", "Button9", "TextView9",
                    "Hello 10", "Android10", "Weclome Hi11 ", "Button11", "TextView11"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flowlayout);
        mActivity=this;
        initView();
    }

    private void initView() {
        tagFlowLayout=findViewById(R.id.tagFlowLayout);
        //flowLayout=findViewById(R.id.flowLayout);
       /*
        String[] dummyTexts = getResources().getStringArray(R.array.lorem_ipsum);
        for(String text:dummyTexts){
            final TextView textView=buildLabel(text);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), textView.getText().toString(), Toast.LENGTH_LONG).show();
                }
            });
            flowLayout.addView(textView);
        }
*/

        //final LayoutInflater mInflater = LayoutInflater.from(mActivity);
        tagFlowLayout.setAdapter(new TagAdapter<String>(Arrays.asList(mVals))
        {

            @Override
            public View getView(com.example.yangxiaochun.myandroidproject.view.flowlayout.FlowLayout parent, int position, String s)
            {
                TextView textView=buildLabel(s);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), textView.getText().toString(), Toast.LENGTH_LONG).show();
                    }
                });
                return textView;
            }
        });
        tagFlowLayout.setOnTagClickListener(new TagFlowLayout.OnTagClickListener() {
            @Override
            public boolean onTagClick(View view, int position, com.example.yangxiaochun.myandroidproject.view.flowlayout.FlowLayout parent) {
                Toast.makeText(getApplicationContext(), mVals[position], Toast.LENGTH_LONG).show();
                int size =tagFlowLayout.getChildCount();
                for(int i=0;i<size;i++){
                    TagView tagView=(TagView)tagFlowLayout.getChildAt(i);
                    Log.v("FlowlayoutActivity", tagView.isCover() + " index "+i +"   "+ ((TextView)tagView.getTagView()).getText());
                }
                return true;
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
        int count=tagFlowLayout.getChildCount();
        for (int i = 0; i < count; i++) {
            TagView tagView = (TagView) tagFlowLayout.getChildAt(i);
            Log.v("TagFlowLayout", tagView.isCover() + "");
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int count=tagFlowLayout.getChildCount();
        for (int i = 0; i < count; i++) {
            TagView tagView = (TagView) tagFlowLayout.getChildAt(i);
            Log.v("TagFlowLayout2", tagView.isCover() + "");
        }
    }

    private TextView buildLabel(String text) {
        TextView textView = new TextView(this);
        textView.setText(text);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        textView.setPadding((int) dpToPx(16), (int) dpToPx(8), (int) dpToPx(16), (int) dpToPx(8));
        textView.setBackgroundResource(R.drawable.gf_cuisine_bg);

        return textView;
    }
    private float dpToPx(float dp) {
        return TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, dp, getResources().getDisplayMetrics());
    }
}
