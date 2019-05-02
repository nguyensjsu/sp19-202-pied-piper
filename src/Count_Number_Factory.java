import java.util.ArrayList;
import greenfoot.*;
/**
 * Write a description of class FoodBoard_Number_Factory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Count_Number_Factory implements Factory 
{
  
    Object images[]=new Object[10];
    Number_Image image=new Number_Image();
    ArrayList list=new ArrayList<Object>();
  
    public Number_Image makeImage(int count){
        int units=count%10;
        int digits=count/10%10;
      //for (int i=0;i<9;i++){
        //   images[i]=new GreenfootImage("number_"+i+".png");
      //}
            images[0]=new GreenfootImage("number_0.jpg");
            images[1]=new GreenfootImage("number_1.jpg");
            images[2]=new GreenfootImage("number_2.jpg");
            images[3]=new GreenfootImage("number_3.jpg");
            images[4]=new GreenfootImage("number_4.jpg");
            images[5]=new GreenfootImage("number_5.jpg");
            images[6]=new GreenfootImage("number_6.jpg");
            images[7]=new GreenfootImage("number_7.jpg");
            images[8]=new GreenfootImage("number_8.jpg");
            images[9]=new GreenfootImage("number_9.jpg");
           
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
