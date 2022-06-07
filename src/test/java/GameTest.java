import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    public void rollFive() {
        Game game = new Game();

        game.roll(5);

        assertEquals(5, game.getCurrentScore());
    }
}
