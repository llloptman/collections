package domain;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Issue {
    private int id;
    private String name;
    private HashSet<User> author = new HashSet<>() ;
    private HashSet<Label> label = new HashSet<>();
    private HashSet<Project> project = new HashSet<>();
    private String milestones;
    private HashSet<User> assignee = new HashSet<>() ;
    private boolean isOpen;

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

    public HashSet<User> getAuthor() {
        return author;
    }

    public void setAuthor(HashSet<User> author) {
        this.author = author;
    }

    public HashSet<Label> getLabel() {
        return label;
    }

    public void setLabel(HashSet<Label> label) {
        this.label = label;
    }

    public HashSet<Project> getProject() {
        return project;
    }

    public void setProject(HashSet<Project> project) {
        this.project = project;
    }

    public String getMilestones() {
        return milestones;
    }

    public void setMilestones(String milestones) {
        this.milestones = milestones;
    }

    public HashSet<User> getAssignee() {
        return assignee;
    }

    public void setAssignee(HashSet<User> assignee) {
        this.assignee = assignee;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
