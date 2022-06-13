## Screen Sharing

We feel most comfortable working in our own individual environment. It is where we are most productive.

The typist shares their primary screen, showing the IDE. It is a good practice to show the IDE fullscreen and disable notifications.

*We all look at the same shared screen.*

Looking at and working on the same issue forces us to focus.
It is highly efficient to work with actual code in contrast to having abstract meta discussions.
While the typist shares the screen, the rest of the mob has no shortcuts. Only the typist types, the rest of the mob must explain what to do through language.

We accept the time to switch the shared screen at the start of the next mob interval.

## 10 Minute Intervals

Every mob session has a specific goal (e.g. to implement a feature or fix a bug) and may last several hours.
In a mob session, the typist role rotates periodically. Short rotation periods keep everyone concentrated and every opinion in the mix.
*We rotate every ten minutes.*

We tried different rotation periods and considered ten minutes as a good trade-off. Shorter periods didn’t work out for us because of the inherent switching costs in a remote team.

Surprisingly, taking your turn as a typist allows you a mental relaxation. You just wait for instructions.

## Git Handover

With on-site Mob Programming, you just pass on the keyboard to hand over to the next person. This is a challenge for a distributed team.

*We hand over with WIP commits on a temporary git branch.*

To have a clean master branch, we work on a temporary mob-session branch. After each interval, we push a work in progress (WIP) commit to this branch. In this branch, we don’t care about the commit message, if the code compiles, or if the tests are green.

A quick handover is essential. At the end of the mob session, we squash the WIP commits into expressive commits and merge into master.

We use the [mob tool](https://github.com/remotemobprogramming/mob) to simplify this process.

### Mob-Controls
| Action | Where can I find this action? | What does this action do? |
|---|---|---|
| Starting new session | Git -> Mob -> Start Mob Programming as Typist... | Pulls, create/switch to configured branch (default `mob-session`) and starts the timer (time is shown in the lower right corner)|
| Mob Next | Git -> Mob -> Next: Handover to next Typist... | Commits and pushes, so the next typist can start |
| Mob Done | Git -> Mob -> Done: Finish Mob Session... | Commits and pushes |

Preferences of this Plugin can be changes in "Preferences -> Tool -> Mob"

## Group Decisions

In software engineering, you constantly compare different alternatives and decide for one. Reversing decisions is often expensive. Group decisions are superior over individual decisions. In Remote Mob Programming, all decisions are group decisions.

*We minimize technical debt.*

With our wealth of know-how, experience, and opinions to discuss, we are able to make well-founded decisions everyone agrees with. When we are coding, we all agree on changes and code style. As a consequence, we don’t need code reviews or pull requests.

## More

The content above was shamelessly borrowed from: https://www.remotemobprogramming.org/

Please find more details for doing Team Programming in your daily job there!



## Watch and learn?
* a first example session (performed by the moderators) (10m)