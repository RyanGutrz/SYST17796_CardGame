
package hearts_ryanc;

/**
 *
 * @author ryanc
 */

import java.util.ArrayList;
import java.util.List;

public class Trick {
    
    public int tallyPoints() {
        
        int points = 0;
        for (Card card) {
          if (card.isHeart()) {
            points += 1;
          } else if (card.isqueenofSpades()) {
            points += 13;
          }
        }
        return points;
      }
    
}
