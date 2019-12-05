package subodh.com.springlibrary.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.net.URL;
import java.util.ArrayList;

import subodh.com.recyclerviewanimation.animatedRecyclerView.AdapterCustomAnimationType;
import subodh.com.recyclerviewanimation.animatedRecyclerView.AdapterAnimator;
import subodh.com.springlibrary.R;
import subodh.com.springlibrary.activity.NetworkImageView;
import subodh.com.springlibrary.model.RecyclerModel;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    Context mContext;
    ArrayList<RecyclerModel> recyclerModelArrayList;
    private AdapterAnimator mAnimator;


    public RecyclerAdapter(Context mContext, ArrayList<RecyclerModel> recyclerModelArrayList, RecyclerView recyclerView, AdapterCustomAnimationType TYPE) {
        this.mContext = mContext;
        this.recyclerModelArrayList = recyclerModelArrayList;

        mAnimator = new AdapterAnimator(recyclerView);
        mAnimator.setSpringAnimationType(TYPE);
        mAnimator.addConfig(200, 50);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item, parent, false);

        mAnimator.onSpringItemCreate(itemView);
        return new MyViewHolder(itemView);

//        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        RecyclerModel recyclerModel = recyclerModelArrayList.get(position);


//        Glide.with(mContext).load(recyclerModel.getImage()).into(holder.recyclerImage);

        try {
            holder.recyclerImage.setImageURL(new URL(recyclerModel.getImage()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        holder.name.setText(recyclerModel.getName());
        holder.nickName.setText(recyclerModel.getNickName());
        mAnimator.onSpringItemBind(holder.itemView, position);

    }

    @Override
    public int getItemCount() {
        return recyclerModelArrayList.size();
    }

    public void clear() {
        recyclerModelArrayList.clear();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        NetworkImageView recyclerImage;
        TextView name, nickName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            recyclerImage = (NetworkImageView) itemView.findViewById(R.id.recyclerImage);
            name = itemView.findViewById(R.id.name);
            nickName = itemView.findViewById(R.id.nickname);

        }
    }
}
