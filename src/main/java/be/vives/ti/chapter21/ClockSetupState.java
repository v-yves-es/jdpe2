/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package be.vives.ti.chapter21;

public interface ClockSetupState {
    
    public void previousValue();
    public void nextValue();
    public void selectValue();
    
    public String getInstructions();
    public int getSelectedValue();
    
}