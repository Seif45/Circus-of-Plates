package eg.edu.alexu.csd.oop.game.model.Observer;

import eg.edu.alexu.csd.oop.game.model.Logger.GameLogger;
import eg.edu.alexu.csd.oop.game.model.world.Circus;

public class Score implements IObserver {

    Circus game;

    public Score(Circus game) {
        this.game = game;
        game.register(this);
    }
    @Override
    public void update(Object updatedValue) {

        //System.out.println("Score: "+ updatedValue);
        GameLogger.getInstance().log.info("Score: "+ (int)updatedValue );
    }
}
