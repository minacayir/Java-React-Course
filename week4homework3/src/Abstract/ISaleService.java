package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface ISaleService {
	void sale(Gamer gamer,Game game,Campaign campaign);
}
