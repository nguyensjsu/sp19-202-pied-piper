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
        super(600, 400, 1);
        prepare();
    }
    
        private void prepare()
    {
        
        leaderboardcomponent = new LeaderBoardComposite();
        
        LeaderBoardComponent LeaderBoardbackground = new LeaderBoardBackground();
        addObject(LeaderBoardbackground, 100,300);
        leaderboardcomponent.addChild(LeaderBoardbackground);
       
        LeaderBoardComponent LeaderBoardTitle = new LeaderBoardTitle("LEADER BOARD",300,50);
        addObject(LeaderBoardTitle, 0, 0);
        leaderboardcomponent.addChild(LeaderBoardTitle);
        
        LeaderBoardComponent LeaderBoardTitle2 = new LeaderBoardTitle("Ranking 1 ~ 5 ",300,75);
        addObject(LeaderBoardTitle2, 0, 0);
        leaderboardcomponent.addChild(LeaderBoardTitle2);
        
        //USER1
        LeaderBoardComponent LeaderBoardUserInfo = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName = new LeaderBoardUserName("Jake",250,125);
        LeaderBoardComponent LeaderBoardScore = new LeaderBoardScore(80,350,125);
        addObject(LeaderBoardUserInfo, 180,125);
        addObject(LeaderBoardUserName, 0,0);
        addObject(LeaderBoardScore, 0,0);
        LeaderBoardUserInfo.addChild(LeaderBoardUserName);
        LeaderBoardUserInfo.addChild(LeaderBoardScore);
        leaderboardcomponent.addChild(LeaderBoardUserInfo);
        
        //USER2
        LeaderBoardComponent LeaderBoardUserInfo2 = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName2 = new LeaderBoardUserName("Alan",250,175);
        LeaderBoardComponent LeaderBoardScore2 = new LeaderBoardScore(70,350,175);
        addObject(LeaderBoardUserInfo2, 180,175);
        addObject(LeaderBoardUserName2, 0,0);
        addObject(LeaderBoardScore2, 0,0);
        LeaderBoardUserInfo2.addChild(LeaderBoardUserName2);
        LeaderBoardUserInfo2.addChild(LeaderBoardScore2);
        leaderboardcomponent.addChild(LeaderBoardUserInfo2);
        
        //USER3
        LeaderBoardComponent LeaderBoardUserInfo3 = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName3 = new LeaderBoardUserName("Janet",250,225);
        LeaderBoardComponent LeaderBoardScore3 = new LeaderBoardScore(70,350,225);
        addObject(LeaderBoardUserInfo3, 180,225);
        addObject(LeaderBoardUserName3, 0,0);
        addObject(LeaderBoardScore3, 0,0);
        LeaderBoardUserInfo3.addChild(LeaderBoardUserName3);
        LeaderBoardUserInfo3.addChild(LeaderBoardScore3);
        leaderboardcomponent.addChild(LeaderBoardUserInfo3);
        
        //USER4
        LeaderBoardComponent LeaderBoardUserInfo4 = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName4 = new LeaderBoardUserName("Parchi",250,275);
        LeaderBoardComponent LeaderBoardScore4 = new LeaderBoardScore(60,350,275);
        addObject(LeaderBoardUserInfo4, 180,275);
        addObject(LeaderBoardUserName4, 0,0);
        addObject(LeaderBoardScore4, 0,0);
        LeaderBoardUserInfo4.addChild(LeaderBoardUserName4);
        LeaderBoardUserInfo4.addChild(LeaderBoardScore4);
        leaderboardcomponent.addChild(LeaderBoardUserInfo4);
        
        //USER5
        LeaderBoardComponent LeaderBoardUserInfo5 = new LeaderBoardUserInfo();
        LeaderBoardComponent LeaderBoardUserName5 = new LeaderBoardUserName("Bob",250,325);
        LeaderBoardComponent LeaderBoardScore5 = new LeaderBoardScore(50,350,325);
        addObject(LeaderBoardUserInfo5, 180,325);
        addObject(LeaderBoardUserName5, 0,0);
        addObject(LeaderBoardScore5, 0,0);
        LeaderBoardUserInfo5.addChild(LeaderBoardUserName5);
        LeaderBoardUserInfo5.addChild(LeaderBoardScore5);
        leaderboardcomponent.addChild(LeaderBoardUserInfo5);
        
        //component print
        leaderboardcomponent.printOnScreen();
     
    }
    
}
