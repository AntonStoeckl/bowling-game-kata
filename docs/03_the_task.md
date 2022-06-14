# The task
You are a newly formed team at MaibornWolff that is charged to implement the core functionality of a new system to track
the score of a single player's bowling game.

You have been given the following requirements:
- Implement all the bowling-rules described below as a Java-programm. The rules are in no particular order.
- The concrete usage of your java-programm is not yet defined. However it was decided that a class Game should exist which
  should implement at least the following methods:
  - **void roll(int)** is called each time the player rolls a ball. The argument is the number of pins knocked down.
  - **int score()** returns the total score for that game.

If you feel that you require additional information / requirements for making decisions,
feel free to ask one of the moderators for input,
make an assumption in the team or designate a team-member to play the role of the customer.

# Bowling Rules

### Game & Frame
The **game** consists of **10** **frames**.
In each frame the **player** has **two rolls** to knock down **10 pins**.

### Score
The **score** for the frame is the total number of pins knocked down,
plus **bonuses** for **strikes** and **spares**.

### Spare
A **spare** is when the player knocks down **all 10 pins in two rolls**.<br />
The **bonus** for that frame is the number of **pins knocked down by the next roll**.

### Strike
A **strike** is when the player knocks down **all 10 pins** on the **first roll**.<br />
The frame is then completed with a single roll.<br />
The **bonus** for that frame is the number of **pins knocked down by the next two rolls**.

### Extra rolls in the 10th frame
The **tenth frame is** a **special** frame:<br />

A **spare or strike** in this frame, **does not** immediately **complete the frame**.<br />
Instead, the player gets **additional rolls in this frame**
**to complete the bonus points** for their strike or spare.<br />
However, **no more than 3 total rolls** are allowed.


### Example
In the example table below a **/** represents a spare and an **X** represents a strike:

| Frame:         | 1   | 2   | 3   | 4   | 5   | 6   | 7   | 8   | 9   | 10        |
|----------------|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----------|
| Result:        | X   | 7 / | 7 2 | 9 / | X   | X   | X   | 2 3 | 7 / | 7   /   3 |
| Frame Score:   | 20  | 17  | 9   | 20  | 30  | 22  | 15  | 5   | 17  | 13        |
| Running Total: | 20  | 37  | 46  | 66  | 96  | 118 | 133 | 138 | 155 | 168       |
 
