package de.dhbw.text2process.models.bpmn.epc;

import de.dhbw.text2process.models.bpmn.nodes.ProcessEdge;
import de.dhbw.text2process.models.bpmn.nodes.ProcessNode;

public class Association extends ProcessEdge{
	
	public final static String PROP_DIRECTION = "direction";

    public final static String DIRECTION_SOURCE = "SOURCE";
    public final static String DIRECTION_TARGET = "TARGET";
    public final static String DIRECTION_BOTH = "BOTH";
    public final static String DIRECTION_NONE = "NONE";

    public Association(ProcessNode source, ProcessNode target) {
        super(source, target);
        initializeProperties();
    }
    
    private void initializeProperties() {
        setProperty(PROP_DIRECTION, DIRECTION_TARGET);
    }

}
