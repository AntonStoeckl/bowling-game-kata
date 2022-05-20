# TODOs to get the training ready
* prepare content for introduction and team-programming theory + techniques
* prepare feedback session
* prepare highlights


# Goal of our training
* group-size? recommended  4-6 members per team, one facilitator from us in each team

* how are groups formed?
** probably no requirements from our side
** whatever works

* Which choices do we allow? Which constraints are fixed?
* remote
** minimum-team size: 3
** initially java is set
** in the future we might offer variants, or allow the teams to choose their language


* teach team-programming-techniques (mob/ensemble/pair-programming)
* should we incorporate tdd?
** we encourage it, but do not require them to work in a specific way
** encourage by explain how it works well together with team-programming
* not that the bowling game is implemented fully and correctly

* extension points


* measure the results ?
** simply provide place for feedback at the end
** how?
*** execute testsuite and track success / failure
** survey about quality, methods used etc.
*** menti-meter?
** within the training or outside

# Training-Timetable

09:00 - 10:00 Introduction - theory -setup, teambuilding,
** Our learnings and experiences so far

10:00 - 12:00 team-programming session 1

12-13 lunch-break

13:00 - 13:15 retrospective over all teams

13:30 - 15:30 team-programming session 2

15:30 - 16:00 coffee break

16:00 - 17:00 feedback session
16:00- 16:30 collect feedback and present feedback
16:30 -17:00 open-discussion




# Timeline
When are we planning to hold the first training?
* asap - testrun in elements as soon as ready


# Bowling Rules

The **game** consists of **10** **frames**.
In each frame the **player** has **two rolls** to knock down **10 pins**.

The **score** for the frame is the total number of pins knocked down,
plus **bonuses** for **strikes** and **spares**.

A spare is when the player knocks down all 10 pins in two rolls.
The bonus for that frame is the number of pins knocked down by the next roll.

A strike is when the player knocks down all 10 pins on his first roll.
The frame is then completed with a single roll.
The bonus for that frame is the value of the next two rolls.

The tenth frame is a special frame:
A spare or strike in this frame, does not immediately complete the frame.
Instead, the player gets additional rolls in this frame, so that they
can complete the bonus points for their strike or spare. However, no more than 3 total rolls are allowed.

In the example table below a "/" means spare and a X means strike:

| Frame:         | 1  | 2  | 3   | 4  | 5  | 6   | 7   | 8   | 9   | 10  |
|----------------|----|----|-----|----|----|-----|-----|-----|-----|-----|
| Result:        | X  | 7/ | 7 2 | 9/ | X  | X   | X   | 2 3 | 7   | 7/3 |
| Frame Score:   | 20 | 17 |  9  | 20 | 20 | 22  | 15  | 5   | 17  | 13  |
| Running Total: | 20 | 37 | 46  | 66 | 96 | 118 | 133 | 138 | 155 | 168 |


# Requirements

Write a class Game that has two methods

    void roll(int) is called each time the player rolls a ball. The argument is the number of pins knocked down.
    int score() returns the total score for that game.

# Tasks
