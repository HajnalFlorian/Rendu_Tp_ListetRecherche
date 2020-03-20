package com.example.tppatisserie;

public class Cpatisserie {
    private String nomPatisserie;
    private String desPatisserie;
    private int imagePatisserie;
    private String recettePatisserie;

    public Cpatisserie(){
        this.imagePatisserie=imagePatisserie;
        this.desPatisserie=desPatisserie;
        this.nomPatisserie=nomPatisserie;
        this.recettePatisserie=recettePatisserie;
    }
    // getteurs
    public String getNomPatisserie(){
        return nomPatisserie;
    }
    public String getDesPatisserie(){
        return  desPatisserie;
    }
    public int getImagePatisserie(){return imagePatisserie;}

    public String getRecettePatisserie() {
        return recettePatisserie;
    }

    //setteurs
    public void setNomPatisserie(String nomPatisserie){
        this.nomPatisserie=nomPatisserie;
    }
    public void setDesPatisserie(String desPatisserie){
        this.desPatisserie=desPatisserie;

    }
    public void setImagePatisserie(int imagePatisserie){
        this.imagePatisserie=imagePatisserie;
    }

    public void setRecettePatisserie(String recettePatisserie) {
        this.recettePatisserie = recettePatisserie;
    }
}
