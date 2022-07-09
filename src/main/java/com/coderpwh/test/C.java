package com.coderpwh.test;

import java.util.Map;

public class C {

     private Map m;


     public void setM(Map m){
         this.m=m;
     }

     public   Map getM(){
         return this.m;
     }

     public Map cc(){
         return  getM();
     }




}
