# TODOs to get the training ready
* prepare content for introduction and team-programming theory + techniques
* prepare feedback session
* prepare highlights


# Goal of our training
* group-size? recommended  4-6 members per team, one facilitator from us in each team

* how are groups formed?
  * probably no requirements from our side
  * whatever works

* Which choices do we allow? Which constraints are fixed?
* remote
  * minimum-team size: 3
  * initially java is set
  * in the future we might offer variants, or allow the teams to choose their language


* teach team-programming-techniques (mob/ensemble/pair-programming)
* should we incorporate tdd?
  * we encourage it, but do not require them to work in a specific way
  * encourage by explain how it works well together with team-programming
* not that the bowling game is implemented fully and correctly

* extension points


* measure the results ?
  * simply provide place for feedback at the end
  * how?
    * execute testsuite and track success / failure
  * survey about quality, methods used etc.
    * menti-meter?
  * within the training or outside


# TODOs

* Introduction -> **Basti**
* Reset tests in branch, so we have only a first, failing test and save full test suite into a branch -> **Laurens**
* Setup documentation, screenshots -> **Basti**
* Prepare feedback "questionaire" -> **Basti**
* Send email (please check out, install, ...) (on the day before the workshop)

---------------------------------------------------------

## What will you learn?

* What are the advantages of team programming?
* How to run a team programming session!
* What are the roles in team programming and how should they behave?
* How to do handovers when the roles are switched!
* Optional: Test-Driven Development


## What problem will we solve (implement)?

We will solve the Bowling Game Kata together - with Java. Basic Java skills will be sufficient. The team can support participants that are not fluid in Java yet.

## How will we work in this workshop?

The participants will be split into teams (ensembles) of ideally 4-6 developers and will solve the Kata as far as we can get.
All teams are encouraged, but not forced, to work in a strict TDD style. We will switch roles every 15 minutes.

## Agenda
9:00 - 10:00            

* Introduction to team programming (20m)
* Quick "role play" by the moderators (10m)
* Building the teams (5m)
* Checking out the project skeleton from GitLab and check if test can be executed (10m)
* Installing the  [mob.sh](https://github.com/remotemobprogramming/mob) tool for easy handovers (5m)
* Introduction to the "problem" we will solve (10m)

10:00 - 12:00   
* Team Programming session 1

12:00 - 13:00  
* Lunch Break

13:00 - 13:30   
* Quick retro of session 1

13:30 - 15:45
* Team Programming session 2

15:45 - 16:00
* Coffee break

16:00 - 17:00
* Feedback
* Open discussion


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

| Frame:         | 1   | 2   | 3   | 4   | 5   | 6   | 7   | 8   | 9   | 10    |
|----------------|-----|-----|-----|-----|-----|-----|-----|-----|-----|-------|
| Result:        | X   | 7 / | 7 2 | 9 / | X   | X   | X   | 2 3 | 7   | 7 / 3 |
| Frame Score:   | 20  | 17  | 9   | 20  | 20  | 22  | 15  | 5   | 17  | 13    |
| Running Total: | 20  | 37  | 46  | 66  | 96  | 118 | 133 | 138 | 155 | 168   |


# Requirements

Write a class Game that has two methods:

* **void roll(int)** is called each time the player rolls a ball. The argument is the number of pins knocked down.
* **int score()** returns the total score for that game.

# Some decisions to make

* Decide rotation time (we recommend 15m)
* Decide if you want to do TDD (we recommend so)
* Pick first typist and navigator
* Navigator + advisors: What to start with? (e.g. first test case)
