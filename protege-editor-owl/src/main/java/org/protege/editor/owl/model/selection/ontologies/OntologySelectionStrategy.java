package org.protege.editor.owl.model.selection.ontologies;

import org.semanticweb.owlapi.model.OWLOntology;

import java.util.Set;

/**
 * Author: drummond<br>
 * http://www.cs.man.ac.uk/~drummond/<br><br>

 * The University Of Manchester<br>
 * Bio Health Informatics Group<br>
 * Date: Jun 6, 2008<br><br>
 */
public interface OntologySelectionStrategy {

    Set<OWLOntology> getOntologies();

    String getName();
}
