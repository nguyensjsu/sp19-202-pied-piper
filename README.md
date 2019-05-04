# Team Project Repo 
https://github.com/nguyensjsu/sp19-202-pied-piper

## Team Name
Pied Piper

## Team Members

* [Alan](https://github.com/athsueh)
* [Haoran](https://github.com/HaoRanChen123)
* [Jake (Ilsoo Kim)](https://github.com/jake-ilsoo-kim)
* [Janet(Yueqiao)](https://github.com/treetree0211)
* [Prachi](https://github.com/PrachiJanI13)

## Project Name: Snake Game

## Project Description
"Snake" is a casual game created in Greenfoot in which players can control one of three selectable snakes, and move around inside a game board to eat food. Eating food consequently will increase the length of the snake and make the game more challenging. Speed powerup items are also available to consume, which adds a multiplier the player’s score when picking up future food. The player is offered a continuous and challenging game experience by weighing the risk reward between consuming food and powerups while attempting to stay alive by avoiding colliding into any walls or the snake’s tail.

## Project Progress 
Week 1: Initial Game Idea Inception, assignment of task roles based on design patterns

Week 2: Creation of base game with board, (tile based system) snake logic, item/food classes, initial snake attribute decorator, leaderboard component, board observer pattern

Week 3: Improve snake attribute speed decorator, implementation of factory pattern for scoreboard

Week 4: Implementation of command design pattern for controls, polished logic for snake growth, improved item spawn logic, improved overall UI design, lots of bug fixing

### Sprint Task Sheet
![](https://github.com/nguyensjsu/sp19-202-pied-piper/blob/master/docs/Sprint%20Task%20Sheet.PNG)

### Burndown Map
![](https://github.com/nguyensjsu/sp19-202-pied-piper/blob/master/docs/burndownchart.PNG)

### Project Dashboard
https://github.com/nguyensjsu/sp19-202-pied-piper/projects

### Project Journal

### Design:
The game uses the Greenfoot game engine. We implemented the following design patterns:
- Builder - For setting up different details of snake object after snake selection
- Decorator - For adding different color and speed to snake object
- Decorator - For creating the snakes displayed in the character selection 
- Observer - For calculating scores when snake eats apples and powerup balls
- Observer - For displaying player achievements
- Composite - For displaying player ranks in leaderboard
- Factory -For generating the Score point image.


### Individual Contributions

## Alan
- Played a major role in leading the project group members in game idea inception, work delegation, responsibility of roles, and sprint planning/scrum meeting
- Lead every weekly meeting, orchestrating the meeting topics and covering weekly stand-up responsibilities as well as assignment of tasks for subsequent weeks
- Implemented the base snake game board, snake class, food class
- Implemented the tile system for the snake game board, as well as the complementing snake movement restriction within the tile’s boundaries
- Implemented item spawn logic and snake growth logic
- Implemented command design pattern for snake controls
- Assisted in clarifying each team member’s responsibilities, and reviewed code functionality with them
- Created final project YouTube video
- Added sounds for the game
- Snake life cycle bug checking and fixing
- Improved the aesthetics of the game visually
       
## Yueqiao(Janet)
- Helped in driving requirement discussion and design in initial phase
- Contributed to user stories creation and game features creation
- Contributed to UI Wireframe for snake game screens
- Implemented Builder Design pattern for setting up snake object
- Implemented Decorator Design pattern for adding different snake color and speed selection
- Contributed to snake game snake growth logic
- Implemented game starter screen and snake selection screen 
- Designed snake graphic and starter screen graphic
- Contributed to sprint task sheet development
- Helped in testing and fixing issues



## Jake (Ilsoo Kim)
- Helped decision making for requirements.
- Implemented Composite pattern for component arranges in the leaderboard.
- Implemented Singleton pattern for getscore() in the scoreboard for using a leaderboard.
- Developing a file read and write function for record names and scores for the leaderboard. 
- Implemented a compare logic for order by the score for leaderboard. 
- Implemented a asking input box logic with compare top 10 scores.
- Testing and fixing bugs.
- Helped creating a video for the game.
- Contributed to generate the burndown chart. 
- Helped in achievements board.


## Haoran
- Implemented Observer pattern  to monitor apple state, and notify the food board score board and speedboard.
- Implemented Factory pattern to realize the physical part of showing points by pictures
- Provide several API to other team members.
- Testing and fixing bugs.
- Helped to draw the whole group sequence diagram.
- Helped to do the ppt.
- Helped team member to solve the code problem and conflict problem.
      

## Prachi
- Helped in requirement gathering and decision making.
- Implemented Observer Pattern to show achievements that player can get.
- Contributed to Achievement pop up logic.
- Contributed to user story creation.
- Testing and bug fixing.
- Helped creating UML Diagrams for the team.
- Contributed to generate sprint task sheet.


