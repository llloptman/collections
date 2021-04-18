package domain;

import java.util.HashSet;
import java.util.Set;
import java.util.Set;

public class Issue {
    private int id;
    private String name;
    private User author = new User();
    private Set<Label> label = new HashSet<>();
    private Set<Project> project = new HashSet<>();
    private String milestones;
    private User assignee = new User() ;
    private boolean isOpen;

    public Issue(int id, String name, User author, Set<Label> label, Set<Project> project, String milestones, User assignee, boolean isOpen) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.label = label;
        this.project = project;
        this.milestones = milestones;
        this.assignee = assignee;
        this.isOpen = isOpen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Set<Label> getLabel() {
        return label;
    }

    public void setLabel(Set<Label> label) {
        this.label = label;
    }

    public Set<Project> getProject() {
        return project;
    }

    public void setProject(Set<Project> project) {
        this.project = project;
    }

    public String getMilestones() {
        return milestones;
    }

    public void setMilestones(String milestones) {
        this.milestones = milestones;
    }

    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
