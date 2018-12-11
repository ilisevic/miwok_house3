package com.example.mladen.miwok_house;

public class Word {
 private   String eng;
  private  String miwok;

   public  Word ( String e, String m)
    {
        this.eng= e;
        this.miwok= m;


    }
    public String getMiwok ()
    {
        return  this.miwok;

    }

    public String getEng()
    {
        return this.eng;

    }


}
