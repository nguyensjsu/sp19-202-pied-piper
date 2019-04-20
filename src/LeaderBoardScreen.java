import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackGround here.
 * 
 * @author Jake
 * @version 1.0 / Apr 19 2019
 */
public class LeaderBoardScreen extends World
{

    private LeaderBoardComponent leaderboardcomponent;
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
        LeaderBoardComponent LeaderBoardUserName = new LeaderBoardUserName("Jake",550,125);
        LeaderBoardComponent LeaderBoardScore = new LeaderBoardScore(80,750,125);
        addObject(LeaderBoardUserInfo, 480,125);
        addObject(LeaderBoardUserName, 0,0);
        addObject(LeaderBoardScore, 0,0);
        LeaderBoardUserInfo.addChild(LeaderBoardUserName);
        LeaderBoardUserInfo.addChild(LeaderBoardScore);
        leaderboardcomponent.addChild(LeaderBoardUserInfo);
        
        //USER2
        LeaderBoardComponent LeaderBoardUserInfo2 = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName2 = new LeaderBoardUserName("Alan",550,175);
        LeaderBoardComponent LeaderBoardScore2 = new LeaderBoardScore(70,750,175);
        addObject(LeaderBoardUserInfo2, 480,175);
        addObject(LeaderBoardUserName2, 0,0);
        addObject(LeaderBoardScore2, 0,0);
        LeaderBoardUserInfo2.addChild(LeaderBoardUserName2);
        LeaderBoardUserInfo2.addChild(LeaderBoardScore2);
        leaderboardcomponent.addChild(LeaderBoardUserInfo2);
        
        //USER3
        LeaderBoardComponent LeaderBoardUserInfo3 = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName3 = new LeaderBoardUserName("Janet",550,225);
        LeaderBoardComponent LeaderBoardScore3 = new LeaderBoardScore(70,750,225);
        addObject(LeaderBoardUserInfo3, 480,225);
        addObject(LeaderBoardUserName3, 0,0);
        addObject(LeaderBoardScore3, 0,0);
        LeaderBoardUserInfo3.addChild(LeaderBoardUserName3);
        LeaderBoardUserInfo3.addChild(LeaderBoardScore3);
        leaderboardcomponent.addChild(LeaderBoardUserInfo3);
        
        //USER4
        LeaderBoardComponent LeaderBoardUserInfo4 = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName4 = new LeaderBoardUserName("Prachi",550,275);
        LeaderBoardComponent LeaderBoardScore4 = new LeaderBoardScore(60,750,275);
        addObject(LeaderBoardUserInfo4, 480,275);
        addObject(LeaderBoardUserName4, 0,0);
        addObject(LeaderBoardScore4, 0,0);
        LeaderBoardUserInfo4.addChild(LeaderBoardUserName4);
        LeaderBoardUserInfo4.addChild(LeaderBoardScore4);
        leaderboardcomponent.addChild(LeaderBoardUserInfo4);
        
        //USER5
        LeaderBoardComponent LeaderBoardUserInfo5 = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName5 = new LeaderBoardUserName("Bob",550,325);
        LeaderBoardComponent LeaderBoardScore5 = new LeaderBoardScore(50,750,325);
        addObject(LeaderBoardUserInfo5, 480,325);
        addObject(LeaderBoardUserName5, 0,0);
        addObject(LeaderBoardScore5, 0,0);
        LeaderBoardUserInfo5.addChild(LeaderBoardUserName5);
        LeaderBoardUserInfo5.addChild(LeaderBoardScore5);
        leaderboardcomponent.addChild(LeaderBoardUserInfo5);
        
        
        
        //USER6
        LeaderBoardComponent LeaderBoardUserInfo6 = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName6 = new LeaderBoardUserName("Jake",550,375);
        LeaderBoardComponent LeaderBoardScore6 = new LeaderBoardScore(40,750,375);
        addObject(LeaderBoardUserInfo6, 480,375);
        addObject(LeaderBoardUserName6, 0,0);
        addObject(LeaderBoardScore6, 0,0);
        LeaderBoardUserInfo6.addChild(LeaderBoardUserName6);
        LeaderBoardUserInfo6.addChild(LeaderBoardScore6);
        leaderboardcomponent.addChild(LeaderBoardUserInfo6);
        
        //USER7
        LeaderBoardComponent LeaderBoardUserInfo7 = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName7 = new LeaderBoardUserName("Alan",550,425);
        LeaderBoardComponent LeaderBoardScore7 = new LeaderBoardScore(30,750,425);
        addObject(LeaderBoardUserInfo7, 480,425);
        addObject(LeaderBoardUserName7, 0,0);
        addObject(LeaderBoardScore7, 0,0);
        LeaderBoardUserInfo7.addChild(LeaderBoardUserName7);
        LeaderBoardUserInfo7.addChild(LeaderBoardScore7);
        leaderboardcomponent.addChild(LeaderBoardUserInfo7);
        
        //USER8
        LeaderBoardComponent LeaderBoardUserInfo8 = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName8 = new LeaderBoardUserName("Janet",550,475);
        LeaderBoardComponent LeaderBoardScore8 = new LeaderBoardScore(20,750,475);
        addObject(LeaderBoardUserInfo8, 480,475);
        addObject(LeaderBoardUserName8, 0,0);
        addObject(LeaderBoardScore8, 0,0);
        LeaderBoardUserInfo8.addChild(LeaderBoardUserName8);
        LeaderBoardUserInfo8.addChild(LeaderBoardScore8);
        leaderboardcomponent.addChild(LeaderBoardUserInfo8);
        
        //USER9
        LeaderBoardComponent LeaderBoardUserInfo9 = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName9 = new LeaderBoardUserName("Prachi",550,525);
        LeaderBoardComponent LeaderBoardScore9 = new LeaderBoardScore(10,750,525);
        addObject(LeaderBoardUserInfo9, 480,525);
        addObject(LeaderBoardUserName9, 0,0);
        addObject(LeaderBoardScore9, 0,0);
        LeaderBoardUserInfo9.addChild(LeaderBoardUserName9);
        LeaderBoardUserInfo9.addChild(LeaderBoardScore9);
        leaderboardcomponent.addChild(LeaderBoardUserInfo9);
        
        //USER10
        LeaderBoardComponent LeaderBoardUserInfo10 = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName10 = new LeaderBoardUserName("Bob",550,575);
        LeaderBoardComponent LeaderBoardScore10 = new LeaderBoardScore(0,750,575);
        addObject(LeaderBoardUserInfo10, 480,575);
        addObject(LeaderBoardUserName10, 0,0);
        addObject(LeaderBoardScore10, 0,0);
        LeaderBoardUserInfo10.addChild(LeaderBoardUserName10);
        LeaderBoardUserInfo10.addChild(LeaderBoardScore10);
        leaderboardcomponent.addChild(LeaderBoardUserInfo10);
        
        //component print
        leaderboardcomponent.printOnScreen();
     
    }
    
}
