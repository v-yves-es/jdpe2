/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter07;

import chapter01.AbstractEngine;

public class SuperGreenEngineAdapter extends AbstractEngine {
    
    public SuperGreenEngineAdapter(SuperGreenEngine greenEngine) {
        super(greenEngine.getEngineSize(), false);
    }
    
}
