import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    public void rollFive() {
        Game game = new Game();

        game.roll(5);

        assertEquals(5, game.getCurrentScore());
    }

    @Test
    public void rollEight() {
        Game game = new Game();

        game.roll(8);

        assertEquals(8, game.getCurrentScore());
    }

    @Test
    public void twoRolls() {
        Game game = new Game();

        game.roll(5);
        game.roll(3);

        assertEquals(8, game.getCurrentScore());
    }

    @Test
    public void scoreStopsAfterTenFrames() {
        Game game = new Game();

        for (int i = 1; i <= 10; i++) {
            game.roll(1);
            game.roll(0);
        }

        // roll after all frames should not be counted
        game.roll(1);

        assertEquals(10, game.getCurrentScore());
    }

    @Test
    public void rollSpare() {
        Game game = new Game();

        game.roll(5);

        game.roll(5);
        game.roll(3);

        assertEquals(16, game.getCurrentScore());
    }


    @Test
    public void rollStrike() {
        Game game = new Game();

        game.roll(10);

        game.roll(5);
        game.roll(3);

        assertEquals(26, game.getCurrentScore());
    }

    @Test
    public void roll2Strikes() {
        Game game = new Game();

        game.roll(10); // 25
        assertEquals(10, game.getCurrentScore());

        game.roll(10); // 18
        assertEquals(30, game.getCurrentScore());

        game.roll(5);
        assertEquals(45, game.getCurrentScore());

        game.roll(3);
        assertEquals(51, game.getCurrentScore());
    }


    @Test
    public void roll10FramesByAPrettyGoodPlayer() {
        Game game = new Game();

        //Frame1: 25
        game.roll(10);
        assertEquals(10, game.getCurrentScore());

        //Frame2: 18
        game.roll(10);
        assertEquals(30, game.getCurrentScore());

        // Frame3: 8
        game.roll(5);
        game.roll(3);
        assertEquals(51, game.getCurrentScore());


        // Frame4: 2
        game.roll(2);
        game.roll(0);
        assertEquals(53, game.getCurrentScore());

        // Frame5:  20
        game.roll(10);
        assertEquals(63, game.getCurrentScore());

        // Frame6: 15
        game.roll(5);
        game.roll(5);
        assertEquals(83, game.getCurrentScore());

        // Frame7: 20
        game.roll(5);
        game.roll(5);
        assertEquals(98, game.getCurrentScore());

        // Frame8: 19
        game.roll(10);
        assertEquals(118, game.getCurrentScore());

        // Frame9: 9
        game.roll(8);
        game.roll(1);
        assertEquals(136, game.getCurrentScore());

        // Frame10: 7
        game.roll(5);
        game.roll(2);
        assertEquals(143, game.getCurrentScore());

        // should not count - game over
        game.roll(2);
        assertEquals(143, game.getCurrentScore());
    }

    @Test
    public void withExtraFrames() {
        Game game = new Game();

        //Frame1: 25
        game.roll(10);
        assertEquals(10, game.getCurrentScore());

        //Frame2: 18
        game.roll(10);
        assertEquals(30, game.getCurrentScore());

        // Frame3: 8
        game.roll(5);
        game.roll(3);
        assertEquals(51, game.getCurrentScore());

        // Frame4: 2
        game.roll(2);
        game.roll(0);
        assertEquals(53, game.getCurrentScore());

        // Frame5:  20
        game.roll(10);
        assertEquals(63, game.getCurrentScore());

        // Frame6: 15
        game.roll(5);
        game.roll(5);
        assertEquals(83, game.getCurrentScore());

        // Frame7: 20
        game.roll(5);
        game.roll(5);
        assertEquals(98, game.getCurrentScore());

        // Frame8: 19
        game.roll(10);
        assertEquals(118, game.getCurrentScore());

        // Frame9: 9
        game.roll(8);
        game.roll(1);
        assertEquals(136, game.getCurrentScore());

        // Frame10:
        game.roll(10);
        assertEquals(146, game.getCurrentScore());

        // extra roll (strike in 10th frame)
        game.roll(1);
        game.roll(2);
        assertEquals(149, game.getCurrentScore());

        // should not count - game over
        game.roll(1);
        assertEquals(149, game.getCurrentScore());
    }

    @Test
    public void withStrikeout() {
        Game game = new Game();

        //Frame1: 25
        game.roll(10);
        assertEquals(10, game.getCurrentScore());

        //Frame2: 18
        game.roll(10);
        assertEquals(30, game.getCurrentScore());

        // Frame3: 8
        game.roll(5);
        game.roll(3);
        assertEquals(51, game.getCurrentScore());


        // Frame4: 2
        game.roll(2);
        game.roll(0);
        assertEquals(53, game.getCurrentScore());

        // Frame5:  20
        game.roll(10);
        assertEquals(63, game.getCurrentScore());

        // Frame6: 15
        game.roll(5);
        game.roll(5);
        assertEquals(83, game.getCurrentScore());

        // Frame7: 20
        game.roll(5);
        game.roll(5);
        assertEquals(98, game.getCurrentScore());

        // Frame8: 19
        game.roll(10);
        assertEquals(118, game.getCurrentScore());

        // Frame9: 9
        game.roll(8);
        game.roll(1);
        assertEquals(136, game.getCurrentScore());

        // Frame10:
        game.roll(10);
        assertEquals(146, game.getCurrentScore());

        // extra rolls (strike in 10th frame)
        game.roll(10);
        game.roll(10);
        assertEquals(166, game.getCurrentScore());

        // should not count - game over
        game.roll(1);
        assertEquals(166, game.getCurrentScore());
    }

    @Test
    public void withSpareOut() {
        Game game = new Game();

        //Frame1: 25
        game.roll(10);
        assertEquals(10, game.getCurrentScore());

        //Frame2: 18
        game.roll(10);
        assertEquals(30, game.getCurrentScore());

        // Frame3: 8
        game.roll(5);
        game.roll(3);
        assertEquals(51, game.getCurrentScore());


        // Frame4: 2
        game.roll(2);
        game.roll(0);
        assertEquals(53, game.getCurrentScore());

        // Frame5:  20
        game.roll(10);
        assertEquals(63, game.getCurrentScore());

        // Frame6: 15
        game.roll(5);
        game.roll(5);
        assertEquals(83, game.getCurrentScore());

        // Frame7: 20
        game.roll(5);
        game.roll(5);
        assertEquals(98, game.getCurrentScore());

        // Frame8: 19
        game.roll(10);
        assertEquals(118, game.getCurrentScore());

        // Frame9: 9
        game.roll(8);
        game.roll(1);
        assertEquals(136, game.getCurrentScore());

        // Frame10:
        game.roll(1);
        game.roll(9);
        assertEquals(146, game.getCurrentScore());

        // extra roll (spare in 10th frame)
        game.roll(1);
        assertEquals(147, game.getCurrentScore());

        // should not count - game over
        game.roll(1);
        assertEquals(147, game.getCurrentScore());
    }
}
