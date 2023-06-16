package edu.stanford.bmir.protege.examples.windows;

import org.apache.jena.ontology.OntModel;
import org.protege.editor.owl.ui.action.ProtegeOWLAction;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;


public class MainWindow extends ProtegeOWLAction {


    public static JFrame frame = null;
    public static OntModel model1 = null;
    public static final JTabbedPane tabbedPane = new JTabbedPane();

    public MainWindow() {

        File tempDir = new File("./temp/");

        if (!tempDir.exists()) {
            tempDir.mkdir();
        }
        File tempResult = new File("./temp/tempResult.rdf");
        if (tempResult.exists()) {
            tempResult.delete();
        }
        try {
            tempResult.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void initialise() throws Exception {

    }


    @Override
    public void dispose() throws Exception {

    }


}
