import java.util.ArrayList;
import greenfoot.*;
/**
 * Write a description of class FoodBoard_Number_Factory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FoodBoard_Number_Factory implements Factory 
{
  
    Object images[]=new Object[10];
    Number_Image image=new Number_Image();
    ArrayList list=new ArrayList<Object>();
  
    public Number_Image makeImage(int count){
        int units=count%10;
        int digits=count%100;
      //for (int i=0;i<9;i++){
        //   images[i]=new GreenfootImage("number_"+i+".png");
      //}
            images[0]=new GreenfootImage("number_0.png");
            images[1]=new GreenfootImage("number_1.png");
            System.out.println(images[1]);
            images[2]=new GreenfootImage("number_2.png");
            images[3]=new GreenfootImage("number_3.png");
            images[4]=new GreenfootImage("number_4.png");
            images[5]=new GreenfootImage("number_5.png");
            images[6]=new GreenfootImage("number_6.png");
            images[7]=new GreenfootImage("number_7.png");
            images[8]=new GreenfootImage("number_8.png");
            images[9]=new GreenfootImage("number_9.png");
           
      switch(units){
          case 0:list.add(images[0]);break;
          case 1:list.add(images[1]);break;
          case 2:list.add(images[2]);break;
          case 3:list.add(images[3]);break;
          case 4:list.add(images[4]);break;
          case 5:list.add(images[5]);break;
          case 6:list.add(images[6]);break;
          case 7:list.add(images[7]);break;
          case 8:list.add(images[8]);break;
          case 9:list.add(images[9]);break;
        }
      switch (digits){
          case 0:list.add(images[0]);break;
          case 1:list.add(images[1]);break;
          case 2:list.add(images[2]);break;
          case 3:list.add(images[3]);break;
          case 4:list.add(images[4]);break;
          case 5:list.add(images[5]);break;
          case 6:list.add(images[6]);break;
          case 7:list.add(images[7]);break;
          case 8:list.add(images[8]);break;
          case 9:list.add(images[9]);break;
      }
      image.setList(list);
      return image;
    }

  
}
