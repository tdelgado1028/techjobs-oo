package org.launchcode.models.forms;

import org.launchcode.models.CoreCompetency;
import org.launchcode.models.Employer;
import org.launchcode.models.Location;
import org.launchcode.models.PositionType;
import org.launchcode.models.data.JobData;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;

/**
 * Created by LaunchCode
 */
public class JobForm {

    @NotNull
    @Size(min=1, message = "Name may not be empty")
    private String name;

    @NotNull (message = "Employer may not be empty")
    private int employerId;

    @NotNull (message = "Location may not be empty")
    private int locationId;

    @NotNull (message = "Core Competency may not be empty")
    private int coreCompetencyId;

    @NotNull (message = "Position Type may not be empty")
    private int positionTypeId;

    /*
        Included other fields needed to create a job,
            //ref JobData.java -- employer, location, coreCompetency, positionType
            // + JobFieldData.java -- int values
        with correct validation attributes and display names.
            //@NotNulls -- employerId, locationId, coreCompetencyId, positionTypeId
        TODO #3 - Included other fields needed to create a job,
        with correct validation attributes and display names.
        Don't forget to add getters and setters
            //see below/end for getters/setters (rghtclk "Generate" // Alt+Insert)
     */

    private ArrayList<Employer> employers;
    private ArrayList<Location> locations;
    private ArrayList<CoreCompetency> coreCompetencies;
    private ArrayList<PositionType> positionTypes;

    public JobForm() {

        JobData jobData = JobData.getInstance();

        /*
            TODO #4 - populate the other ArrayList collections needed in the view
                // rinse and repeat for employers -- locations, coreCompetencies, positionTypes
        */

        employers = jobData.getEmployers().findAll();
        locations = jobData.getLocations().findAll();
        coreCompetencies = jobData.getCoreCompetencies().findAll();
        positionTypes = jobData.getPositionTypes().findAll();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployerId() {
        return employerId;
    }

    public void setEmployerId(int employerId) {
        this.employerId = employerId;
    }

    //getters/setters for #3
    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getCoreCompetencyId() {
        return coreCompetencyId;
    }

    public void setCoreCompetencyId(int coreCompetencyId) {
        this.coreCompetencyId = coreCompetencyId;
    }

    public int getPositionTypeId() {
        return positionTypeId;
    }

    public void setPositionTypeId(int positionTypeId) {
        this.positionTypeId = positionTypeId;
    }
    // END getters/setters for #3

    public ArrayList<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(ArrayList<Employer> employers) {
        this.employers = employers;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    public ArrayList<CoreCompetency> getCoreCompetencies() {
        return coreCompetencies;
    }

    public void setCoreCompetencies(ArrayList<CoreCompetency> coreCompetencies) {
        this.coreCompetencies = coreCompetencies;
    }

    public ArrayList<PositionType> getPositionTypes() {
        return positionTypes;
    }

    public void setPositionTypes(ArrayList<PositionType> positionTypes) {
        this.positionTypes = positionTypes;
    }
}
