package hyreader.hyevent.domain;

import javax.persistence.*;

/**
 * Created by HYU on 2015-08-20.
 */
@Entity
//@Table(name = "HY_EVENT")
public class HyEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long eventSeq;
    private String year;
    private String term;
    private String category;
    //@Column (name="event_name")
    private String eventName;
    //@Column (name="application_Sdate")
    private String applicationSdate;
    //@Column (name="application_Edate")
    private String applicationEdate;
    //@Column (name="event_Sdate")
    private String eventSdate;
    //@Column (name="event_Edate")
    private String eventEdate;
    private Boolean teamYn;
    private String department;
    //@Column (name="create_date")
    private String createDate;

    public long getEventSeq() {
        return eventSeq;
    }

    public void setEventSeq(long eventSeq) {
        this.eventSeq = eventSeq;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getApplicationSdate() {
        return applicationSdate;
    }

    public void setApplicationSdate(String applicationSdate) {
        this.applicationSdate = applicationSdate;
    }

    public String getApplicationEdate() {
        return applicationEdate;
    }

    public void setApplicationEdate(String applicationEdate) {
        this.applicationEdate = applicationEdate;
    }

    public String getEventSdate() {
        return eventSdate;
    }

    public void setEventSdate(String eventSdate) {
        this.eventSdate = eventSdate;
    }

    public String getEventEdate() {
        return eventEdate;
    }

    public void setEventEdate(String eventEdate) {
        this.eventEdate = eventEdate;
    }

    public Boolean getTeamYn() {
        return teamYn;
    }

    public void setTeamYn(Boolean teamYn) {
        this.teamYn = teamYn;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
