package com.example.tppatisserie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class PatisserieAdapter extends ArrayAdapter<Cpatisserie> implements Filterable {
    private Context context;
    private int viewRes;
    private List<Cpatisserie> ArrayPatisserie;
    private List<Cpatisserie> listFiltre;


    public PatisserieAdapter(Context context, int textViewResourceId, ArrayList<Cpatisserie>patisseries){
        super(context,textViewResourceId,patisseries);
        this.ArrayPatisserie=patisseries;
        this.context=context;
        this.viewRes=textViewResourceId;
        this.listFiltre=patisseries;
    }
    public View getView(int position, View ConvertView, ViewGroup parent){
        View view = ConvertView;
        ViewHolder holder;
        if (view == null){
            LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=layoutInflater.inflate(viewRes,parent,false);
            holder = new ViewHolder();
            holder.Name = (TextView) view.findViewById(R.id.nom);
            holder.Description= (TextView) view.findViewById(R.id.description);
            holder.Image=(ImageView)view.findViewById(R.id.image);
            view.setTag(holder);
        }
        else{
            holder=(ViewHolder) view.getTag();
        }
         Cpatisserie cpatisserie = listFiltre.get(position);
        if(cpatisserie != null){
            final String nomPatisserie = String.format("Nom de la patisserie: %s", cpatisserie.getNomPatisserie());
            holder.Name.setText(nomPatisserie);
            final String descriptionPatisserie = String.format("Description: %s", cpatisserie.getDesPatisserie());
            holder.Description.setText(descriptionPatisserie);
            holder.Image.setImageResource(cpatisserie.getImagePatisserie());
        }
        return view;
    }
    public Cpatisserie getItemAtPosition(int position){
        return listFiltre.get(position);
    }
    public int getCount(){
        return listFiltre.size();
    }

    @NonNull
    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                String bwah=constraint.toString();
                if (bwah.isEmpty()){
                    listFiltre=ArrayPatisserie;
                }
                else {
                    List<Cpatisserie> temp=new ArrayList<>();
                    for (Cpatisserie a : ArrayPatisserie){
                        if (a.getNomPatisserie().toLowerCase().contains(bwah.toLowerCase())){
                            temp.add(a);
                        }
                    }
                    listFiltre = temp;
                }
                FilterResults results = new FilterResults();
                results.values = listFiltre;
                return results;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                listFiltre = (ArrayList<Cpatisserie>)results.values;
                notifyDataSetChanged();
            }
        };
    }
}
class ViewHolder{
    TextView Name;
    TextView Description;
    ImageView Image;
}
