/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;
import javax.inject.Named;
import jpa.entities.Athlete;
import jpa.session.AthleteFacade;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author Anton
 */
@ManagedBean
@Named("athleteImages")
@ApplicationScoped
public class AthleteImages {

    @EJB
    private AthleteFacade service;

    public StreamedContent getImage() throws IOException {
        FacesContext context = FacesContext.getCurrentInstance();

        if (context.getCurrentPhaseId() == PhaseId.RENDER_RESPONSE) {
            // So, we're rendering the HTML. Return a stub StreamedContent so that it will generate right URL.
            return new DefaultStreamedContent();
        }
        else {
            // So, browser is requesting the image. Return a real StreamedContent with the image bytes.
            String athleteId = context.getExternalContext().getRequestParameterMap().get("athleteId");
            Athlete athlete = service.find(Long.valueOf(athleteId));
            return new DefaultStreamedContent(new ByteArrayInputStream(athlete.getImage()));
        }
    }

}