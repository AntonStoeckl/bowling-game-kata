# Remarks about the design of this training

We as the authors have started learning about team-programming with a similar setup as this one.
When designing this training, we wanted to condense most of our learnings into a single day training.
To give you a little bit of context - here are some of our considerations / tradeoffs that we talked about during the design of this training:

- Realistic project setup vs. limiting complexity to focus on core techniques
- Fixed constraints vs. freedom of choice (tooling, technologies, techniques)
- Making your own experiences vs. nudging you in the "right" direction

We tried to take some of our experiences and ease the learning for you, hopefully without taking away too many of your own choices.
Therefore we would like to give you some instructions on how to proceed - some of them we took over from others (such as https://www.remotemobprogramming.org/), some we discovered ourselves.
However all of these instructions should be considered as recommendations.
This means if you as a team would like to deviate from any of it, you are free to do so.
Just discuss and agree upon it in the team. 

# Recommendations

## Screen Sharing

*We all look at the same shared screen.*

We feel most comfortable working in our own individual environment. It is where we are most productive.

The typist shares their primary screen, showing the IDE in fullscreen.

Looking at and working on the same issue forces us to focus.

While the typist shares the screen, the rest of the team has no shortcuts. 
Only the typist types, the rest of the team must explain what to do through language.


## 10 Minute Intervals

In a programming session, the typist role rotates periodically. Short rotation periods keep everyone concentrated and every opinion in the mix.
*We rotate every ten minutes.*

We tried different rotation periods and considered ten minutes as a good trade-off. Shorter periods didn’t work out for us because of the inherent switching costs in a remote team.

Surprisingly, taking your turn as a typist allows you a mental relaxation. You just wait for instructions.


## Git Handover

With on-site team- Programming, you just pass on the keyboard to hand over to the next person. This is a challenge for a distributed team.

*We hand over with WIP commits on a temporary git branch.*

To have a clean master branch, we work on a temporary session branch. After each interval, we push a work in progress (WIP) commit to this branch. In this branch, we don’t care about the commit message, if the code compiles, or if the tests are green.

A quick handover is essential. At the end of the mob session, we squash the WIP commits into expressive commits and merge into master.

We use the [mob tool](https://github.com/remotemobprogramming/mob) to simplify this process.

### Mob-Controls
| Action | Where can I find this action? | What does this action do? |
|---|---|---|
| Starting new session | Git -> Mob -> Start Mob Programming as Typist... | Pulls, create/switch to configured branch (default `mob-session`) and starts the timer (time is shown in the lower right corner)|
| Mob Next | Git -> Mob -> Next: Handover to next Typist... | Commits and pushes, so the next typist can start |
| Mob Done | Git -> Mob -> Done: Finish Mob Session... | Commits and pushes |

Preferences of this Plugin can be changes in "Preferences -> Tool -> Mob"


## Group Decisions and Goals

In software engineering, you constantly compare different alternatives and decide for one.
In  team-programming, all decisions usually are group decisions.
This does not mean that everybody has to agree on what is best, but that everybody agrees on what to do next.

Group decision are of course hard in a newly formed artificial team as we have here.

So there is a need for balance:
Try to put some thought in your decisions, but don't too much weight on it.
When in doubt, try not to spend too much time on meta-discussions.
Argument in code instead.
Pick out one possible solution, try it out and refactor later if needed.

The most important point is that everybody has the same idea about the current goal that we want to reach.

Formulate this goal as an intention rather than a solution.

We found that working in a test-driven-style works really well here, because if done right the test explicitly summarizes the intention
of the task that we currently want to solve. 

## Take your time and reflect when needed
The goal of the technique is not to optimize speed.

Role-rotations are a natural break point for a short reflection:
- Do we need a break?
- Is everybody still on the same page?
- Do we need a new goal?
- Do we need adapt our process?