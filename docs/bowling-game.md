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
