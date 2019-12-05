package subodh.com.springlibrary.dataprovider;

import java.util.ArrayList;

import subodh.com.springlibrary.model.RecyclerModel;

public class DataProvider {


    public static ArrayList<RecyclerModel> getData(){
        ArrayList<RecyclerModel> recyclerModelArrayList=new ArrayList<>();
       for (int i=0;i<=5;i++){
           recyclerModelArrayList.add(new RecyclerModel("Kriti Sanon","Kriti","https://www.deccanherald.com/sites/dh/files/styles/article_detail/public/article_images/2017/08/17/628486.jpg?itok=-3oN3Cys"));
           recyclerModelArrayList.add(new RecyclerModel("Kajal Aggarwal","Kajal Aggarwal","https://images-na.ssl-images-amazon.com/images/I/81RRWES0ZDL._SL1500_.jpg"));
           recyclerModelArrayList.add(new RecyclerModel("Rakul Preet Singh","Rakul Preet Singh","https://i.pinimg.com/originals/41/fd/72/41fd721b01a423bcb7105c3fe208b3de.jpg"));
           recyclerModelArrayList.add(new RecyclerModel("Disha Patani","Disha Patani","https://cdn2.stylecraze.com/wp-content/uploads/2014/12/184-15-bollywood-stars-without-makeup.jpg"));
           recyclerModelArrayList.add(new RecyclerModel("Tania","Tania","https://upload.wikimedia.org/wikipedia/commons/3/3f/Tania_at_photoshoot.jpg"));
           recyclerModelArrayList.add(new RecyclerModel("Anjali","Anjali","https://tamilactressdiary.com/wp-content/uploads/2018/02/Anjali-actress-Age-Husband-marriage-height-weightmovies-list-2.jpg"));
           recyclerModelArrayList.add(new RecyclerModel("Sonali Bendre","Sonali Bendre","https://detwxg7gzm61n.cloudfront.net/2018/07/05101146/Image_8-3.jpg"));
           recyclerModelArrayList.add(new RecyclerModel("Sneha","Sneha","https://upload.wikimedia.org/wikipedia/commons/8/85/Sneha_at_Un_Samayal_Arayil_Press_Meet.jpg"));
           recyclerModelArrayList.add(new RecyclerModel("Pooja Hegde","Pooja Hegde","https://cdn6.newsnation.in/images/photos/big/poojahege1-5559.jpg"));
           recyclerModelArrayList.add(new RecyclerModel("Sai Manjerkar","Sai Manjerkar","http://im.rediff.com/movies/2019/oct/23saiee-manjrekar1.jpg"));

       }


        return recyclerModelArrayList;
    }
}
