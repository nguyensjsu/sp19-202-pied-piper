
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import java.awt.Color;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.io.FileReader;  
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.FileNotFoundException; 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
/**
 * Write a description of class BackGround here.
 * 
 * @author Jake
 * @version 1.0 / Apr 19 2019
 */

public class LeaderBoardScreen extends World
{
    private ArrayList<String> lines = new ArrayList<String>();
    private LeaderBoardComponent leaderboardcomponent;
    BufferedReader br = null;
    String test = null;
    //String name; 
    //String score; 
    String name1;
    String name2;
    String name3;
    String name4;
    String name5;
    String name6;
    String name7;
    String name8;
    String name9;
    String name10;
    String lowestname;
    int score1;
    int score2;
    int score3;
    int score4;
    int score5;
    int score6;
    int score7;
    int score8;
    int score9;
    int score10;
    int lowestscore;
    /**
     * Constructor for objects of class BackGround.
     * 
     */
    public LeaderBoardScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
        
        prepare();
    }
    
    private void prepare()
    {
        String tempinputValue = "No Name";
        //writefile(inputValue);
    
        String tempinputScore = JOptionPane.showInputDialog("Please Your Score");
        
        br = readfile();
        String input="";
        String tempinput="";
        String Winput="";
        
        try{
            /* Read data - input and tempinput from data.txt file */
            input = br.readLine();
            tempinput = input;
            
            /* File is null */
            if(input==null) input="No Name,0;";
            if(tempinput==null) tempinput="No Name,0;";
            
            tempinput = tempinput + tempinputValue + "," + tempinputScore + ";"; // new name and score
            String strArraytemp[] = tempinput.split(";");
            
            /* if data is less than 10, make No Name list. */
            if(strArraytemp.length<19)
            {
                for(int i=0; i < 10-strArraytemp.length; i++){
                tempinput=tempinput + "No Name,0;";
                }
            }
           String usertempArray[] = tempinput.split(";");
            
                /* check Array[]*/
                //for(int i=0; i < usertempArray.length; i++){
                //System.out.println("strArray["+i+"]"+usertempArray[i]);
                //}
        
        
        /* arranage score on top10.*/
        Arrays.sort(usertempArray, new Comparator<String>() {
            public int compare(String str1, String str2) {
                String substr1 = str1.substring(str1.indexOf(",")+1, str1.length());
                String substr2 = str2.substring(str2.indexOf(",")+1, str2.length());
        
                return Integer.valueOf(substr2).compareTo(Integer.valueOf(substr1));
            }
        });

              /* check Array[]*/
                //for(int i=0; i < usertempArray.length; i++){
                //System.out.println("strArray["+i+"]"+usertempArray[i]);
                //}
                
            lowestname= usertempArray[strArraytemp.length-1].substring(0,usertempArray[strArraytemp.length-1].indexOf(","));
            lowestscore = Integer.parseInt(usertempArray[strArraytemp.length-1].substring(usertempArray[strArraytemp.length-1].indexOf(",")+1, usertempArray[strArraytemp.length-1].length()));
        
            //System.out.println("strArraytemp.length+"+strArraytemp.length);
            //System.out.println("lowestname+"+lowestname);
            //System.out.println("lowestscore+"+lowestscore);
            
            if(Integer.parseInt(tempinputScore)>lowestscore)
            {
                 String inputname = JOptionPane.showInputDialog("Please Your Name");
                 String inputscore = JOptionPane.showInputDialog("Please Your Score");
                 
                 input = input + inputname + "," + inputscore + ";"; // new name and score
                 String strArraytemp2[] = input.split(";");
            
            if(strArraytemp2.length<11)
            {
                for(int i=0; i < 10-strArraytemp2.length; i++){
                input=input + "No Name,0;";
                }
            }
            
            String userArray[] = input.split(";");
            
                for(int i=0; i < userArray.length; i++){
                //System.out.println("strArray["+i+"]"+userArray[i]);
                    //String intArray[] = strArray[i].split(",");
                    //for(int j=0; j < intArray.length; j++){
                    //System.out.println("intArray["+j+"]"+intArray[j]);
                    //}
                }
        
        
            Arrays.sort(userArray, new Comparator<String>() {
            public int compare(String str1, String str2) {
                String substr1 = str1.substring(str1.indexOf(",")+1, str1.length());
                String substr2 = str2.substring(str2.indexOf(",")+1, str2.length());
        
                return Integer.valueOf(substr2).compareTo(Integer.valueOf(substr1));
            }
        });

            //System.out.println(Arrays.toString(strArray));
           
            name1= userArray[0].substring(0,userArray[0].indexOf(","));
            score1 = Integer.parseInt(userArray[0].substring(userArray[0].indexOf(",")+1, userArray[0].length()));
        
            name2= userArray[1].substring(0,userArray[1].indexOf(","));
            score2 = Integer.parseInt(userArray[1].substring(userArray[1].indexOf(",")+1, userArray[1].length()));
        
            name3= userArray[2].substring(0,userArray[2].indexOf(","));
            score3 = Integer.parseInt(userArray[2].substring(userArray[2].indexOf(",")+1, userArray[2].length()));
        
            name4= userArray[3].substring(0,userArray[3].indexOf(","));
            score4 = Integer.parseInt(userArray[3].substring(userArray[3].indexOf(",")+1, userArray[3].length()));
        
            name5= userArray[4].substring(0,userArray[4].indexOf(","));
            score5 = Integer.parseInt(userArray[4].substring(userArray[4].indexOf(",")+1, userArray[4].length()));
        
            name6= userArray[5].substring(0,userArray[5].indexOf(","));
            score6 = Integer.parseInt(userArray[5].substring(userArray[5].indexOf(",")+1, userArray[5].length()));
        
            name7= userArray[6].substring(0,userArray[6].indexOf(","));
            score7 = Integer.parseInt(userArray[6].substring(userArray[6].indexOf(",")+1, userArray[6].length()));
        
            name8= userArray[7].substring(0,userArray[7].indexOf(","));
            score8 = Integer.parseInt(userArray[7].substring(userArray[7].indexOf(",")+1, userArray[7].length()));
        
            name9= userArray[8].substring(0,userArray[8].indexOf(","));
            score9 = Integer.parseInt(userArray[8].substring(userArray[8].indexOf(",")+1, userArray[8].length()));
        
            name10= userArray[9].substring(0,userArray[9].indexOf(","));
            score10 = Integer.parseInt(userArray[9].substring(userArray[9].indexOf(",")+1, userArray[9].length()));
        
            
            writefile(name1+","+score1+";"+name2+","+score2+";"+name3+","+score3+";"+name4+","+score4+";"+name5+","+score5+";"
            +name6+","+score6+";"+name7+","+score7+";"+name8+","+score8+";"+name9+","+score9+";"+name10+","+score10+";");
            
            }
            else{ /* When Score is less than top10 */
              
            name1= usertempArray[0].substring(0,usertempArray[0].indexOf(","));
            score1 = Integer.parseInt(usertempArray[0].substring(usertempArray[0].indexOf(",")+1, usertempArray[0].length()));
        
            name2= usertempArray[1].substring(0,usertempArray[1].indexOf(","));
            score2 = Integer.parseInt(usertempArray[1].substring(usertempArray[1].indexOf(",")+1, usertempArray[1].length()));
        
            name3= usertempArray[2].substring(0,usertempArray[2].indexOf(","));
            score3 = Integer.parseInt(usertempArray[2].substring(usertempArray[2].indexOf(",")+1, usertempArray[2].length()));
        
            name4= usertempArray[3].substring(0,usertempArray[3].indexOf(","));
            score4 = Integer.parseInt(usertempArray[3].substring(usertempArray[3].indexOf(",")+1, usertempArray[3].length()));
        
            name5= usertempArray[4].substring(0,usertempArray[4].indexOf(","));
            score5 = Integer.parseInt(usertempArray[4].substring(usertempArray[4].indexOf(",")+1, usertempArray[4].length()));
        
            name6= usertempArray[5].substring(0,usertempArray[5].indexOf(","));
            score6 = Integer.parseInt(usertempArray[5].substring(usertempArray[5].indexOf(",")+1, usertempArray[5].length()));
        
            name7= usertempArray[6].substring(0,usertempArray[6].indexOf(","));
            score7 = Integer.parseInt(usertempArray[6].substring(usertempArray[6].indexOf(",")+1, usertempArray[6].length()));
        
            name8= usertempArray[7].substring(0,usertempArray[7].indexOf(","));
            score8 = Integer.parseInt(usertempArray[7].substring(usertempArray[7].indexOf(",")+1, usertempArray[7].length()));
        
            name9= usertempArray[8].substring(0,usertempArray[8].indexOf(","));
            score9 = Integer.parseInt(usertempArray[8].substring(usertempArray[8].indexOf(",")+1, usertempArray[8].length()));
        
            name10= usertempArray[9].substring(0,usertempArray[9].indexOf(","));
            score10 = Integer.parseInt(usertempArray[9].substring(usertempArray[9].indexOf(",")+1, usertempArray[9].length()));
        
            }
             
        
    } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
    
        leaderboardcomponent = new LeaderBoardComposite();
        
        LeaderBoardComponent LeaderBoardbackground = new LeaderBoardBackground();
        addObject(LeaderBoardbackground, 600,350);
        leaderboardcomponent.addChild(LeaderBoardbackground);
       
        LeaderBoardComponent LeaderBoardTitle = new LeaderBoardTitle("LEADER BOARD",600,50);
        addObject(LeaderBoardTitle, 0, 0);
        leaderboardcomponent.addChild(LeaderBoardTitle);
        
        LeaderBoardComponent LeaderBoardTitle2 = new LeaderBoardTitle("Top 10 Ranking ",600,75);
        addObject(LeaderBoardTitle2, 0, 0);
        leaderboardcomponent.addChild(LeaderBoardTitle2);
        
        //USER1
        LeaderBoardComponent LeaderBoardUserInfo = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName = new LeaderBoardUserName(name1,550,125);
        LeaderBoardComponent LeaderBoardScore = new LeaderBoardScore(score1,750,125);
        addObject(LeaderBoardUserInfo, 480,125);
        addObject(LeaderBoardUserName, 0,0);
        addObject(LeaderBoardScore, 0,0);
        LeaderBoardUserInfo.addChild(LeaderBoardUserName);
        LeaderBoardUserInfo.addChild(LeaderBoardScore);
        leaderboardcomponent.addChild(LeaderBoardUserInfo);
        
        
        //USER2
        LeaderBoardComponent LeaderBoardUserInfo2 = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName2 = new LeaderBoardUserName(name2,550,175);
        LeaderBoardComponent LeaderBoardScore2 = new LeaderBoardScore(score2,750,175);
        addObject(LeaderBoardUserInfo2, 480,175);
        addObject(LeaderBoardUserName2, 0,0);
        addObject(LeaderBoardScore2, 0,0);
        LeaderBoardUserInfo2.addChild(LeaderBoardUserName2);
        LeaderBoardUserInfo2.addChild(LeaderBoardScore2);
        leaderboardcomponent.addChild(LeaderBoardUserInfo2);
        
        //USER3
        LeaderBoardComponent LeaderBoardUserInfo3 = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName3 = new LeaderBoardUserName(name3,550,225);
        LeaderBoardComponent LeaderBoardScore3 = new LeaderBoardScore(score3,750,225);
        addObject(LeaderBoardUserInfo3, 480,225);
        addObject(LeaderBoardUserName3, 0,0);
        addObject(LeaderBoardScore3, 0,0);
        LeaderBoardUserInfo3.addChild(LeaderBoardUserName3);
        LeaderBoardUserInfo3.addChild(LeaderBoardScore3);
        leaderboardcomponent.addChild(LeaderBoardUserInfo3);
        
        //USER4
        LeaderBoardComponent LeaderBoardUserInfo4 = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName4 = new LeaderBoardUserName(name4,550,275);
        LeaderBoardComponent LeaderBoardScore4 = new LeaderBoardScore(score4,750,275);
        addObject(LeaderBoardUserInfo4, 480,275);
        addObject(LeaderBoardUserName4, 0,0);
        addObject(LeaderBoardScore4, 0,0);
        LeaderBoardUserInfo4.addChild(LeaderBoardUserName4);
        LeaderBoardUserInfo4.addChild(LeaderBoardScore4);
        leaderboardcomponent.addChild(LeaderBoardUserInfo4);
        
        //USER5
        LeaderBoardComponent LeaderBoardUserInfo5 = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName5 = new LeaderBoardUserName(name5,550,325);
        LeaderBoardComponent LeaderBoardScore5 = new LeaderBoardScore(score5,750,325);
        addObject(LeaderBoardUserInfo5, 480,325);
        addObject(LeaderBoardUserName5, 0,0);
        addObject(LeaderBoardScore5, 0,0);
        LeaderBoardUserInfo5.addChild(LeaderBoardUserName5);
        LeaderBoardUserInfo5.addChild(LeaderBoardScore5);
        leaderboardcomponent.addChild(LeaderBoardUserInfo5);
        
        //USER6
        LeaderBoardComponent LeaderBoardUserInfo6 = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName6 = new LeaderBoardUserName(name6,550,375);
        LeaderBoardComponent LeaderBoardScore6 = new LeaderBoardScore(score6,750,375);
        addObject(LeaderBoardUserInfo6, 480,375);
        addObject(LeaderBoardUserName6, 0,0);
        addObject(LeaderBoardScore6, 0,0);
        LeaderBoardUserInfo6.addChild(LeaderBoardUserName6);
        LeaderBoardUserInfo6.addChild(LeaderBoardScore6);
        leaderboardcomponent.addChild(LeaderBoardUserInfo6);
        
        //USER7
        LeaderBoardComponent LeaderBoardUserInfo7 = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName7 = new LeaderBoardUserName(name7,550,425);
        LeaderBoardComponent LeaderBoardScore7 = new LeaderBoardScore(score7,750,425);
        addObject(LeaderBoardUserInfo7, 480,425);
        addObject(LeaderBoardUserName7, 0,0);
        addObject(LeaderBoardScore7, 0,0);
        LeaderBoardUserInfo7.addChild(LeaderBoardUserName7);
        LeaderBoardUserInfo7.addChild(LeaderBoardScore7);
        leaderboardcomponent.addChild(LeaderBoardUserInfo7);
        
        //USER8
        LeaderBoardComponent LeaderBoardUserInfo8 = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName8 = new LeaderBoardUserName(name8,550,475);
        LeaderBoardComponent LeaderBoardScore8 = new LeaderBoardScore(score8,750,475);
        addObject(LeaderBoardUserInfo8, 480,475);
        addObject(LeaderBoardUserName8, 0,0);
        addObject(LeaderBoardScore8, 0,0);
        LeaderBoardUserInfo8.addChild(LeaderBoardUserName8);
        LeaderBoardUserInfo8.addChild(LeaderBoardScore8);
        leaderboardcomponent.addChild(LeaderBoardUserInfo8);
        
        //USER9
        LeaderBoardComponent LeaderBoardUserInfo9 = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName9 = new LeaderBoardUserName(name9,550,525);
        LeaderBoardComponent LeaderBoardScore9 = new LeaderBoardScore(score9,750,525);
        addObject(LeaderBoardUserInfo9, 480,525);
        addObject(LeaderBoardUserName9, 0,0);
        addObject(LeaderBoardScore9, 0,0);
        LeaderBoardUserInfo9.addChild(LeaderBoardUserName9);
        LeaderBoardUserInfo9.addChild(LeaderBoardScore9);
        leaderboardcomponent.addChild(LeaderBoardUserInfo9);
        
        //USER10
        LeaderBoardComponent LeaderBoardUserInfo10 = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName10 = new LeaderBoardUserName(name10,550,575);
        LeaderBoardComponent LeaderBoardScore10 = new LeaderBoardScore(score10,750,575);
        addObject(LeaderBoardUserInfo10, 480,575);
        addObject(LeaderBoardUserName10, 0,0);
        addObject(LeaderBoardScore10, 0,0);
        LeaderBoardUserInfo10.addChild(LeaderBoardUserName10);
        LeaderBoardUserInfo10.addChild(LeaderBoardScore10);
        leaderboardcomponent.addChild(LeaderBoardUserInfo10);
        
        //component print
        leaderboardcomponent.printOnScreen();
        
    }
    
    
    public void writefile(String inputValue)
    {
    FileWriter filewriter = null;
        try
        {
            filewriter = new FileWriter("data.txt");
            filewriter.write(""+inputValue);
        }
        catch (Exception e){ e.printStackTrace(); }
        finally
        {
            if(filewriter != null)
            {
                try { filewriter.close(); }
                catch (Exception e) { e.printStackTrace(); }
            }
        }    
    }   

    public BufferedReader readfile()
    {
        try
            {
            URL path = getClass().getClassLoader().getResource("data.txt");
            InputStream input = path.openStream();
            br = new BufferedReader(new InputStreamReader(input));
            return br;
            }
        catch (Exception e) { 
            System.out.println("Data.txt file missing");  
        }
        try
        {
            br.close();
            return br;
        }
        catch (Exception e) 
            {
                try { 
                    br.close(); 
                } catch (Exception f) 
                {
                } 
        }  
        return br;
    }
    public void act()
    {
         
    }
    
}
