package com.lawlait.myapplication;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Bean.DataBean.ProfessionListBean> profession_list;
    Message mMessage = Message.obtain();
    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Bean mbean = ((Bean) msg.obj);
            profession_list = mbean.data.profession_list;
            Myadataer adapter = new Myadataer();

            mListView.setAdapter(adapter);
        }
    };
    private ExpandableListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = findViewById(R.id.expand_list);
        OkHttpClient mOkHttpClient = new OkHttpClient();

        final Request request = new Request.Builder()
                .url("https://www.aaaaa100.cn/development.php/ent/Innerrecruit/recruit_job_detail?token=4cfdb12804ea4b1b9806e76d1a3a6e64&p_id=787")
                .build();

        Call call = mOkHttpClient.newCall(request);
        //请求加入调度
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {


            }

            @Override
            public void onResponse(final Response response) throws IOException {
                //String htmlStr =  response.body().string();
                String msg = response.body().string().toString();
                Gson gson = new Gson();
                Bean bean = gson.fromJson(msg, Bean.class);
                Log.d("s", bean.data.profession_list.get(0).profession_name);
                mMessage.obj = bean;
                mHandler.sendMessage(mMessage);

            }
        });
    }


    class Myadataer extends BaseExpandableListAdapter {

        @Override
        public int getGroupCount() {
            return profession_list.size() == 0 ? 0 : profession_list.size();
        }

        @Override
        public int getChildrenCount(int groupPosition) {
            Bean.DataBean.ProfessionListBean professionListBean = profession_list.get(groupPosition);
            return professionListBean.work_group.size() == 0 ? 0 : professionListBean.work_group.size();
        }

        @Override
        public Object getGroup(int groupPosition) {
            return profession_list.get(groupPosition);
        }

        @Override
        public Object getChild(int groupPosition, int childPosition) {
            return profession_list.get(groupPosition).work_group.get(childPosition);
        }

        @Override
        public long getGroupId(int groupPosition) {
            return groupPosition;
        }

        @Override
        public long getChildId(int groupPosition, int childPosition) {
            return childPosition;
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

        @Override
        public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
            GroupViewHolder groupViewHolder;
            if (convertView == null) {

                convertView = LayoutInflater.from(MainActivity.this).inflate(R.layout.item_expand_group, parent, false);
                groupViewHolder = new GroupViewHolder();
                groupViewHolder.tvTitle = (TextView) convertView.findViewById(R.id.label_group_normal);
                convertView.setTag(groupViewHolder);
            } else {
                groupViewHolder = (GroupViewHolder) convertView.getTag();
            }
            groupViewHolder.tvTitle.setText(profession_list.get(groupPosition).profession_name);
            return convertView;

        }

        @Override
        public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
            ChildViewHolder childViewHolder;
            if (convertView == null) {
                convertView = LayoutInflater.from(MainActivity.this).inflate(R.layout.item_expand_child, parent, false);
                childViewHolder = new ChildViewHolder();
                childViewHolder.tvTitle = (TextView) convertView.findViewById(R.id.label_expand_child);
                convertView.setTag(childViewHolder);
            } else {
                childViewHolder = (ChildViewHolder) convertView.getTag();
            }
            String group_type = profession_list.get(groupPosition).work_group.get(childPosition).group_type;
            childViewHolder.tvTitle.setText(group_type);
            return convertView;


        }

        @Override
        public boolean isChildSelectable(int groupPosition, int childPosition) {
            return false;
        }
    }


    static class GroupViewHolder {
        TextView tvTitle;
    }

    static class ChildViewHolder {
        TextView tvTitle;
    }
}
