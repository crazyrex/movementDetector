package com.oryzone.mvdetector.detectorEvents;

import com.oryzone.mvdetector.Detector;

/**
 * Event class to describe the Warning started event
 * @author Luciano Mammino, Andrea Mangano
 * @version 1.0
 * @see WarningEndedEvent
 */
public class WarningStartedEvent extends DetectorEvent
{

    /**
     * Constructor
     * @param detector the detector that fired the event
     */
    public WarningStartedEvent(Detector detector)
    {
        super(detector);
    }

}
