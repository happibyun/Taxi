package com.my.taxi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by KITRI on 2017-06-07.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private List<String> labels;
    //생성자
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView text1;
        public ViewHolder(View itemView) {
            super(itemView);
            text1 = (TextView) itemView.findViewById(R.id.start_spot);
        }
    }

    public RecyclerViewAdapter(List<String> labels) {
        this.labels = labels; //외부에서 List데이터 만들어 받아서 사용
    }

    @Override
    public int getItemCount() {
         return labels.size();
    }

    //레이아웃을 만들어 holder에 저장
    //레이아웃 폴더의 a_item.xml 파일을 가져와서 ViewHolder에 담아주는 셈
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.b_item, parent, false);
        return new ViewHolder(view);
    }

    //넘겨받은 데이터를 화면에 출력하는 역할
    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, final int position) {
        holder.text1.setText(labels.get(position));
        holder.text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), labels.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * 뷰 재활용을 위한 viewHolder
     */
/*    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView img;
        public TextView textTitle;

        public ViewHolder(View itemView){
            super(itemView);

            *//*img = (ImageView) itemView.findViewById(R.id.imgProfile);
            textTitle = (TextView) itemView.findViewById(R.id.textTitle);*//*
        }
    }*/

}
